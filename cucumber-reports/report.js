$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:ash/purchase.feature");
formatter.feature({
  "name": "TestMeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "purchase headphone",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I enter username",
  "keyword": "When "
});
formatter.match({
  "location": "purchase.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "purchase.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "purchase.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "purchase headphone",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on Logout button",
  "keyword": "When "
});
formatter.match({
  "location": "purchase.i_click_on_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "And "
});
formatter.match({
  "location": "purchase.user_is_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "purchase headphone",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I Go to All \"categories\"",
  "keyword": "When "
});
formatter.match({
  "location": "purchase.i_Go_to_All(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Electronics",
  "keyword": "And "
});
formatter.match({
  "location": "purchase.i_navigate_to_Electronics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on HeadPhones and Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "purchase.click_on_HeadPhones_and_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the payment page is appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "purchase.the_payment_page_is_appeared()"
});
formatter.result({
  "status": "passed"
});
});