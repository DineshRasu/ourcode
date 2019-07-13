package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("\\button[text()= 'Try it']").click();
	 
	
	
}	
	
}
