package ash;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class purchase {
	@When("I Go to All {string}")
	public void i_Go_to_All(String x) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(x);
	}

	@When("I navigate to Electronics")
	public void i_navigate_to_Electronics() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Electronics");
	}

	@When("Click on HeadPhones and Add to cart")
	public void click_on_HeadPhones_and_Add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("headPhone");
	}

	@Then("the payment page is appeared")
	public void the_payment_page_is_appeared() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Payment");
	}
	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Username");
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Password");
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("homepage");
	}

	@When("I click on Logout button")
	public void i_click_on_Logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Logout");
	}

	@When("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Again homePage");
	}
	}


