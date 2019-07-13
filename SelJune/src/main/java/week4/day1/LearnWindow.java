package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("IRCTC URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Contact Us").click();
		//String windowHandle = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>();
		
		
		
		

	}

}
