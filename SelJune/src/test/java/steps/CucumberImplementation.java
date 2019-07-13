package steps;

//import org.apache.xmlbeans.impl.jam.internal.elements.VoidClassImpl;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CucumberImplementation {

	
	ChromeDriver driver = new ChromeDriver();
	
	@Given("Launch the Browser")
	public void testrun() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@And("Load the Url")
	public void loadurl()
	{
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Enter Username")		
	public void enterUsername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	@And("Enter Password")
	public void enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@When("I click on Login Button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		
		//driver.findElementByLinkText("CRM/SFA").click();

	}
		
}
