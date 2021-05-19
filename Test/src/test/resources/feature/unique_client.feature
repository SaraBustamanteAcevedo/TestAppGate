@UniqueClient

Feature:A user creation is required through the Api Rest

  @SuccessfulCase
  Scenario: Successful case to find unique customer
    Given that it is required to search for a unique client
    When the user query is made
    Then the user is displayed successfully