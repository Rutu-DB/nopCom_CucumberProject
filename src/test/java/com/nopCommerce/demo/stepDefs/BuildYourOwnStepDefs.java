package com.nopCommerce.demo.stepDefs;

import com.nopCommerce.demo.pages.BuildYourComputerPage;
import com.nopCommerce.demo.pages.DesktopPage;
import com.nopCommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuildYourOwnStepDefs {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();

    @Given("^I am on Demo NopCommerce home page$")
    public void iAmOnDemoNopCommerceHomePage() {
        homePage.verifyHomepageMessage();
    }

    @And("^I click on Computer Link$")
    public void iClickOnComputerLink() {
        desktopPage.clickOnComputerLink();
    }

    @And("^I click on Desktop Link$")
    public void iClickOnDesktopLink() {
        desktopPage.clickDesktopLink();
    }

    @And("^I select Build Your Own Computer Product$")
    public void iSelectBuildYourOwnComputerProduct() {
        desktopPage.deskTopPageAction();
    }

    @And("^I click on Add to Cart button on for Build Your Own Computer Product$")
    public void iClickOnAddToCartButtonOnForBuildYourOwnComputerProduct() {
        desktopPage.clickonAddToCartBtn();
    }

    @And("^I select a Processor from Dropdown$")
    public void iSelectAProcessorFromDropdown() throws InterruptedException {
        buildYourComputerPage.buildYourOwnComputerSelectProcessor();
    }

    @And("^I select a RAM from Dropdown$")
    public void iSelectARAMFromDropdown() {
        buildYourComputerPage.buildYourOwnComputerSelectRAM();
    }

    @And("^I click on Vista Premium Os Radio Button$")
    public void iClickOnVistaPremiumOsRadioButton() throws InterruptedException {
        buildYourComputerPage.buildYourOwnComputerRadioButton();
    }

    @And("^I click on Software Commander Check Box$")
    public void iClickOnSoftwareCommanderCheckBox() throws InterruptedException {
        buildYourComputerPage.buildYourOwnComputerCheckBox();
    }

    @Then("^I verify that amount in total is \"([^\"]*)\"$")
    public void iVerifyThatAmountInTotalIs(String expAmount) throws InterruptedException {
        Assert.assertEquals(expAmount, buildYourComputerPage.actualAmountMessage());
    }

    @When("^I click to add to cart Build your own Computer page$")
    public void iClickToAddToCartBuildYourOwnComputerPage() throws InterruptedException {
        buildYourComputerPage.buildYourOwnComputerAddToCartBtn();
    }

    @Then("^I verify display pop message appears$")
    public void iVerifyDisplayPopMessageAppears() throws InterruptedException {
        buildYourComputerPage.notificationDisplay();
    }



}
