Feature: This is to test the functionality of viewing all orders

  @smoke
  Scenario: This is positive scenario of viewing all orders
    Given the user navigates to the web orders page
    When the user provides valid username and password
    Then the user navigates to view all orders menu and validates the list of all orders header "List of All Orders"
