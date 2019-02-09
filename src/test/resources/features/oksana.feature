@project

Feature: BRITE ERP search
  Scenario: BRITE ERP search test for product General information
    Given User is on the BRITE ERP login page
    And   User should enter valid email
    And   User should enter valid password
    And   User should click Log In button
    Then  User clicks Inventory
    Then  User clicks Product Moves module
    Then  User selects product from the Product Table
    When  User clicks Product Name
    Then  User should verify General Information Table for the Product
