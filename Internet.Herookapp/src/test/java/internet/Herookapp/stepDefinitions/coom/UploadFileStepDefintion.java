package internet.Herookapp.stepDefinitions.coom;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import internet.Herookapp.pom.com.UploadFilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFileStepDefintion {
	   
	    UploadFilePage page = new UploadFilePage();
	    
	   @When("^I chose a (.+)$")
	    public void i_chose_a(String filePath) throws Throwable {
	        page.chooseFile(filePath);
	    }

	   @And("^I clicked on Upload$")
	    public void i_clicked_on_upload() throws Throwable {
		   page.clickUpload();
	        
	    }

	    @Then("^the file name should be displayed after uploading the file$")
	    public void the_file_name_should_be_displayed_after_uploading_the_file() throws Throwable {
	    	String fileUploadedElementText = page.getfileUploadedElementText();
	    	Assert.assertTrue("the file name is empty", !fileUploadedElementText.isEmpty());
	    }

	    @Then("^the file name should be same displayed and the txt extension should be shown$")
	    public void the_file_name_should_be_same_displayed_and_the_txt_extension_should_be_shown() throws Throwable {
	    	String fileUploadedElementText = page.getfileUploadedElementText();
	    	Assert.assertTrue("the file extension is not .txt", fileUploadedElementText.contains(".txt"));
	    }
        
	    @Then("^the file name should be same displayed and the pdf extension should be shown$")
	    public void the_file_name_should_be_same_displayed_and_the_pdf_extension_should_be_shown() throws Throwable {
	    	String fileUploadedElementText = page.getfileUploadedElementText();
	    	Assert.assertTrue("the file extension is not .pdf", fileUploadedElementText.contains(".pdf"));
	    
	    }
	   
	

}
