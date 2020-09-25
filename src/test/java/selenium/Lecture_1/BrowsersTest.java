package selenium.Lecture_1;

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

public class BrowsersTest {
    //All drivers are located in folder "C:\bin", which is added to PATH

    private static WebDriver chromeDriver;
    private static WebDriver firefoxDriver;
    private static WebDriver edgeDriver;
    private static WebDriver ieDriver;

    @BeforeAll
    public static void setUp() {

        chromeDriver = new ChromeDriver();
        firefoxDriver = new FirefoxDriver();
        ieDriver = new InternetExplorerDriver();
        System.setProperty("webdriver.edge.driver", "C:\\bin\\msedgedriver.exe"); // This line is useless for browser Edge Legacy (v.18.18363)
        edgeDriver = new EdgeDriver();
    }

    @AfterAll
    public static void tearDown() {

        chromeDriver.quit();
        firefoxDriver.quit();
        edgeDriver.quit();
        ieDriver.quit();
    }

    @Test
    public void chromeTest() {
        // chromeDriver = new ChromeDriver();

        chromeDriver.get("http://google.com");
        chromeDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

        //chromeDriver.quit();
    }

    @Test
    public void firefoxDriver(){
        //firefoxDriver = new FirefoxDriver();

        firefoxDriver.get("http://google.com");
        firefoxDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

        //firefoxDriver.quit();
    }

    @Test
    public void edgeDriver(){
        //System.setProperty("webdriver.edge.driver", "C:\\bin\\msedgedriver.exe");
        //edgeDriver = new EdgeDriver();

        edgeDriver.get("http://google.com");
        edgeDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

        //edgeDriver.quit();
    }

    @Test
    public void ieDriver(){
        // To successfully run IE:
        // Open Internet Options >> Switch to "Security" Tab
        //Select the "Internet" Zone and Select the Checkbox "Enable Protected Mode".
        //Apply this and do this for remaining 3 zones viz. "Local intranet", "Trusted sites" and "Restricted sites". After this, close the Internet Options and Restart Internet Explorer to get these changes reflected.

        //ieDriver = new InternetExplorerDriver();

        ieDriver.get("http://google.com");
        ieDriver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

        //ieDriver.quit();
    }

}


