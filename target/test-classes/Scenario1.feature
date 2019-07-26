
Feature:
  #Evaluate Broken Images

  Scenario: Broken images check
    Given I launch the website
    When I see the images
    Then I can evaluate the broken images