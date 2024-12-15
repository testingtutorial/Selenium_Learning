package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lottiefiles.com/blog/design-inspiration/deep-dive-into-hover-effects");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement products = driver.findElement(By.xpath("//div[@id=\"Products\"]"));

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(products).build().perform();

        WebElement lotties = driver.findElement(By.xpath("//img[@alt=\"LottieFiles Platform\"]"));

        actions.click(lotties).build().perform();

        //lotties.click();

        WebElement pricing = driver.findElement(By.xpath("//a[@href=\"/pricing\"]"));

        actions.contextClick(pricing).build().perform();



    }
}
