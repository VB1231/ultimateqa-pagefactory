package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Sign In")
    WebElement loginPage;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement loginText;
    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "user[password]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement signIn;
    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement errorMessage;

    public String getLoginText() {
        Reporter.log("Get text from login "+loginText.toString());
        return getTextFromElement(loginText);
    }

    public void enterUserName(String email) {
        Reporter.log("enter email"+emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("enter password"+passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public String getErrorMessage() {
        Reporter.log("login unsuccessful error message"+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void clickOnSignIn() {
        Reporter.log("click on sign in"+signIn.toString());
        clickOnElement(signIn);
    }

}
