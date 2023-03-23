$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/FBTest.feature");
formatter.feature({
  "name": "login page of Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Checking Login functionality on FB",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch Browsers",
  "keyword": "Given "
});
formatter.step({
  "name": "Launch FB applications",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Username \"\u003cusername\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sheetalc818@gmail.com",
        "testing"
      ]
    },
    {
      "cells": [
        "testingtestdatablz@gmail.com",
        "testing123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking Login functionality on FB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch Browsers",
  "keyword": "Given "
});
formatter.match({
  "location": "Step4.setUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch FB applications",
  "keyword": "And "
});
formatter.match({
  "location": "Step4.lanuchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Username \"sheetalc818@gmail.com\" and Password \"testing\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step4.enter_the_Username_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking Login functionality on FB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch Browsers",
  "keyword": "Given "
});
formatter.match({
  "location": "Step4.setUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch FB applications",
  "keyword": "And "
});
formatter.match({
  "location": "Step4.lanuchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Username \"testingtestdatablz@gmail.com\" and Password \"testing123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Step4.enter_the_Username_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});