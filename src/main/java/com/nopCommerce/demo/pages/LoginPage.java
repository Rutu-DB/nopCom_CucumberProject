package com.nopCommerce.demo.pages;

import com.nopCommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {
   // private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(css = "#Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement _welcomeText;

    @FindBy(xpath = "//div[@class = 'message-error validation-summary-errors']")
    WebElement _loginErrorMessage;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _verifyLoginPageMessage;

    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _verifyLoginSuccessfulMsg;

    public void enterEmailId(String email) {
        Reporter.log("Entering email address : " + email + " to email field : " + _emailField.toString() + "<br>");
        waitFor(2);
        clickOnElement(_emailField);
        waitFor(2);
        sendTextToElement(_emailField, email);
        log.info("Entering email address : " + email + " to email field : " + _emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " to password field : " + _passwordField.toString() + "<br>");
        clickOnElement(_passwordField);
        sendTextToElement(_passwordField, password);
        log.info("Entering password : " + password + " to password field : " + _passwordField.toString());
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button : " + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Clicking on login button : " + _loginBtn.toString());
    }

    public String getWelcomeText() {
        Reporter.log("Getting text from : " + _welcomeText.toString() + "<br>");
        log.info("Getting text from : " + _welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }

    public String getErrorMessage(){
        Reporter.log("Getting error text from " + _loginErrorMessage.toString() + "<br>" );
        log.info("Getting error text from " + _loginErrorMessage.toString());
        return getTextFromElement(_loginErrorMessage);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }

    public void getLoginVerifyMessage(){
        Reporter.log("Getting text from message : " + _verifyLoginPageMessage.toString() + "<br>");
        log.info("Getting text from : " + _verifyLoginPageMessage.toString());
        String actualMessage = getTextFromElement(_verifyLoginPageMessage);
        Assert.assertEquals("Welcome, Please Sign In!",actualMessage);
    }

    public void getLoginSuccessfulMsg(){
        Reporter.log("Getting text from message " + _verifyLoginSuccessfulMsg.toString() + "<br>");
        log.info("Getting text from " + _verifyLoginSuccessfulMsg.toString());
        String actualMessage = getTextFromElement(_verifyLoginPageMessage);
        Assert.assertEquals(actualMessage,"Welcome to our store");
    }

}
