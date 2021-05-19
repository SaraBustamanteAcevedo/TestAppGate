@ListClient

Feature: It is required to list the users through the rest api

  @SuccessfulCase
  Scenario: Successful case to enroll users
    Given that it is required to enroll users
    When searching for the list user
    Then the list is presented successfully