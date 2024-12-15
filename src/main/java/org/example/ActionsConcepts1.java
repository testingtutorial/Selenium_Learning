package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcepts1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement rightClick = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));

        Actions actions = new Actions(driver);

        Thread.sleep(3000);

        actions.contextClick(rightClick).build().perform();

        WebElement quit = driver.findElement(By.xpath("//li/span[text()=\"Quit\"]"));

        Thread.sleep(3000);

        actions.click(quit).build().perform();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        WebElement doubleClick = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));

        Thread.sleep(3000);

        actions.doubleClick(doubleClick).build().perform();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();



    }
}
