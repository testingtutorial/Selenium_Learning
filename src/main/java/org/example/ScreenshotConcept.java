package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotConcept {


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        String filePath = "C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\screenshot\\";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String time = dateFormat.format(new Date());
        String fileName = "file_"+ time + ".png";
        String fullPath = filePath + fileName;

        TakesScreenshot scn = (TakesScreenshot)driver;
        File source = scn.getScreenshotAs(OutputType.FILE);
        File target = new File(fullPath);
        FileHandler.copy(source,target);
    }
}
