package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeConcept {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        driver.switchTo().frame("singleframe");

        Thread.sleep(2000);

        WebElement inputText = driver.findElement(By.xpath("//input"));
        inputText.sendKeys("Frames");

        //driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        WebElement frame = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));

        driver.switchTo().frame(frame);

        Thread.sleep(2000);

        WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));

        driver.switchTo().frame(singleFrame);

        Thread.sleep(2000);

        inputText.sendKeys("Multiple Frames");


    }
}
