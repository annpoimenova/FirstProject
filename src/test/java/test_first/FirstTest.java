package test_first;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends Enviroment {

    @Test
    public void open_portal() {

        driver.get("https://www.youtube.com/watch?v=N8Rr7rVf1RA&feature=youtu.be");

    }
}
