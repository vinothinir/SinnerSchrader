
Feature:
  #Evaluate Basic Auth
  Scenario: Basic Auth check
    Given I launch authorization page with user credentials
    Then I can see authorization success page