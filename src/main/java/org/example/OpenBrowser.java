package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Books");

        //driver.close();

    }
}
