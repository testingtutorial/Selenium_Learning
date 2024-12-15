package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        WebElement openNewSeparateTab = driver.findElement(By.partialLinkText("Open New Seperate"));
        openNewSeparateTab.click();

        WebElement clickButton = driver.findElement(By.xpath("//button[@onclick=\"newwindow()\"]"));
        clickButton.click();

        Thread.sleep(3000);

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext())
        {
            String childWindow = itr.next();

            if(!parentWindow.equals(childWindow))
            {
                driver.switchTo().window(childWindow);
                System.out.println(driver.switchTo().window(childWindow));
            }
        }

        driver.switchTo().window(parentWindow);

        driver.quit();

    }
}
