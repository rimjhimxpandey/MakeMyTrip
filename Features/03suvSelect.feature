
Feature: To Get the Suv car prices and fetch lowest one

  Scenario: Fetch lowest SUV price
    Given Cab List page for given search conditions is displayed
    When Select SUV and display prices
    Then Lowest price is fetched
    

  