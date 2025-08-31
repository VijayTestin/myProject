@Login
Feature: Validating Login
@positive
  Scenario Outline: Login with valid credential
    Given User is on Login page
    And User clicking login button
    When User Enters Valid Email and Password <Email> and <Password>
    And User clicked signin button
    Then User should navigate to Rates Module

    Examples: 
      | Email       | Password     |
      |vijayt1@aggregateintelligence.in|Welcome@1234|
      | sindhusrees@aggregateintelligence.in | Welcome@1234 |
      
    
