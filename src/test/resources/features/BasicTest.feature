Feature:  Basic scenario for cheesy app

  Scenario: App opens as expected
    Given the user launches the app
    Then the user is on the "Login" screen

  Scenario: User can login to the app
    Given the user launches the app
    And the user enters "member" into "usernameField" on the "loginPage"
    And the user enters "password" into "passwordField" on the "loginPage"
    When the user clicks "nextButton" on the "loginPage"
    Then the user is on the "Home" screen


  Scenario: Incorrect password displays expected error