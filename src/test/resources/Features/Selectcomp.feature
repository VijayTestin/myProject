Feature: Validating select competitor page
  I want to use this template for my feature file

  Scenario: Validating free package
    Given user should be on Select comp page
    And Get the package details
    When User selecting your hotel "Radisson hotel"
    When User selecting theri competitor page
    And Click on get metrics button
    Then Free rateshop is created
    And check more outcomes
