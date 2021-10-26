# Swaglabs Automation

## Installation
You need to have JDK 1.8 and Maven installed.

## Run and Debug
We have to put the tags what we want to run, for example:

```
mvn clean test -DforkCount=0 "-Dcucumber.filter=-tags @SmokeTest"
```

## Browsers
Defaulst runs with Chrome, if we want to run with Firefox we have to run the next command:

```
mvn clean test -Pfirefox
```

## Technologies used:
* Java jdk 1.8
* Maven
* Selenium
* TestNG
* Cucumber
* Bonigarcia

## Reports
The report, once we run the test, are located in target/cucumber-reports

## Project structure

```
	.
├── main
│   ├── java
│   │   └── com
│   │       └── swaglabs
│   │               ├── core
|   |		    |	|   |   |   |   └── DiverService.java     (manage the driver instance)
|   |		    |	|   |   |   |   └── ProjectType.java      (different types of project)
|   |		    |	|   |   |   |   └── PropertyManager.java  (loads properties - config.properties)
│   │               ├── steps
|   |		    |	|   |   |   |   └── HomeSteps.java
|   |		    |	|   |   |   |   └── LoginSteps.java
│   │               ├── pages (interactions with the views)
│   │               │   └── HomePage.java
│   │               │   └── LoginPage.java
│   │               └── PageCommons
│   │                   └── PageCommons.java
│   └── resources (cucumber options, log4 and project configs)
│       └── config.properties
│       └── cucumber.properties
│       └── log4j.properties
└── test
    ├── java
    │   └── com
    │       └── swaglabs (hooks of cucumber - before and after)
    │           └── Hooks.java
    │           └── TestNGRunners.java
    └── resources
        └── features (files with the scenarios and gherkin)
            └── Home.feature
            └── Login.feature
```

## Testcases
The testcases are located in ./testCases.txt
