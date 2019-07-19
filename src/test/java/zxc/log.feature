Feature: Title of your feature

  @tag1
  Scenario Outline: Title of your scenario outline
    Given User enters the url
    And enters <"username"> and <"password">
    When He clicks on login button
    Then Home page is displayed

    Examples:
      | username  | password |
      | Sam       | abcd123  | 
      | john		  | efgh456  |
