Feature: Form Authentication Page

  Background: Open Form Authentication page
    Given I have navigated to the 'the-internet' "Form Authentication" page

  Scenario: Login without credentials
    When I click the Login button
    Then "Your username is invalid!" message banner is displayed

  Scenario: Login with valid username but no password
    When I enter a Username of "tomsmith"
    And I click the Login button
    Then "Your password is invalid!" message banner is displayed

  Scenario: Login with valid password and no username
    When I enter a Password of "SuperSecretPassword!"
    And I click the Login button
    Then "Your username is invalid!" message banner is displayed

  Scenario: Login with valid Username but invalid password
    When I enter a Username of "tomsmith"
    And I enter a Password of "Super!"
    And I click the Login button
    Then "Your password is invalid!" message banner is displayed

  Scenario: Login invalid Username but valid password
    When I enter a Username of "Ghada"
    And I enter a Password of "SuperSecretPassword!"
    And I click the Login button
    Then "Your hhhhh is invalid!" message banner is displayed

  Scenario: Login with valid credentials
    When I enter a Username of "tomsmith"
    And I enter a Password of "SuperSecretPassword!"
    And I click the Login button
    Then "You logged into a secure area!" message banner is displayed
