# SpriteCloud Automation

## Installation
You need to have JDK 1.8 and Maven installed.

## Run and Debug
We have to put the tags what we want to run, for example:

```
mvn clean test -DforkCount=0 "-Dcucumber.filter=-tags @regression"
```

## Browsers
Defaulst runs with Chrome, if we want to run with Firefox/Edge we have to run the next command:

```
mvn clean test -Pfirefox
```

## Run Pipelines
I did it with GitHub, but if want to run it in another CI/CD, its too generic, only have to do a docker-compose doing the next command:

```
mvn clean test -Dcucumber.filter=-tags ${ENVIROMENT_TAG}"
```

## Technologies used:
* Java jdk 1.8
* Maven
* Selenium
* TestNG
* Cucumber
* Log4j
* Bonigarcia (Allows to get the browser driver and set up the configuration)

## Reports
The report, once we run the test, are located in target/cucumber-reports or in the maven report: reports/cucumber-reports

## Project structure

```
	.
├── main
│   ├── java
│   │   └── com
│   │       └── spritecloud
│   │               ├── core
|   |		    |	|   |   |   |   └── DiverService.java     (manage the driver instance)
|   |		    |	|   |   |   |   └── ProjectType.java      (different types of project)
|   |		    |	|   |   |   |   └── PropertyManager.java  (loads properties - config.properties)
│   │               ├── steps
|   |		    |	|   |   |   |   └── CommonSteps.java
|   |		    |	|   |   |   |   └── HomeSteps.java
│   │               ├── pages (interactions with the views)
│   │               │   └── HomePage.java
│   │               └── PageCommons
│   │               |   └── PageCommons.java
│   │               └── services (All the services where made the request and validations)
│   │                   └── createListService.java
│   │                   └── deletePetIDService.java
│   │                   └── inventoryService.java
│   │                   └── MethodsService.java
│   │                   └── putUserNameService.java
│   │                   └── updateImagePetService.java
 
    
│   └── resources (cucumber options, log4 and project configs)
│       └── config.properties
│       └── cucumber.properties
│       └── log4j.properties
└── test
    ├── java
    │   └── com
    │       └── spritecloud (hooks of cucumber - before and after)
    │           └── Hooks.java
    │           └── TestNGRunners.java
    └── resources
        └── features (files with the scenarios and gherkin)
        │   └── Apitest.feature
        │   └── FrontEnd.feature
        └── image 
            └── dog.jpg
        └── json.request 
            └── createWithList.json
            └── deletePetID.json
            └── putUserName.json
            └── storeInventory.json
            └── updateImagePet.json
```

## Explanation
My goal was to try to make everything as generic as possible. Take cases where in all the projects I have been in it is used a lot, such as in API to load a file, or in FrontEnd to make forms or get alerts.
Try to add the most complex cases as there are many ways to do it.

## AddInformation
I want to mention that there is an API case, DELETE is commented, since when eliminating it, it returns 404. Try with other IDs, but it always returns the same.
Also clarify that when you want to run the pipelines with Chrome Headless, there are cases that fail, such as the slider, etc.