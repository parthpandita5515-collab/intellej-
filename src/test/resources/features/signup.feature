
Feature: signup functionality
    Scenario: validate user should be able to signup with valid credentials
        Given open the browser
        And enter the url
        And enter the credentials
        When user is clicking on signup button
        Then user should be able to signup successfully
        Then close the browser

    Scenario: validate error message when fields are blank
        Given open the browser
        And enter the url
        And click on signup link
        When user is clicking on signup link
        Then use should see error message for mandatory fields
        Then close the browser

    Scenario: validate error message for invalid email
        Given open the browser
        And enter the url
        And click n sign up link
        And enter name and password
        When user is clicking on signup button
        Then user should see error message for invalid email
        Then close the browser

    Scenario:validate password and confirm password mismatched
        Given open the browser
        And enter the url
        And click on signup link
        And enter name
        And enter email
        And enter password
        And enter wrong confirm password
        When user is clicking on signup
        Then user should see password mismatched message
        Then close the browser


    Scenario:validate email already exist
        Given open the browser
        And enter the url
        And click on sign up link
        And enter name
        And enter an already registered email
        And enter password
        When user uses an already existing email
        Then user should see email already exist email
        Then close the browser

    Scenario: validate successful redirection to login page
        Given open the browser
        And enter the url
        And click on signup link
        And enter the cred
        When user is clicking on signup button
        Then user should be directed to login page
        Then close the browser

    Scenario:validate signup button is disabled when there are empty field
        Given open the browser
        And enter the url
        And enter the credentials
        When user is clicking on signup button
        Then user should not be able to press it
        Then close the browser

    Scenario: validate conformation email s sent
        Given open the browser
        And enter the url
        And enter the credentials
        When user signup successfully
        Then user should Recieve email
        Then close the browser

    Scenario:validates spaces are not allowed in mandatory fields
        Given open the browser
        And enter the url
        And enter the credentials
        And click on sign up link
        And enter space in textFields
        When user is clicking on signup button
        Then user should see a error message
        Then close the browser

    Scenario:validate maximum password length
        Given open the browser
        And enter the url
        And enter a long password
        And enter confirm password
        When user is clicking on signup button
        Then user should see a error message
        Then close the browser







