package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Sign In")
    WebElement loginPage;

    public void clickOnLogin() {
        Reporter.log("click on login page"+loginPage.toString());
        clickOnElement(loginPage);
    }
}
