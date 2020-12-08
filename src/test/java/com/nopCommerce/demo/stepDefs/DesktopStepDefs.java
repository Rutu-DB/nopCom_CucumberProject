package com.nopCommerce.demo.stepDefs;

import com.nopCommerce.demo.pages.DesktopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DesktopStepDefs {
    DesktopPage desktopPage = new DesktopPage();

    @Given("^: I am on Computer Page$")
    public void iAmOnComputerPage() {
        desktopPage.clickOnComputerLink();
    }

    @And("^: I click on Desktop Link$")
    public void iClickOnDesktopLink() {
        desktopPage.clickDesktopLink();
    }

    @And("^: I sort products list as Z to A$")
    public void iSortProductsListAsZToA() {
        desktopPage.sortProductsOrderByZToA();
    }

    @And("^:  I sprt products list back to A to z$")
    public void iSprtProductsListBackToAToZ() {
        desktopPage.deskTopPageAction();
    }

    @And("^: I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() {
        desktopPage.clickonAddToCartBtn();
    }

    @Then("^: I should be able to navigate to Build Your Computer Page$")
    public void iShouldBeAbleToNavigateToBuildYourComputerPage() {
        String actual = desktopPage.actualMessageBuildYourOwnDesktop();
        Assert.assertEquals("Build your own computer", actual);
    }


}
