Feature: Tenant Role in Housing Booking Application

  Scenario: View Available Housing and House Details
    Given the tenant is logged in
    When the tenant wants to view available housing
    Then the tenant should be able to see a list of available housing units and pictures, prices, location, and services available in the housing unit



  Scenario: View Housing Residents Information (for Student Housing)
    Given the tenant is logged in
    And the selected housing unit is designated as student housing
    When the tenant wants to view information about the people living in the housing unit
    Then the tenant should be able to see general data about the residents, such as ages and university majors


  Scenario: View Tenant Control Panel
    Given the tenant is logged in
    When the tenant wants to view the tenant control panel
    Then the tenant should be able to see their personal data, residence owner's contact information, and rent payment details

