@DeleteClient

Feature:Removal of a user via Api Rest is required

  @SuccessfulCase
  Scenario: Successful case to delete a user
    Given given that it is required to delete a client
    When the delete is executed
    Then the successful deletion is displayed

  @AlternateCase5
  Scenario: Delete non-existent user
    Given given that it is required to delete a client
    When the delete is executed
    Then the successful deletion is displayed