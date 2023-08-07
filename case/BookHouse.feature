Feature: Book a House for tenant


  Scenario: Book house accept
    Given the tenant is logged in
    When the tenant selects a housing unit to book
    And provides the move-in date and lease duration
    Then the tenant should be able to book the house successfully
  Scenario: Book house reject
    Given the tenant is logged in
    When the tenant selects a housing unit to book
    And he is already booked an house
    Then the tenant can't book house