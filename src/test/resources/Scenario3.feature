
Feature:
  #Evaluate Slider

  Scenario: Slider check
    Given I launch website
    When I move slider to max
    Then I evaluate max position
    When I move slider to min
    Then I evaluate min position