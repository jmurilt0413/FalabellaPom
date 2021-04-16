package co.com.banco.falabella.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FalabellaHomePage {

  protected WebDriver driver;

  public FalabellaHomePage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnCloseAd = By.xpath("//*[@id= 'lightbox-close']");
  private By btnNoThanksAlertRegistry = By.xpath("//*[@id='acc-alert-deny']");
  private By txtSearch =By.xpath("//div[@class='flex-grow-1']//input[@data-testid='input-search-box']");
  private By lblArticle  =By.xpath("//a[@data-testid='first-suggestion']");

 public FalabellaHomePage closeAd(){
   driver.findElement(btnCloseAd).click();
   return this;
 }

  public FalabellaHomePage closeAlertRegistry(){
    driver.findElement(btnNoThanksAlertRegistry).click();
    return this;
  }

  public FalabellaListProductsPage searchArticle(String article){
   driver.findElement(txtSearch).sendKeys(article);
   driver.findElement(lblArticle).click();
   return new FalabellaListProductsPage(driver);
  }

}
