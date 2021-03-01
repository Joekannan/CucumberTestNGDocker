
@tag
Feature: Register Customer
  I want to use this template for my feature file

  @tag1
  Scenario: Register unique customer every time
    Given I am on the Home Page
    When I click Register
    And I enter required details
    Then I should see successful registration

  