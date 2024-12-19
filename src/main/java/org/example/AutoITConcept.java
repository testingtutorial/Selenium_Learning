package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AutoITConcept {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(5000);

        WebElement upload = driver.findElement(By.xpath("//div/button[@class='l3tlg0-0 ggoliT']"));
        upload.click();

        Thread.sleep(2000);

        //upload.sendKeys("C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\datasheet\\Register.xlsx");

        Runtime.getRuntime().exec("C:\\Users\\Administrator\\OneDrive\\Documents\\Autoit\\upload.exe");
    }
}
