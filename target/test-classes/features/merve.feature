Feature:select functionality

  @select
  Scenario:select products from Master Data

    Given user goes to BriteErp.com main page
    And user chooses valid url and click
    And user enters valid credentials and logs in
    Then Successful Message should appear
    And user should choose Inventory section
    Then user clicks the product tab.
    Then user select any random products from the product list.
    And user can see the details of the selected product on the nex page.
