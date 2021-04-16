package co.com.banco.falabella.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FalabellaListProductsPage {

  protected WebDriver driver;

  public FalabellaListProductsPage(WebDriver driver) {
    this.driver = driver;
  }

  private By lblsearchArticle = By
      .xpath("//div[contains(@class,'search-results-list')]//b[contains(text(),'{0}')]");
  private By btnNextPage = By.xpath("//i[contains(@class,'csicon-arrow_right')]");
  private By btnAddPayBagArticle = By.xpath(
      "//div[contains(@class,'search-results-list')]//b[contains(text(),'{0}')]/ancestor::div[contains(@class,'search-results-list')]//a//div[contains(@class,'pod-action')]");
  private By btnSeePayBagShopping = By.id("linkButton");

  public FalabellaListProductsPage selectProduct(String product) {
    By article = By.xpath(
        "//div[contains(@class,'search-results-list')]//b[contains(text(), '"
            + product + "')]");
    while (!driver.findElement(article).isDisplayed()) {
      driver.findElement(btnNextPage).click();
    }
    clicBtnAddBag(product);

    return new FalabellaListProductsPage(driver);
  }

  private FalabellaListProductsPage clicBtnAddBag(String product) {
    By article = By.xpath(
        "//div[contains(@class,'search-results-list')]//b[contains(text(),'"
            + product
            + "')]/ancestor::div[contains(@class,'search-results-list')]//a//div[contains(@class,'pod-action')]");
    driver.findElement(article).click();
    return new FalabellaListProductsPage(driver);

  }


  public FalabellaPayBagPage GoToBagPayShopping(){
    driver.findElement(btnSeePayBagShopping).click();
    return new FalabellaPayBagPage(driver);
  }

}
