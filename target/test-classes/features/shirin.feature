Feature: Managing inventory reports
  @smoke
  Scenario: Sorting the data

    Given Manager goes to BriteErp.com main page
    And Manager chooses valid url and click
    And Manager enters valid credentials and logs in
    Then Successful Message should appear
    And Manager should choose Inventory section
    Then Manager should choose under Reporting Inventory button and click
    And Choose Current Inventory report
    And Click on Retrieve the Inventory Quantities
    Then Press on Reserved button



