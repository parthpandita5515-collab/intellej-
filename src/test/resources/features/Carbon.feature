Feature: crud API of carbon application
  Scenario Outline: validate user should be able to create data with valid username and password
    Given create the request body
    Then validate the response code "<responce code>"
    Examples:
      |responce code|
      |201          |