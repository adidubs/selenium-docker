import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlipkartTest {
    private static final Logger logger = LoggerFactory.getLogger(FlipkartTest.class);

    @Test
    public void openFlipkart() {
        logger.info("Starting Flipkart Selenium test");
        System.out.println("Starting Flipkart Selenium test");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        logger.debug("Chrome options configured");
        System.out.println("Chrome options configured");

        WebDriver driver = new ChromeDriver(options);
        logger.info("ChromeDriver initialized");
        System.out.println("ChromeDriver initialized");
        driver.get("https://www.flipkart.com");
        logger.info("Navigated to Flipkart website");
        System.out.println("Navigated to Flipkart website");
        String title = driver.getTitle();
        logger.info("Page title: {}", title);
        System.out.println("Page title: " + title);
        driver.quit();
        logger.info("Browser closed");
        System.out.println("Browser closed.");
    }
}
