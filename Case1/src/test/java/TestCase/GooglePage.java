package TestCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GooglePage {
    String SITE_URL = "https://www.google.com/";
    WebDriver driver;

    public void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void openGoogleCalculationPage() {
        driver.get(SITE_URL);
        driver.findElement(By.name("q")).sendKeys("Калькулятор");
        driver.findElement(By.className("gNO89b")).click();
    }

        @BeforeEach
        public void start() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @AfterEach
        public void finish() {
            driver.quit();
        }

    }
