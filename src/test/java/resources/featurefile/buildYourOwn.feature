Feature: buildYourOwn

  Scenario: User should navigate to Build your Own Computer Page successfully
    Given I am on Demo NopCommerce home page
    And  I click on Computer Link
    And  I click on Desktop Link
    And  I select Build Your Own Computer Product
    And I click on Add to Cart button on for Build Your Own Computer Product
    And I select a Processor from Dropdown
    And I select a RAM from Dropdown
    And I click on Vista Premium Os Radio Button
    And I click on Software Commander Check Box
    Then I verify that amount in total is "$1,475.00"
    When I click to add to cart Build your own Computer page
    Then I verify display pop message appears
