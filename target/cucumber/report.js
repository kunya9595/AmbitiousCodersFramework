$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/zeynals.feature");
formatter.feature({
  "name": "Operations section",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Item creation under Inventory Adjustment with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@InvAdj"
    }
  ]
});
formatter.step({
  "name": "User is on the home page \"url\",",
  "keyword": "Given "
});
formatter.match({
  "location": "ZeynalsSteps.user_is_on_the_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click BriteErpDemo,",
  "keyword": "And "
});
formatter.match({
  "location": "ZeynalsSteps.click_BriteErpDemo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Sign in button,",
  "keyword": "And "
});
formatter.match({
  "location": "ZeynalsSteps.click_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter email ,",
  "keyword": "And "
});
formatter.match({
  "location": "ZeynalsSteps.enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password,",
  "keyword": "And "
});
formatter.match({
  "location": "ZeynalsSteps.enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Log in",
  "keyword": "And "
});
formatter.match({
  "location": "ZeynalsSteps.click_Log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Inventory button",
  "keyword": "Then "
});
formatter.match({
  "location": "ZeynalsSteps.click_Inventory_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Inventory Adjustment under Operations",
  "keyword": "Then "
});
formatter.match({
  "location": "ZeynalsSteps.click_Inventory_Adjustment_under_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Create button",
  "keyword": "Then "
});
formatter.match({
  "location": "ZeynalsSteps.click_Create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Inventory Reference",
  "keyword": "Then "
});
formatter.match({
  "location": "ZeynalsSteps.enter_Inventory_Reference()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Select products manually",
  "keyword": "Then "
});
formatter.match({
  "location": "ZeynalsSteps.choose_Select_products_manually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Date \"03/27/2019\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ZeynalsSteps.enter_Date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "ZeynalsSteps.click_Save_button()"
});
formatter.result({
  "status": "passed"
});
});