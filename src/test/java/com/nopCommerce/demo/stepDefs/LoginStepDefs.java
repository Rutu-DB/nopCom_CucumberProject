package com.nopCommerce.demo.stepDefs;

import com.nopCommerce.demo.pages.HomePage;
import com.nopCommerce.demo.pages.LoginPage;
import com.nopCommerce.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Utility util = new Utility();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
        homePage.verifyHomepageMessage();
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() throws InterruptedException {
        homePage.clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        loginPage.getLoginVerifyMessage();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String emailId) {
        loginPage.enterEmailId(emailId);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
    loginPage.getLoginSuccessfulMsg();
    }


    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String actualMessage)  {
        loginPage.getErrorMessage();
        Assert.assertEquals(actualMessage,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }


}
