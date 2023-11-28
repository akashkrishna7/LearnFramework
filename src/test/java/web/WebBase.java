package web;

import config.URLConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
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

        // Use WebDriverManager to setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get(baseURL);
        // Assign the driver instance to your instance variable if needed
        // this.driver = driver;
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
