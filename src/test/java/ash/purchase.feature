Feature: TestMeApp
  @assembly
   Scenario: purchase headphone
    When I enter username
    And I enter password
    Then homepage is displayed
    @Units @Smoke
     Scenario: purchase headphone
    When I click on Logout button
    And  user is navigated to home page
	@Smoke @Units
  Scenario: purchase headphone
    When I Go to All "categories"
    And I navigate to Electronics
    And Click on HeadPhones and Add to cart
    Then the payment page is appeared
    
  
    