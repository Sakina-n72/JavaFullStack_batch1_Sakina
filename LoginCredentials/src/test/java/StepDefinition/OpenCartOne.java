package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartOne {
	
	@Given("Open Google and navigate to OpenCartPage")
	public void open_google_and_navigate_to_open_cart_page() {
		System.out.println("user");
	}
	@When("valid <{string}> and <{string}> is entered")
	public void valid_and_is_entered(String string, String string2) {
		System.out.println("hello");
	}
	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("world");
	}



}
	