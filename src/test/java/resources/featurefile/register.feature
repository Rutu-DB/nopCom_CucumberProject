Feature: Register
  As a User I want to register into nopCommere website

  Scenario: User should navigate to registration page successfully
    Given : I am on home page
    When : I click on register link
    Then : I should navigate to registration page

  Scenario: Verify user should register successfully
    Given : I am on home page
    When : I click on register link
    Then : I should navigate to registration page
    And : I click on Gender button
    And : I enter First Name
    And : I enter Last Name
    And : I select Date
    And : I select Month
    And : I select Year
    And : I enter Email Id
    And : I enter Company Name
    And : I click on Newsletter check box
    And : I enter Password
    And : I enter Confirm Password
    And : I click on Register Button
    Then : I should Register Successfully

