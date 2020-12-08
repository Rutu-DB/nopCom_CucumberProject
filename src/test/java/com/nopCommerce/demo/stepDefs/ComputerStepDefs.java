package com.nopCommerce.demo.stepDefs;

import com.nopCommerce.demo.pages.ComputerPage;
import com.nopCommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerStepDefs {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    @Given("^: I am on Home Page$")
    public void iAmOnHomePage() {
        homePage.verifyHomepageMessage();
    }


    @When("^: I click on Computer Link$")
    public void iClickOnComputerLink() {
        computerPage.clickOnComputerLink();


    }

    @Then("^: I should navigate to Computer Page Successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
    String actual = computerPage.actualMessageComputer();
        Assert.assertEquals("Computers",actual);
    }


}
