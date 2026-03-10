Feature: home page functionality
  Scenario: validate user should be able to see logo aligned at top of webpage
    Given navigate to homepage
    And home page UI will come
    When user open homepage logo should be aligned at proper position
    Then logo should be in center at top of webpage

  Scenario: validate user should be able to search after clicking search bar
    Given navigate to homepage
    And click on search bar
    When user click on search button in search bar
    Then he should be able to search

  Scenario: validate user should get keyboard popup open after clicking on search bar
    Given navigate to homepage
    And click on search bar
    And user click on search button in search bar
    When we press search button
    Then keyboard popup should come

  Scenario: validate user should be able to see his/her profile
    Given navigate to homepage
    And click on myprofile icon
    When user click on myprofile button
    Then user personal profile should be accesible

  Scenario: validate user should be able to chat
    Given navigate to homepage
    And click on inbox icon
    And click on send messages
    When user click on send messages button
    Then he should be able to text anyone

  Scenario: validate user should be able to click on social media links of webpage
    Given navigate to homepage
    And scroll down
    And click on social media links
    When user click on social media links
    Then he should able to redirect on application social media handles

  Scenario: validate user should be able to see application contact details
    Given navigate to homepage
    And scroll down
    And click on contact us button
    When user click on contact button in the homepage
    Then he/she should be able to get contact details of the application

  Scenario Outline: validate user should be able to see application contact details
    Given navigate to homepage
    And scroll down
    And click on contact us button "<email id>" and "<conatct number>"
    When user click on contact button in the homepage
    Then he/she should be able to get contact details of the application
    Examples:
      |email id | conatct number |
      |xyz@gmail.com | 9087654321 |

  Scenario: validate user should be able to use services of the application
    Given navigate to homepage
    And click on services
    And navigate to use services button
    When user click on use services button in services field
    Then he should be able to use all services provided by the webpage

  Scenario Outline: validate user sould be able to change his/her profile photo
    Given navigate to homepage
    And click on change profile photo
    And add photo "<photo>"
    When user click on change profile photo
    Then he should be able to change his/her profile photo
    Examples:
      |photo |
      |xyz.jpeg |
