$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/shirin.feature");
formatter.feature({
  "name": "Managing inventory reports",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sorting the data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager goes to BriteErp.com main page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShirinsSteps.manager_goes_to_BriteErp_com_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager chooses valid url and click",
  "keyword": "And "
});
formatter.match({
  "location": "ShirinsSteps.manager_chooses_valid_url_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager enters valid credentials and logs in",
  "keyword": "And "
});
formatter.match({
  "location": "ShirinsSteps.manager_enters_valid_credentials_and_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Successful Message should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "ShirinsSteps.successful_Message_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager should choose Inventory section",
  "keyword": "And "
});
formatter.match({
  "location": "ShirinsSteps.manager_should_choose_Inventory_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager should choose under Reporting Inventory button and click",
  "keyword": "Then "
});
formatter.match({
  "location": "ShirinsSteps.manager_should_choose_under_Reporting_Inventory_button_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Current Inventory report",
  "keyword": "And "
});
formatter.match({
  "location": "ShirinsSteps.choose_Current_Inventory_report()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Retrieve the Inventory Quantities",
  "keyword": "And "
});
formatter.match({
  "location": "ShirinsSteps.click_on_Retrieve_the_Inventory_Quantities()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Press on Reserved button",
  "keyword": "Then "
});
formatter.match({
  "location": "ShirinsSteps.press_on_Reserved_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});