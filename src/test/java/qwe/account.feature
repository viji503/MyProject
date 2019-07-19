Feature: Create Account

  @tag1
  Scenario: Success
    Given I want create an account
    When I Enter my data
      | name  | password |
      | name1 | xyux  | 
      | name2	| abcd  |
    Then I Verify the account

    
