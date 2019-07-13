package org.testleaf.leaftaps.seleniumbase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//launch chrome
		driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps");
		//max the browser
		driver.manage().window().maximize();
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
		
}








