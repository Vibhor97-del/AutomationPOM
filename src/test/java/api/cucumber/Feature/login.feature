Feature: Test login functionality

  Scenario Outline: Check login is successfull with valid credentials
    Given browser is open
    And User is on login page
    When User enters "<username>" and "<password>"
    And User clicks on login button
    Then User is navigated to the home page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |