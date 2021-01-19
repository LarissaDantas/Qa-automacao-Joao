package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class config {
    static WebDriver driver = null;

    public static WebDriver CreateWebDriver(String browser) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/config/chromedriver.exe");
        System.out.println("Browser: " + browser);

        if ("ff".equals(browser.toLowerCase()) || "firefox".equals(browser.toLowerCase())) {
            driver = new FirefoxDriver();
        } else if ("ch".equals(browser.toLowerCase()) || "chrome".equals(browser.toLowerCase())) {
            driver = new ChromeDriver();
        } else if ("ie".equals(browser.toLowerCase()) || "internetexplorer".equals(browser.toLowerCase())) {
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Invalid browser name " + browser);
            System.exit(0);
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;

    }
}
