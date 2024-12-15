package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcept {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement clickToElement = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));

        clickToElement.click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        //driver.switchTo().alert().accept();

        alert.accept();

        Thread.sleep(2000);

        WebElement secondTab = driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));

        secondTab.click();

        WebElement secondTabbutton = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));

        secondTabbutton.click();

        Thread.sleep(2000);

        alert.dismiss();

        Thread.sleep(2000);

        WebElement thirdTab = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
        thirdTab.click();

        WebElement thirdTabButton = driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
        thirdTabButton.click();

        Thread.sleep(2000);

        String text = alert.getText();

        System.out.println(text);

        alert.sendKeys("Learning Alert");

        Thread.sleep(2000);

        alert.accept();

    }
}
