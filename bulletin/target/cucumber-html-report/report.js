$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/itexps/features/acku.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#----------------------------------"
    },
    {
      "line": 2,
      "value": "# Empty Cucumber .feature file"
    },
    {
      "line": 3,
      "value": "#----------------------------------"
    }
  ],
  "line": 7,
  "name": "Validate IBG Bulletin Web App Test",
  "description": "",
  "id": "validate-ibg-bulletin-web-app-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Check Bulletin Web Page Features",
  "description": "",
  "id": "validate-ibg-bulletin-web-app-test;check-bulletin-web-page-features",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user is on bulletin homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enter name and email",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user select location",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter captcha and submit",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user closes web app",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_bulletin_homepage()"
});
formatter.result({
  "duration": 12862428500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_name_and_email()"
});
formatter.result({
  "duration": 8016652200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_location()"
});
formatter.result({
  "duration": 3155200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_captcha_and_submit()"
});
formatter.result({
  "duration": 89000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_closes_web_app()"
});
formatter.result({
  "duration": 103700,
  "status": "passed"
});
});