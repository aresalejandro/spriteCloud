$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ApiTest.feature");
formatter.feature({
  "name": "Sprite Cloud API Automation Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Scenarios Apis \u003centity\u003e",
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
    }
  ]
});
formatter.scenario({
  "name": "Scenarios Apis INVENTORY",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@regression"
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
  "name": "Scenarios Apis CREATELIST",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@regression"
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
  "name": "Scenarios Apis PUTUSERNAME",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    },
    {
      "name": "@regression"
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
      "name": "@regression"
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
formatter.uri("file:src/test/resources/features/FrontEnd.feature");
formatter.feature({
  "name": "Sprite Cloud Web Automation Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Scenario Text Box",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@TextBox"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Elements box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.elementBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select Text Box and complete the form",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.textBoxAndCompleteForm()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Check Box",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@CheckBox"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Elements box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.elementBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select Check Box",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.checkBox()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Web Table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@WebTable"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Elements box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.elementBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select Web Table",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.webTable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Upload File",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@UploadFile"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Elements box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.elementBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select Upload File",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.uploadFile()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Scenario Alerts \u003ccaseType\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Alert"
    }
  ]
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.step({
  "name": "The user go to Alerts box",
  "keyword": "When "
});
formatter.step({
  "name": "The user select alert: \u003ccaseType\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "caseType"
      ]
    },
    {
      "cells": [
        "TIMER"
      ]
    },
    {
      "cells": [
        "PROMPT"
      ]
    },
    {
      "cells": [
        "CONFIRM"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Scenario Alerts TIMER",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@Alert"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Alerts box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.alertBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select alert: TIMER",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.alertTypes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Alerts PROMPT",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@Alert"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Alerts box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.alertBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select alert: PROMPT",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.alertTypes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Alerts CONFIRM",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@Alert"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Alerts box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.alertBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select alert: CONFIRM",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.alertTypes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario New Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@NewTab"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Alerts box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.alertBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select new tab",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.newTab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario New Tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@Slider"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Widgets box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.widgets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select Slider",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.slider()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Progress Bar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@ProgressBar"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Widgets box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.widgets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select Progress Bar",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.progressBar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario Dragabble",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FrontEnd"
    },
    {
      "name": "@seleniumTest"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@Dragabble"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Home view is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.homeView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to Interactions box",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.interactions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select Dragabble",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.dragaBble()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});