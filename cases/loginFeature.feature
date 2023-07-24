@tag
Feature: Admin login



  @tag1
  Scenario: Administrator entered the wrong password
    Given that the administrator is not logged in
    And the password is "wrong password"
    Then the administrator login fails
    And the administrator is not logged in


