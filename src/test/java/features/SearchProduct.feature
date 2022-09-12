Feature: Check the Search feature

  @Search @Smoke
  Scenario Outline: Search for the product through the search bar
    Given User is on Landing Page
    When User enters the product "<Product>" and clicks on search
    Examples:
    |Product|
    |Mobile |
    |Laptop|
    |USB Cable|