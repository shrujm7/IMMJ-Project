@Test
Feature: User should be able to add new computer successfully

Background:
  Given User is on the home page

  Scenario: User is able to add new computer successfully

    When User click on add new computer
    And fill all details and click on submit button
    Then User successfully added computer

  Scenario: User should be able to edit computer details

    When User searches for the computer to be edited
    And selects the computer
    And edits the Introduced Date to "2020-02-02"
    Then User is able to save changes successfully

    Scenario: User delete the computer successfully

      When User searches for the computer to be deleted
      And selects it
      And User clicks on delete computer button
      Then User is able to delete computer successfully

