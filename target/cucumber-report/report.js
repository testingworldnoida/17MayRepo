$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EndToEndPurchaseUsingDebitCard.feature");
formatter.feature({
  "line": 1,
  "name": "Test End to End Items purchase functionality using credit card",
  "description": "",
  "id": "test-end-to-end-items-purchase-functionality-using-credit-card",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Search and Purchase electrnic item and pay using credit card",
  "description": "",
  "id": "test-end-to-end-items-purchase-functionality-using-credit-card;test-search-and-purchase-electrnic-item-and-pay-using-credit-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User should get welcome message",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters data in search box",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationActionStep.user_is_on_login_page()"
});
formatter.result({
  "duration": 3272146100,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.user_enters_username()"
});
formatter.result({
  "duration": 11900,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.user_enters_password()"
});
formatter.result({
  "duration": 10100,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 13400,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.user_should_be_logged_in()"
});
formatter.result({
  "duration": 9300,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.user_should_get_welcome_message()"
});
formatter.result({
  "duration": 7800,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.user_enters_data_in_search_box()"
});
formatter.result({
  "duration": 7200,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.user_clicks_on_Search_button()"
});
formatter.result({
  "duration": 7300,
  "status": "passed"
});
formatter.match({
  "location": "AutomationActionStep.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 7300,
  "status": "passed"
});
});