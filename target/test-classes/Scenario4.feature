
Feature:
  #Evaluate Mouse hover details

  Scenario: Mouse hover check
    Given I am on the website
    When I mouse hover on the picture
    Then I evaluate the details of picture
