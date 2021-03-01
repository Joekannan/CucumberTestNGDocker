@Login
Feature: User Login on website
  I want to use this template for my feature file

  @Smoke
  Scenario: Successful Login
    Given I am on the Home Page
    When I enter my "sampletest@gmail.com" and "test123"
    Then I should see the MyAccount page

  Scenario Outline: Successful Login
    Given I am on the Home Page
    When I enter my "<UserName>" and "<Password>"
    Then I should see the MyAccount page

    Examples: 
      | UserName                 | Password |
      | sampletest@gmail.com     | test123  |
      | regressiontest@gmail.com | test123  |
