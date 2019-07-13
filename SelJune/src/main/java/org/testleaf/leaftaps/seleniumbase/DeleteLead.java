package org.testleaf.leaftaps.seleniumbase;

import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificMethods {

	@Test
	public void delete() {
		
		driver.findElementByLinkText("Create Lead").click();
	    driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Dinesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
				
			
		driver.findElementByClassName("smallSubmit").click();
				
		String text = driver.findElementById("viewLead_companyName_sp").getText();
	    String number = text.replaceAll("\\D", "");	
		//System.out.println(number);
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(number);
		
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
	}
	
	
}
