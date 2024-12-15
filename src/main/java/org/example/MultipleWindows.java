package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        String parentWindow = driver.getWindowHandle();



            WebElement clickButton = driver.findElement(By.xpath("//a/button"));
        clickButton.click();

        Thread.sleep(3000);

        String childWindow = driver.getWindowHandle();

        driver.switchTo().window(parentWindow);

    }
}
