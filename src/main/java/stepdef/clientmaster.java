package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class clientmaster {
	
	@Given("Create client record")
	public void create_client_record() {
	    System.out.println("To add client record in server");
	}

	@When("Add client detail")
	public void add_client_detail() {
	    System.out.println("Add details");
	}

	@Then("Record add successfully")
	public void record_add_successfully() {
	    System.out.println("Record add successfully");
	}




}
