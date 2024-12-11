Feature: Language Selection

  Scenario Outline: User login to his account
Given User opens
    When User chooses Gender
    And User open account tab
    And User presses sign in btn
   And User write email "<email>"
    Then User write "<password>"
    Examples:
    |email|password|
|amrashraf8850@gmail.com|12345678Amr$|
