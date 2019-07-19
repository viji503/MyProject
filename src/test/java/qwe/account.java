package qwe;

import java.util.List;
//import java.awt.List;
import java.util.Map;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class account {
	@Given("I want create an account")
	public void i_want_create_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("account creation");
	}

	@When("I Enter my data")
	public void i_Enter_my_data(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
	   // throw new cucumber.api.PendingException();
		List<Map<String, String>> list= dataTable.asMaps(String.class, String.class);
		for(int i=0; i <list.size();i++)
		{
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("password"));
		}
		
		
	}

	@Then("I Verify the account")
	public void i_Verify_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
}
