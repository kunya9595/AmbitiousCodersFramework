
  Feature: Operations section

    @InvAdj
    Scenario: Item creation under Inventory Adjustment with valid credentials
      Given User is on the home page "url",
      And Click BriteErpDemo,
      And Click Sign in button,
      And Enter email ,
      And Enter password,
      And click Log in
      Then Click Inventory button
      Then Click Inventory Adjustment under Operations
      Then Click Create button
      Then Enter Inventory Reference
      Then Choose Select products manually
      Then Enter Date "03/27/2019"
      Then Click Save button



