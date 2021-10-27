@FrontEnd @seleniumTest @regression
Feature: Sprite Cloud Web Automation Test

  @TextBox
  Scenario: Scenario Text Box
    Given The Home view is displayed
    When The user go to Elements box
    Then The user select Text Box and complete the form

  @CheckBox
  Scenario: Scenario Check Box
    Given The Home view is displayed
    When The user go to Elements box
    Then The user select Check Box

  @WebTable
  Scenario: Scenario Web Table
    Given The Home view is displayed
    When The user go to Elements box
    Then The user select Web Table

  @UploadFile
  Scenario: Scenario Upload File
    Given The Home view is displayed
    When The user go to Elements box
    Then The user select Upload File

  @Alert
  Scenario Outline: Scenario Alerts <caseType>
    Given The Home view is displayed
    When The user go to Alerts box
    Then The user select alert: <caseType>

    Examples:
    | caseType|
    | TIMER   |
    | PROMPT  |
    | CONFIRM |

  @NewTab
  Scenario: Scenario New Tab
    Given The Home view is displayed
    When The user go to Alerts box
    Then The user select new tab

  @Slider
  Scenario: Scenario New Tab
    Given The Home view is displayed
    When The user go to Widgets box
    Then The user select Slider

  @ProgressBar
  Scenario: Scenario Progress Bar
    Given The Home view is displayed
    When The user go to Widgets box
    Then The user select Progress Bar

  @Dragabble
  Scenario: Scenario Dragabble
    Given The Home view is displayed
    When The user go to Interactions box
    Then The user select Dragabble