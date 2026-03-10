
Feature: testingHomePage with BG KeyWord
  Background: login with valid credentials

  Scenario: login in sauceDemo
    Given click on login tab
    Given enter the username and password
    Then  clicking on login button


  @data
  Scenario Outline: verify user should be able to navigate to catalog tab
    Given click on the catalog
    Then choose a product
    Then add to cart the product
    Then click on add cart
    Then Validate the numbering on My Cart on clicking on Add to Cart button "<productTitle>"
    When click on checkout button
    Then Validate the title of checkout page "<expectedCheckoutPageTitle>"
    When User is clicking on checkout button
    Then Validate the title of Contact detail and payment page "<expectedPaymentDetailPageTitle>"
    When User is entering Contact Detail and Payment Detail
    And Click on Pay Now button
    Examples:
      |productTitle|expectedCheckoutPageTitle| expectedPaymentDetailPageTitle|
    |Black heels – Sauce Demo|Your Shopping Cart – Sauce Demo|Checkout - Sauce Demo    |



