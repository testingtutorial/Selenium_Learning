package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcept {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement productsLink = driver.findElement(By.xpath("//ul[@class=\"leftmenu\"]/li/a[text()=\"Products\"]"));
        productsLink.click();

        WebElement languageDropDown = driver.findElement(By.xpath("//select[@class=\"gt_selector notranslate\"]"));

        Select select = new Select(languageDropDown);

        //select.selectByIndex(3);

        //select.selectByValue("en|fr");

        select.selectByVisibleText("Español");


    }
}
