$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ApiTest.feature");
formatter.feature({
  "name": "Sprite Cloud API Automation Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Scenarios Apis",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@apisTest"
    }
  ]
});
formatter.step({
  "name": "Execute the method \u0027\u003coperation\u003e\u0027 in \u0027\u003centity\u003e\u0027 with \u0027\u003cjsonFile\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "I will get the proper status code \u0027\u003cstatusCode\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "expected response is obtained in \u0027\u003centity\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "operation",
        "entity",
        "jsonFile",
        "statusCode"
      ]
    },
    {
      "cells": [
        "GET",
        "INVENTORY",
        "storeInventory",
        "200"
      ]
    },
    {
      "cells": [
        "POST",
        "CREATELIST",
        "createWithList",
        "200"
      ]
    },
    {
      "cells": [
        "PUT",
        "PUTUSERNAME",
        "putUserName",
        "200"
      ]
    },
    {
      "cells": [
        "DELETE",
        "DELETEPETID",
        "deletePetID",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Scenarios Apis",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@apisTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Execute the method \u0027GET\u0027 in \u0027INVENTORY\u0027 with \u0027storeInventory\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.executeGenericMethod(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will get the proper status code \u0027200\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperStatusCodeStatusCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected response is obtained in \u0027INVENTORY\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperResponseWithObject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenarios Apis",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@apisTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Execute the method \u0027POST\u0027 in \u0027CREATELIST\u0027 with \u0027createWithList\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.executeGenericMethod(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will get the proper status code \u0027200\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperStatusCodeStatusCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected response is obtained in \u0027CREATELIST\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperResponseWithObject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenarios Apis",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@apisTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Execute the method \u0027PUT\u0027 in \u0027PUTUSERNAME\u0027 with \u0027putUserName\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.executeGenericMethod(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will get the proper status code \u0027200\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperStatusCodeStatusCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected response is obtained in \u0027PUTUSERNAME\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperResponseWithObject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenarios Apis",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@apisTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Execute the method \u0027DELETE\u0027 in \u0027DELETEPETID\u0027 with \u0027deletePetID\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.executeGenericMethod(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will get the proper status code \u0027200\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperStatusCodeStatusCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected response is obtained in \u0027DELETEPETID\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.iWillGetTheProperResponseWithObject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Scenario Update Files",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@apisTest"
    }
  ]
});
formatter.step({
  "name": "Execute the method POST and Update File",
  "keyword": "Given "
});
formatter.step({
  "name": "I expected response with status code \u0027\u003cstatusCode\u003e\u0027 and validate message",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "statusCode"
      ]
    },
    {
      "cells": [
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Scenario Update Files",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@apisTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Execute the method POST and Update File",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.executeFileUpdateMethod()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expected response with status code \u0027200\u0027 and validate message",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.expectedStatusCodeAndValidateMenssage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});