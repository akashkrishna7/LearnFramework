package web;

import config.URLConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebBase {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the environment (e.g., "dev" or "prod") based on your configuration
        String environment = System.getProperty("test.environment", "dev");

        // Get the URL from the properties file
        String baseURL = URLConfig.getURLForEnvironment(environment);

        // path to the ChromeDriver executable file.
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options); // Using the instance variable 'driver'
        driver.get(baseURL);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
