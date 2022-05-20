package internet.Herookapp.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/stoufa/Desktop/FormationTestManuel/TestAuto/Selenium/chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

		return driver;

	}

}
