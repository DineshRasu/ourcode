package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//launch chrome
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps");
		//max the browser
		driver.manage().window().maximize();
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		//driver.findElementByLinkText("Create Lead").click();
		//driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		//driver.findElementById("createLeadForm_firstName").sendKeys("Dinesh");
		//driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		
		//WebElement element = driver.findElementById("createLeadForm_dataSourceId");
		//Select value = new Select (element);
		//value.selectByVisibleText("Employee");
		
		//driver.findElementByClassName("smallSubmit").click();
		
	//String text = driver.findElementById("viewLead_companyName_sp").getText();
	//String number = text.replaceAll("\\D", "");	
	//System.out.println(number);
	//driver.findElementByClassName("subMenuButtonDangerous").click();
	//driver.findElementByLinkText("Find Leads").click();
	//driver.findElementByName("id").sendKeys(number);
	
		
	}

}
