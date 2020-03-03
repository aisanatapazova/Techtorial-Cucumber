Feature: WebOrders login functionality

  Background:
    Given the user navigates to the web orders page

  @positive
  Scenario: WebOrders login positive testing 1
    When the user provides valid username
    And the user provides valid password
    Then the user should see home page

  @negative
  Scenario: Web Order Login Negative Testing 1
    When the user provides the username "Test"
    And the user provides the password "admin"
    Then the user should validate text "Invalid Login or Password."

  @negative
  Scenario: Web Order Login Negative Testing 2
    When the user provides the username 1234
    And the user provides the password 4567
    Then the user should validate text "Invalid Login or Password."

  @smoke
  Scenario: Web Order Login Negative Testing 3
    When the user provides the username "Tester" and password "tt"
    Then the user should validate text "Invalid Login or Password."

  @menuList
  Scenario: WebOrders login positive testing 2
    Then the user validates order menu list