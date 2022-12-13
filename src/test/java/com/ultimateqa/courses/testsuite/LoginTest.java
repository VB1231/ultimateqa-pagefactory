package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage ;
@BeforeMethod(alwaysRun = true)
public void inIT(){
    homePage = new HomePage();
    loginPage = new LoginPage();
}
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldOnLogin(){
        homePage.clickOnLogin();
        Assert.assertEquals(loginPage.getLoginText(),"Welcome Back!","not Verified");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessage(){
        homePage.clickOnLogin();
        loginPage.enterUserName("Prime@gmail.com");
        loginPage.enterPassword("Welcome");
        loginPage.clickOnSignIn();
        Assert.assertEquals(loginPage.getErrorMessage(),"Invalid email or password.","Not verify");
    }

}
