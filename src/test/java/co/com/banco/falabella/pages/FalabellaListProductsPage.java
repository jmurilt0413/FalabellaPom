package co.com.banco.falabella.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FalabellaListProductsPage {

  protected WebDriver driver;

  public FalabellaListProductsPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnNextPage = By.xpath("//i[contains(@class,'csicon-arrow_right')]");
  private By btnSeePayBagShopping = By.id("linkButton");

  public FalabellaListProductsPage selectProduct(String product) throws InterruptedException {
    List<WebElement> lstarticles_1 = driver.findElements(By.xpath(
        "//b[@class='jsx-1423318988 title2 primary  jsx-3736277290 bold     pod-subTitle']"));
    while (!findProductInList(lstarticles_1, product)) {
      driver.findElement(btnNextPage).click();
      Thread.sleep(2000);
      lstarticles_1 = driver
          .findElements(By.xpath("//b[@class='jsx-1423318988 title2 primary  jsx-3736277290 bold     pod-subTitle']"));
    }
    clicBtnAddBag(product);

    return new FalabellaListProductsPage(driver);
  }

  private void clicBtnAddBag(String product) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    By article = By.xpath(
        "//div[contains(@class,'search-results-list')]//b[contains(text(),'"
            + product
            + "')]/ancestor::div[contains(@class,'search-results-list')]//a//div[contains(@class,'pod-action')]");
   wait.until(ExpectedConditions.presenceOfElementLocated(article)).click();
    new FalabellaListProductsPage(driver);

  }

  public FalabellaPayBagPage GoToBagPayShopping() {
    driver.findElement(btnSeePayBagShopping).click();
    return new FalabellaPayBagPage(driver);
  }

  private Boolean findProductInList(List<WebElement> elements, String product) {
    boolean result = false;
    for (WebElement element : elements) {
      if(element.getText().contains(product)){
        result=true;
        break;
      }
    }
    return result;
  }
}
