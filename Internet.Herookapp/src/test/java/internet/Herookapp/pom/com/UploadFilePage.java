package internet.Herookapp.pom.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage extends BasePage{

	@FindBy(tagName = "h3")
    WebElement pageTitle;

	@FindBy(id = "file-upload")
    WebElement chooseFileBtn;
    
	@FindBy(id = "file-submit")
    WebElement uploadBtn;

	@FindBy(id = "uploaded-files")
    WebElement fileUploadedElement;

    public UploadFilePage() {
        PageFactory.initElements(driver, this);
    }
    
    @Override
    public String getPageTitleText() {
        return pageTitle.getText();
    }
    

    public void chooseFile(String filePath) {
    	chooseFileBtn.sendKeys(filePath);
    	
    }
    
    public void clickUpload() {
    	uploadBtn.click();
    }
    
    public String getfileUploadedElementText() {
    	
    	return fileUploadedElement.getAttribute("innerHTML");
    }
    
}
