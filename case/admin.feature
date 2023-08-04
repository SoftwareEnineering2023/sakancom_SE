Feature: Manage Housing Advertisement Requests

  Scenario: Create Housing Advertisement Request
    Given I am a user
    And I have access to the housing advertisement system
    When I submit a request for advertising a housing
    Then the request should be created successfully

  Scenario: Accept Housing Advertisement Request
    Given I am an administrator
    And there is a pending housing advertisement request
    When I review the request
    And I choose to accept it
    Then the request status should be updated to "Accepted"
    And the housing advertisement should be published

  Scenario: Reject Housing Advertisement Request
    Given I am an administrator
    And there is a pending housing advertisement request
    When I review the request
    And I choose to reject it
    Then the request status should be updated to "Rejected"
    And the housing advertisement should not be published