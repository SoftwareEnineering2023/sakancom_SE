@tag
  Feature: Admin login
    Description: The administrator logs into the dashboard
    Actor: Administrator

    Scenario: Administrator can login
      Given that the administrator is not logged in
      And the password is "mypass"
      Then the administrator login succeeds
      And the administrator is logged in

    Scenario: Administrator entered the wrong password
      Given that the administrator is not logged in
      And the password is "wrong password"
      Then the administrator login succeeds

