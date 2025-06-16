import io.cucumber.java.en.*;
import io.cucumber.core.cli.Main.*;


@SuppressWarnings("unused")
public class cucumber {
	
	
	
	  @Given("user is on login page")
	    public void user_is_on_login_page() {
	        // Add Selenium code to launch browser and open login page
	        System.out.println("User navigates to login page.");
	    }

	    @When("user enters valid credentials")
	    public void user_enters_valid_credentials() {
	        // Add Selenium code to enter username and password
	        System.out.println("User enters valid credentials.");
	    }

	    @Then("user should be logged in")
	    public void user_should_be_logged_in() {
	        // Add validation/assertion code
	        System.out.println("User is logged in.");
	    }

}















