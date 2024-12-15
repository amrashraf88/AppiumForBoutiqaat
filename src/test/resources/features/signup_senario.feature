Feature: Language Selection2

  Scenario Outline: User login to his account2
    When User chooses Gender
    And User open account tab

Given User clicks on Signup button
    When User enters full name "<Fullname>"
    And User enters phone number "<Phone>"
    And User enters email "<email>"
   And User enters password "<password>"
    Then User clicks on Register button
    Examples:
   |Fullname|Phone|email|password|
|amr|54324234|amrashraf8850@gmail.com|12345678Amr$|
