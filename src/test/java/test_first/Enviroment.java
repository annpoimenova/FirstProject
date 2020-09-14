package test_first;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enviroment {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/anna.poimenova/IdeaProjects/FirstProject/src/test/java/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }
}
