$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/merve.feature");
formatter.feature({
  "name": "select functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "select products from Master Data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@select"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to BriteErp.com main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MervesSteps.user_goes_to_BriteErp_com_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user chooses valid url and click",
  "keyword": "And "
});
formatter.match({
  "location": "MervesSteps.user_chooses_valid_url_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials and logs in",
  "keyword": "And "
});
formatter.match({
  "location": "MervesSteps.user_enters_valid_credentials_and_logs_in()"
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
  "name": "user should choose Inventory section",
  "keyword": "And "
});
formatter.match({
  "location": "MervesSteps.user_should_choose_Inventory_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the product tab.",
  "keyword": "Then "
});
formatter.match({
  "location": "MervesSteps.user_clicks_the_product_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select any random products from the product list.",
  "keyword": "Then "
});
formatter.match({
  "location": "MervesSteps.user_select_any_random_products_from_the_product_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see the details of the selected product on the nex page.",
  "keyword": "And "
});
formatter.match({
  "location": "MervesSteps.user_can_see_the_details_of_the_selected_product_on_the_nex_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});