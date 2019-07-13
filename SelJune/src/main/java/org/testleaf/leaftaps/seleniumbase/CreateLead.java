package org.testleaf.leaftaps.seleniumbase;

import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods
{
	@Test 
	
	public void create ()
	{
		
		//driver.findElementByXPath("//div[@id = 'label'][1]").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Dinesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		driver.findElementByClassName("smallSubmit").click();
		
				
	}
}
