package org.example;

import org.base.Base;
import org.pages.LoginPage;
import org.testng.annotations.*;

public class LoginTest extends Base {

    LoginPage loginPage;

    public LoginTest()
    {
        super();
    }

    @BeforeClass
    public void settingUp()
    {
        initialize();
        loginPage = new LoginPage();

    }

    @Test
    public void loginIntoApplication()
    {
        loginPage.login("user1","password");
    }
}
