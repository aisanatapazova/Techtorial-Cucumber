Feature: This is to validate the title of searched item

  Background:
    Given the user navigates to the  Etsy webpage


  Scenario: This is positive test of validating the title
    When the user inputs the item in the search box "wooden spoon"
    Then the user validates the title of the new page "Wooden spoon | Etsy"


    Scenario: This is positive test of validating the title of makeup
      When the user inputs the item in the search box "make up organizer"
      Then the user validates the title of the new page "Make up organizer | Etsy"
