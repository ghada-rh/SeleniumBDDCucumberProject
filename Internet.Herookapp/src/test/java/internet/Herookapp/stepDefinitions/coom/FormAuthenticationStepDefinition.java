package internet.Herookapp.stepDefinitions.coom;

import internet.Herookapp.pom.com.FormAuthenticationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FormAuthenticationStepDefinition {
	
	    FormAuthenticationPage loginPage = new FormAuthenticationPage();
	    
	    @When("^I click the Login button$")
	    public void i_click_the_login_button() throws Throwable {
	    	loginPage.clickLogin();
	    }

	    @Then("^\"([^\"]*)\" message banner is displayed$")
	    public void something_message_banner_is_displayed(String expectedMsg) throws Throwable {
	    	String actualMsg = loginPage.getErrorMsg();
	    	Assert.assertEquals(expectedMsg, actualMsg);
	       
	    } 
	    
	    @When("^I enter a Username of \"([^\"]*)\"$")
	    public void i_enter_a_username_of_something(String username) throws Throwable {
	        loginPage.setUsername(username);
	    }


	    @When("^I enter a Password of \"([^\"]*)\"$")
	    public void i_enter_a_password_of_something(String password) throws Throwable {
	    	loginPage.setPassword(password);
	    }

}
