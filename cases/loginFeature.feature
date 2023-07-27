@tag
Feature: User login
  I want to login to Sakankom
  Background:
    Given that I'm in '/login'
    And the field 'ID' is empty
    And the field 'password' is empty

  Scenario: Error on empty fields
    When I click on 'enter'
    Then field 'ID' should be with error
    And field 'password' should be with error

  Scenario: Wrong password
    When I type '111222' in 'ID'
    And I type '123456' in 'password'
    And I click on 'enter'
    Then I should see 'ID or password is incorrect'

  Scenario: Login successfully
    Given I have users:
      | name           | ID                      | password |
      | Rayhan Shhadeh | re7an.ma7moud@gmail.com | admin1   |
      | Raia Shtayeh   | raiashisht@gmail.com    | owner1   |
      | Shahd Khader   | shahdkhad@gmail.com     | tenant   |

    When I type <ID> in 'email'
    And I type <password> in 'password'
    And I click on 'login'
    Then I should login successfully

