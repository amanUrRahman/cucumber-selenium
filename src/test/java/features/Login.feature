Feature: Application Login



  Scenario: Home Page default login
    Given User is on Home Page
    When User enter correct username and password
    Then User is logged in successfully


