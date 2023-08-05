Feature: Tenant Role in Housing Booking Application

  Scenario: View Available Housing and House Details
    Given the tenant is logged in
    When the tenant wants to view available housing
    Then the tenant should be able to see a list of available housing units and pictures, prices, location, and services available in the housing unit

  Scenario: Book Accommodation
    Given the tenant is logged in
    When the tenant selects a housing unit to book
    And provides the move-in date and lease duration
    Then the tenant should be able to book the accommodation successfully

  Scenario: View Housing Residents Information (for Student Housing)
    Given the tenant is logged in
    And the selected housing unit is designated as student housing
    When the tenant wants to view information about the people living in the housing unit
    Then the tenant should be able to see general data about the residents, such as ages and university majors

  Scenario: Advertise Used Furniture for Sale
    Given the tenant is logged in
    When the tenant wants to advertise their used furniture for sale
    Then the tenant should be able to provide furniture details and set a price

  Scenario: View Tenant Control Panel
    Given the tenant is logged in
    When the tenant wants to view the tenant control panel
    Then the tenant should be able to see their personal data, residence owner's contact information, and rent payment details

