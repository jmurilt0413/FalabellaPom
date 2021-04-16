package co.com.banco.falabella.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FalabellaPayBagPage {

  protected WebDriver driver;

  public FalabellaPayBagPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnGoBuy = By.xpath("//div[@class='fb-order-status__cta']");
  private By lstInsuranceCoverage = By.xpath(
      "//*[@class='fb-warranty-dropdown fb-inline-dropdown__link js-inline-dropdown__link']");
  private By optionInsuranceCoverage = By
      .xpath("//*[@class='fb-inline-dropdown__item-link' and contains(text(),'{0}')]");

  public FalabellaPayBagPage selectInsuranceCoverage(String coverage) {
    By productoCoverage = By.xpath(
        "//*[@class='fb-inline-dropdown__item-link' and contains(text(),'"
            + coverage + "')]");
    driver.findElement(lstInsuranceCoverage).click();
    driver.findElement(productoCoverage).click();
    return new FalabellaPayBagPage(driver);
  }

  public FalabellaDispatchPage GoToDispach() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.presenceOfElementLocated(btnGoBuy)).click();
    return new FalabellaDispatchPage(driver);
  }
}
