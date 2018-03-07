Feature: to login in ecare application

  Scenario: login into ecare and change the PIN for user
    Given Open chrome and start application
    When user enter valid username and password
    And User should click on NOT NOW button
    When User click on account settings link
    And User click on login details link
    When User click on change button for PIN change
    And User enter New PIN number
    Then User Confirm PIN number
    When User click on save button
    And PIN saved updated message reflected
    Then User logout to application
    And User close the browser
    And User close the browser tarun
