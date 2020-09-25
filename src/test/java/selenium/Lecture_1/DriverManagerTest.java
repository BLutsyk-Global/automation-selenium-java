package selenium.Lecture_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManagerTest {
    private static WebDriver wdChromeDriver;
    private static WebDriver wdFirefoxDriver;
    private static WebDriver wdIeDriver;
    private static WebDriver wdEdgeDriver;

    @BeforeAll

    public static void setUp() {

        //Chrome works good
        WebDriverManager.chromedriver().setup();
        wdChromeDriver = new ChromeDriver();

        //Firefox works good
        WebDriverManager.firefoxdriver().setup();
        wdFirefoxDriver = new FirefoxDriver();

        //IE11 - PASS
        WebDriverManager.iedriver().arch32().setup();
        wdIeDriver = new InternetExplorerDriver();

        //EdgeChromium v.85.0.564.51 (x64) - PASS
        //I didn't figured how to run Edge Legacy browser (v.18.18363) with Driver Manager from Bonigarcia.
        WebDriverManager.edgedriver().setup();
        wdEdgeDriver = new EdgeDriver();

    }

    @AfterAll
    public static void tearDown() {
        wdChromeDriver.quit();
        wdFirefoxDriver.quit();
        wdIeDriver.quit();
        wdEdgeDriver.quit();
    }

    @Test
    void ChromeDriverTest() {

        wdChromeDriver.get("http://google.com");
        wdChromeDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

    }

    @Test
    void FirefoxDriverTest() {

        wdFirefoxDriver.get("http://google.com");
        wdFirefoxDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

    }

    @Test
    void IeDriverTest() {

        wdIeDriver.get("http://google.com");
        wdIeDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

    }

    @Test
    void EdgeDriverTest() {

        wdEdgeDriver.get("http://google.com");
        wdEdgeDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

    }
}


