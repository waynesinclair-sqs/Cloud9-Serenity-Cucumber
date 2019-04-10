Feature: Cloud9 Airlines

  Scenario: Cloud9 Airlines - Valid Login
    Given That I am on the Cloud9 home page
    When Log in with a valid user id and password
    Then I will be take to the itinerary page
