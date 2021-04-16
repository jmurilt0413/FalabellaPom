package co.com.banco.falabella.tests;

import co.com.banco.falabella.models.CellPhoneSummaryOrder;
import co.com.banco.falabella.pages.FalabellaDispatchPage;
import co.com.banco.falabella.pages.GoogleHomePage;
import co.com.banco.falabella.utils.enums.EnumUrls;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.TestHTMLReporter;

@Listeners(TestHTMLReporter.class)
public class FalabellaTest extends Hook {

  @Test
  public void ValidationOrderSummary() throws InterruptedException {
    CellPhoneSummaryOrder articleInitial = new CellPhoneSummaryOrder(
        "Celular Xiaomi Redmi Note 8 128GB", "XIAOMI", "1",
        "4919209", "749.800");
    GoogleHomePage googleHomePage = new GoogleHomePage(driver);
    FalabellaDispatchPage falabellaDispatchPage = new FalabellaDispatchPage(driver);
    driver.get(EnumUrls.getUrl("Google"));
    googleHomePage.searchPage("Falabella").selectPageFalabella().closeAd().closeAlertRegistry()
        .searchArticle("Celulares").selectProduct("Celular Xiaomi Redmi Note 8 128GB")
        .GoToBagPayShopping()
        .selectInsuranceCoverage("Asegura tu Pantalla").GoToDispach();
    Assert.assertEquals(articleInitial.toString(),
        falabellaDispatchPage.buildObjectCellPhone().toString());

  }
}
