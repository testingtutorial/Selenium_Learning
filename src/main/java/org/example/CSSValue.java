package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValue {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement frame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);

        Thread.sleep(2000);

        WebElement color = driver.findElement(By.xpath("//div[@id='red']/div"));
        String colour = color.getCssValue("background-color");
        String clip = color.getCssValue("background-clip");
        System.out.println(colour);
        System.out.println(clip);
    }
}
