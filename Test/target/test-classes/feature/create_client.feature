@CreateClient

Feature:A user creation is required through the Api Rest

  @SuccessfulCase
  Scenario: Successful case to create a user
    Given given that it is required to create a client
    When the name Sara with automation role is sent
    Then successful registration is displayed

  @SuccessfulCase
  Scenario: Create a user without completed role information
    Given given that it is required to create a client
    When the name Sara with automation role is sent
    Then successful registration is displayed

  @SuccessfulCase
  Scenario: Create a user without full name information
    Given given that it is required to create a client
    When the name Sara with automation role is sent
    Then successful registration is displayed

  @SuccessfulCase
  Scenario: Create user without information
    Given given that it is required to create a client
    When the name Sara with automation role is sent
    Then successful registration is displayed

  @SuccessfulCase
  Scenario: Create user with special characters as parameters
    Given given that it is required to create a client
    When the name Sara with automation role is sent
    Then successful registration is displayed
