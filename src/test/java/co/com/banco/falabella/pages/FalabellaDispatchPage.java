package co.com.banco.falabella.pages;

import co.com.banco.falabella.models.CellPhoneSummaryOrder;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FalabellaDispatchPage {

  public FalabellaDispatchPage(WebDriver driver) {
    this.driver = driver;
  }

  protected WebDriver driver;

  private By lblReferencyCellPhone = By.xpath(
      "//*[@class='fbra_text fbra_test_orderSummary__itemProperty fbra_orderSummary__itemProperty__name']");
  private By lblBrandCellPhone = By.xpath(
      "//*[@class='fbra_text fbra_test_orderSummary__itemProperty fbra_orderSummary__itemProperty']");
  private By lblQuantityProducts = By.xpath(
      "//*[@class='fbra_text fbra_test_orderSummary__numberOfItems fbra_orderSummary__numberOfItems']/span");
  private By lblProductCode = By.xpath(
      "//*[@class='fbra_text fbra_orderSummary__itemProperty--no-capital fbra_test_orderSummary__quantity_and_sku']");
  private By lblTotalItemPrice = By.xpath(
      "//*[@class='fbra_text fbra_test_orderSummary__totalCostPrice fbra_orderSummary__totalCostPrice']");
  private By lblSummaryPrice = By.xpath(
      "//*[@class='fbra_text fbra_test_orderSummary__itemPrice fbra_orderSummary__itemPrice']");

  public CellPhoneSummaryOrder buildObjectCellPhone() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(lblSummaryPrice)).click();
    return new CellPhoneSummaryOrder(
        driver.findElement(lblReferencyCellPhone).getText(),
        driver.findElement(lblBrandCellPhone).getText(),
        driver.findElement(lblQuantityProducts).getText().replace("(", "")
            .replace(")", ""),
        driver.findElement(lblProductCode).getText().replace("Código: ", ""),
        driver.findElement(lblTotalItemPrice).getText().replace("$", ""));
  }
}
