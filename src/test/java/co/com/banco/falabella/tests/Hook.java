package co.com.banco.falabella.tests;

import co.com.banco.falabella.utils.ReadFilePropierties;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hook {

  protected WebDriver driver;

  @BeforeTest
  public void setup() throws IOException {
    String PATH_FILE = "./src/test/resources/file_configuration.properties";
    ReadFilePropierties fileProperties = new ReadFilePropierties();
    fileProperties.loadFile(PATH_FILE);
    System.setProperty(fileProperties.getProperty("DRIVER_SETUP"),
        fileProperties.getProperty("PATH_DRIVER") + fileProperties.getProperty("DRIVER"));
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-maximized");
    driver = new ChromeDriver(chromeOptions);
    driver.manage().timeouts().implicitlyWait(
        Duration.ofSeconds(Integer.parseInt(fileProperties.getProperty("IMPLICIT_WAIT"))));
  }

  @AfterTest
  public void closeNavigate() {
    driver.close();
  }
}
