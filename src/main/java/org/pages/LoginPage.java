package org.pages;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage()
    {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="username")
    WebElement userName;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//input[@value=\"Log In\"]")
    WebElement loginButton;

    public void login(String user, String pass)
    {
        userName.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }


}
