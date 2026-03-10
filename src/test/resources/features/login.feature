Feature: login page functionality
@ToTest
  Scenario: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials
    When user is clicking on login button
    Then user should be able to navigate to homepage
    Then close the browser

  Scenario: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials "<parth>" and "<1234567890>"
    When user is clicking on login button
    Then user should be able to navigate to homepage
    Then close the browser

  Scenario Outline: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials "<username>" and "<password>"
    When user is clicking on login button
    Then user should be able to navigate to homepage
    Then close the browser
    Examples:
    |username|password|
    |parth   |1234567890|
