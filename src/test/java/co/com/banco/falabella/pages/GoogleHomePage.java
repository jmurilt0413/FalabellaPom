package co.com.banco.falabella.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

  public GoogleHomePage(WebDriver driver) {
    this.driver = driver;
  }

  protected WebDriver driver;

  private By txtGoogleSearch = By.xpath("//*[@title='Buscar']");
  private By linkFalabella = By.xpath("//*[@href='https://www.falabella.com.co/falabella-co/']");

  public GoogleHomePage searchPage(String page) {
  driver.findElement(txtGoogleSearch).sendKeys(page, Keys.ENTER);
  return this;
  }

  public FalabellaHomePage selectPageFalabella(){
    driver.findElement(linkFalabella).click();
    return new FalabellaHomePage(driver);
  }
}
