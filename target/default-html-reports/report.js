$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userStory1.feature");
formatter.feature({
  "name": "Visiting store front and viewing the content",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User experience from \u003cmarket regions\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip1"
    }
  ]
});
formatter.step({
  "name": "A user from one of the \"\u003cmarket regions\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "The user visits the store front\"\u003cmarket regions\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "They should be able to view the content related to the \"\u003cmarket regions\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "market regions"
      ]
    },
    {
      "cells": [
        "United Kingdom"
      ]
    },
    {
      "cells": [
        "France"
      ]
    },
    {
      "cells": [
        "Italy"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User experience from United Kingdom",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user from one of the \"United Kingdom\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.aUserFromOneOfThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user visits the store front\"United Kingdom\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.theUserVisitsTheStoreFront(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "They should be able to view the content related to the \"United Kingdom\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.theyShouldBeAbleToViewTheContentRelatedToThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User experience from France",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user from one of the \"France\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.aUserFromOneOfThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user visits the store front\"France\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.theUserVisitsTheStoreFront(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "They should be able to view the content related to the \"France\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.theyShouldBeAbleToViewTheContentRelatedToThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User experience from Italy",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user from one of the \"Italy\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.aUserFromOneOfThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user visits the store front\"Italy\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.theUserVisitsTheStoreFront(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "They should be able to view the content related to the \"Italy\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.deBeers.stepDefinitions.firstUserStoryStepDef.theyShouldBeAbleToViewTheContentRelatedToThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});