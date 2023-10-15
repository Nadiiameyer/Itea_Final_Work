Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome Browser
    When User open YAKABOO HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Login Button
    Then User verifies SignOut button is displayed
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with wrong password
    Given User launches Chrome Browser
    When User open YAKABOO HomePage
    And User clicks on Login link
    And User enters a valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Login Button
    Then User verifies Alert is appears
    And User quites browser
    Examples:
      | email                      | password   |
      | nadia.suworowa@hotmail.com | Cologne123 |
      | nadia.suworowa@hotmail.com | Cologne! |
      | nadia.suworowa@hotmail.com | 123! |