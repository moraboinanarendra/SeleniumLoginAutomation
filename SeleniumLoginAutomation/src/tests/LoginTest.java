package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest {

    @BeforeClass
    public void setUp() {
        BaseClass.launchBrowser();
    }

    @Test
    public void testLogin() {
        LoginPage login = new LoginPage(BaseClass.driver);
        login.loginToApp("admin", "admin123");
    }

    @AfterClass
    public void tearDown() {
        BaseClass.quitBrowser();
    }
}
