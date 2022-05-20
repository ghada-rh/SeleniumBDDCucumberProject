package internet.Herookapp.pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPage extends BasePage{
	
	@FindBy(xpath = "//h2[contains(text(),'Login Page')]")
	WebElement pageTitle;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/form[1]/button[1]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='flash']")
	WebElement errorMessage;
	
	@FindBy(xpath = "//i[contains(text(),'Logout')]")
	WebElement logoutBtn;

	@Override
	public String getPageTitleText() {
		// TODO Auto-generated method stub
		return pageTitle.getText();
	}
    
	public FormAuthenticationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String user) {
		username.sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	public void login(String name, String pass) {
		this.setUsername(name);
		this.setPassword(pass);
		this.clickLogin();
	}
	
   
	public Boolean logoutDisplayed() {
		return logoutBtn.isDisplayed();
		
	}
	
	public String getErrorMsg() {
		return errorMessage.getText().split("\n")[0];
		
	}
}
