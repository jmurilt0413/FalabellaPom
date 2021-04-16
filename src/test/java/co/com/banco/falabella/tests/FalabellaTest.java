package co.com.banco.falabella.tests;

import static org.hamcrest.CoreMatchers.is;

import co.com.banco.falabella.models.CellPhoneSummaryOrder;
import co.com.banco.falabella.pages.FalabellaDispatchPage;
import co.com.banco.falabella.pages.GoogleHomePage;
import co.com.banco.falabella.utils.ReadFilePropierties;
import co.com.banco.falabella.utils.enums.EnumUrls;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FalabellaTest {

  private WebDriver driver;

  @Before
  public void setup() throws IOException {
    ReadFilePropierties fileProperties = new ReadFilePropierties();
    fileProperties.loadFile("./src/test/resources/file_configuration.properties");
    System.setProperty(fileProperties.getProperty("DRIVER_SETUP"),
        fileProperties.getProperty("PATH_DRIVER") + fileProperties.getProperty("DRIVER"));
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-maximized");
    driver = new ChromeDriver(chromeOptions);

  }

  @Test
  public void ValidationOrderSummary() {
    CellPhoneSummaryOrder articleInitial = new CellPhoneSummaryOrder("Celular Xiaomi Redmi Note 8 128GB", "XIAOMY", "1",
        "4919209", "749.800");
    CellPhoneSummaryOrder itemObtained;
    GoogleHomePage googleHomePage = new GoogleHomePage(driver);
    FalabellaDispatchPage falabellaDispatchPage = new FalabellaDispatchPage(driver);

    driver.get(EnumUrls.getUrl("Google"));
    googleHomePage.searchPage("Falabella").selectPageFalabella().closeAd().closeAlertRegistry()
        .searchArticle("Celulares").selectProduct("Celular Xiaomi Redmi Note 8 128GB")
        .selectInsuranceCoverage("Asegura tu Pantalla").GoToDispach();

    itemObtained = falabellaDispatchPage.buildObjectCellPhone();

    Assert.assertThat(articleInitial, is(itemObtained));


  }

}
