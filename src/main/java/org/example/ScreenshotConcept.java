package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotConcept {


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        TakesScreenshot scn = (TakesScreenshot)driver;
        File source = scn.getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\screenshot\\screenshot.png");
        FileHandler.copy(source,target);
    }
}
