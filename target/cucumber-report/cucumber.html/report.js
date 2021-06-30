$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/banktest.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "As a User I want to login to xyz bank website and perform different activities",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9710216300,
  "status": "passed"
});
formatter.scenario({
  "line": 80,
  "name": "User should withdraw money successfully",
  "description": "",
  "id": "bank-test;user-should-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 79,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "I am on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "I click on Bank Manager Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "I click on Add customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "I enter first name \"rogger\"",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "I enter last name \"binny\"",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "I enter post code \"UL1 2KY\"",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I click on Add customer Button",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "I click on alert message",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "I click on Open Account Tab",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I select customer which was added before",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "I select currency pound",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "I click on process button",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I click on created alert message",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "I click on home button",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "I click customer login tab",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "I select customer from list",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "I click on Deposit button",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "I enter amount \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "I click on deposit button after amount entered",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "I click on Withdrawl tab",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "I enter withdrawl amount \"50\"",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "I click on withdraw button",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "I should withdraw money successfully with message \"Transaction successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomertStepdefs.iAmOnLoginPage()"
});
formatter.result({
  "duration": 167569700,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomertStepdefs.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 866881300,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomertStepdefs.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 347654800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rogger",
      "offset": 20
    }
  ],
  "location": "AddCustomertStepdefs.iEnterFirstName(String)"
});
formatter.result({
  "duration": 457539200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "binny",
      "offset": 19
    }
  ],
  "location": "AddCustomertStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 1068502500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UL1 2KY",
      "offset": 19
    }
  ],
  "location": "AddCustomertStepdefs.iEnterPostCode(String)"
});
formatter.result({
  "duration": 1305213200,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomertStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 3172467900,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomertStepdefs.iClickOnAlertMessage()"
});
formatter.result({
  "duration": 54243200,
  "status": "passed"
});
formatter.match({
  "location": "OpenAcccountStepdefs.iClickOnOpenAccountTab()"
});
formatter.result({
  "duration": 176332600,
  "status": "passed"
});
formatter.match({
  "location": "OpenAcccountStepdefs.iSelectCustomerWhichWasAddedBefore()"
});
formatter.result({
  "duration": 729965000,
  "status": "passed"
});
formatter.match({
  "location": "OpenAcccountStepdefs.iSelectCurrencyPound()"
});
formatter.result({
  "duration": 355780400,
  "status": "passed"
});
formatter.match({
  "location": "OpenAcccountStepdefs.iClickOnProcessButton()"
});
formatter.result({
  "duration": 135895100,
  "status": "passed"
});
formatter.match({
  "location": "OpenAcccountStepdefs.iClickOnCreatedAlertMessage()"
});
formatter.result({
  "duration": 34242200,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogoutStepdefs.iClickOnHomeButton()"
});
formatter.result({
  "duration": 181123700,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogoutStepdefs.iClickCustomerLoginTab()"
});
formatter.result({
  "duration": 132966800,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogoutStepdefs.iSelectCustomerFromList()"
});
formatter.result({
  "duration": 573833300,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogoutStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 166739600,
  "status": "passed"
});
formatter.match({
  "location": "DepositStepdefs.iClickOnDepositButton()"
});
formatter.result({
  "duration": 331209400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 16
    }
  ],
  "location": "DepositStepdefs.iEnterAmount(String)"
});
formatter.result({
  "duration": 424159600,
  "status": "passed"
});
formatter.match({
  "location": "DepositStepdefs.iClickOnDepositButtonAfterAmountEntered()"
});
formatter.result({
  "duration": 152887400,
  "status": "passed"
});
formatter.match({
  "location": "WithdrawlStepdefs.iClickOnWithdrawlTab()"
});
formatter.result({
  "duration": 137664700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 26
    }
  ],
  "location": "WithdrawlStepdefs.iEnterWithdrawlAmount(String)"
});
formatter.result({
  "duration": 2224557100,
  "status": "passed"
});
formatter.match({
  "location": "WithdrawlStepdefs.iClickOnWithdrawButton()"
});
formatter.result({
  "duration": 154979200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction successful",
      "offset": 51
    }
  ],
  "location": "WithdrawlStepdefs.iShouldWithdrawMoneySuccessfullyWithMessage(String)"
});
formatter.result({
  "duration": 2094679000,
  "status": "passed"
});
});