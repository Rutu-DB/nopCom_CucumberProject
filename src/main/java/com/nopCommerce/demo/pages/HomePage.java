package com.nopCommerce.demo.pages;

import com.nopCommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registrationLink;

    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _getWelcomeMsg;

    //This method clicks on Login Link
    public void clickOnLoginLink() throws InterruptedException {
        Reporter.log("Clicking on login link : " + _loginLink.toString() + "<br>");
        waitFor(2);
        clickOnElement(_loginLink);
        log.info("Clicking on Login link : " + _loginLink.toString());
            }

    //This method clicks on Registration Link
    public void clickOnRegisterLink() {
        Reporter.log("Clicking on login link : " + _registrationLink.toString() + "<br>");
        clickOnElement(_registrationLink);
        log.info("Clicking on login link : " + _registrationLink.toString());
    }

    public void verifyHomepageMessage(){
        scrollToElement(_getWelcomeMsg);
        String actualMsg = getTextFromElement(_getWelcomeMsg);
        Assert.assertEquals(actualMsg,"Welcome to our store");
    }

}
