@UpdateClient

Feature:A user update is required through Api Rest

  @SuccessfulCase
  Scenario: Successful case to update a user
    Given given that it is required to update a client
    When the name Sara with automation role is used
    Then the successful update is displayed

  @AlternateCase6
  Scenario: Update a non-existent user
    Given given that it is required to update a client
    When the name Sara with automation role is sent
    Then the successful update is displayed
  @AlternateCase7

  Scenario:Update with incomplete data
    Given given that it is required to update a client
    When the name Sara with automation role is sent
    Then the successful update is displayed


