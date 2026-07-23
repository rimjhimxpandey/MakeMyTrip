
Feature: To capture the error message displayed if incorrect data is provided in gift card

  Scenario: To give invalid input to giftcard and fetch error message
    Given Navigate to the Gift card menu
    When click on gift card
    And fill the invalid details
    Then Error message is displayed


 