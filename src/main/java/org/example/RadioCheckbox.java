package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(3000);

        WebElement purple = driver.findElement(By.xpath("//input[@value=\"purple\"]"));


        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("arguments[0].scrollIntoView()",purple);

        WebElement redCheckbox = driver.findElement(By.xpath("//input[@value=\"red\"]"));
        boolean select = redCheckbox.isSelected();
        boolean display = redCheckbox.isDisplayed();
        boolean enable = redCheckbox.isEnabled();
        System.out.println("Checkbox is enabled for selection: "+enable);
        System.out.println("Checkbox is displayed: "+display);
        System.out.println("Checkbox is selected: "+select);

        redCheckbox.click();

        boolean select1 = redCheckbox.isSelected();

        Thread.sleep(300);

        System.out.println("After checking for selection: "+select1);


        js.executeScript("window.scrollBy(0,-500)");

        Thread.sleep(300);

        WebElement top = driver.findElement(By.xpath("//a[text()=\"TOP\"]"));

        js.executeScript("arguments[0].scrollIntoView()",top);

    }
}
