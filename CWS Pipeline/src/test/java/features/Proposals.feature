Feature: Proposal Validations

Background:
  Given I enter the URL using <"edge">

  Scenario: Create a proposal
    When I enter the username and password and click on login
    And i click on proposal option
    And I enter the Submit details of customer
    Then I see whether all necessary tiles are displayed

