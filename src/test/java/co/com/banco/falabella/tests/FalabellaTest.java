package co.com.banco.falabella.tests;

import co.com.banco.falabella.utils.ReadFilePropierties;
import java.io.IOException;
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
    chromeOptions.addArguments("--incognito");
    driver = new ChromeDriver(chromeOptions);

  }

  @Test
  public void ValidationOrderSummary() {


  }

}
