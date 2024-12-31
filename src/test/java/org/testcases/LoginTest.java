package org.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Base;
import org.pages.LoginPage;
import org.testng.annotations.*;

public class LoginTest extends Base {

    LoginPage loginPage;
    private static final Logger log = LogManager.getLogger(LoginTest.class);

    public LoginTest()
    {
        super();
    }

    @BeforeClass
    public void settingUp()
    {
        initialize();
        loginPage = new LoginPage();
        log.info("Initializing browser");
        log.error("Getting Error");

    }

    @Test
    public void loginIntoApplication()
    {
        loginPage.login("user1","password");
        log.info("Login into para soft bank application");
        log.debug("Debuging");
    }
}
