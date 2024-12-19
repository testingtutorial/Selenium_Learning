package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
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
