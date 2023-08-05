Feature: Book a House for tenant


Scenario: Book Accommodation
Given the tenant is logged in
When the tenant selects a housing unit to book
And provides the move-in date and lease duration
Then the tenant should be able to book the accommodation successfully