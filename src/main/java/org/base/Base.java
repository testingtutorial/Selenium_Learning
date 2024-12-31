package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class Base {

    public static  Properties prop;
    public static WebDriver driver;

    public Base()
    {
        try {
            File file = new File("src/properties/config.properties");
            FileInputStream fis = new FileInputStream(file);
            prop = new Properties();
            prop.load(fis);
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
    }

    public static void initialize() {

        String browser = prop.getProperty("browser");
        if(browser.equals("chrome")) {

            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            //options.addArguments("--incognito");
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver(options);
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(ChromeOptions.CAPABILITY, options);
            System.out.println("Browser Name: "+dc.getBrowserName());
            System.out.println("Browser Version: "+dc.getBrowserVersion());
            System.out.println("Browser Capabilities :"+dc.getCapabilityNames());
            System.out.println("Platform "+dc.getPlatformName());

        } else if (browser.equals("gecko")) {
            System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
    }
}
