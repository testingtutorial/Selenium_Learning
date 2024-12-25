package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class DifferentActions {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
//        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        searchBox.sendKeys("Books");

        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator itr = cookies.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //WebElement register = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("FirstName");

        String value = firstName.getDomAttribute("type");
        System.out.println("Attribute Value: "+value);

        String tag = firstName.getTagName();
        System.out.println("Tag: "+tag);

        WebElement lastName = driver.findElement(By.name("customer.lastName"));
        lastName.sendKeys("LastName");

        WebElement address = driver.findElement(By.xpath("//input[contains(@id,\"customer.address.street\")]"));
        address.sendKeys("Address");

        WebElement city = driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]"));
        city.sendKeys("city");

        WebElement state = driver.findElement(By.xpath("//input[@id=\"custaomer.address.state\" or @name=\"customer.address.state\"]"));
        state.sendKeys("state");

        WebElement zipCode = driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]"));
        zipCode.sendKeys("zipcode");

        WebElement phone = driver.findElement(By.cssSelector("input[id=\"customer.phoneNumber\"]"));
        phone.sendKeys("phone");

        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("ssn");

        WebElement userName = driver.findElement(By.id("customer.username"));
        userName.sendKeys("username");

        WebElement password = driver.findElement(By.id("customer.password"));
        password.sendKeys("password");

        WebElement confirmPassword = driver.findElement(By.id("repeatedPassword"));
        confirmPassword.sendKeys("password");




        WebElement solutionLink = driver.findElement(By.className("Solutions"));
        solutionLink.click();

        WebElement heading = driver.findElement(By.tagName("h1"));
        String header = heading.getText();
        System.out.println(header);

        WebElement forgotLogin = driver.findElement(By.partialLinkText("Forgot"));
        //forgotLogin.click();

    }
}
