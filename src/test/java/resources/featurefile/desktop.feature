Feature: desktop

  Background:
    Given : I am on home page

  Scenario: User should navigate to Desktop Page Successfully

    Given : I am on Computer Page
    And : I click on Desktop Link
    And : I sort products list as Z to A
    And :  I sprt products list back to A to z
    And : I click on Add to Cart Button
    Then : I should be able to navigate to Build Your Computer Page

