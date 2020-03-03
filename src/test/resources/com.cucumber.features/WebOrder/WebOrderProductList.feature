Feature: This is for Web Order Product List

  @smoke
  Scenario: This is validation of all Products data
    Given the user navigates to the web orders page
    When the user provides valid username
    And the user provides valid password
    Then the user clicks view all products menu
    And the user validates the products table