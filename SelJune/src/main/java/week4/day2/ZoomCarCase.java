package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCarCase {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByXPath("//button[@class = 'proceed']").click();
		//driver.findElementByXPath("//div[text() = 'Mon']").click();
		//driver.findElementByXPath("//button[@class = 'proceed']").click();
		
		//Finding tomorro's date
		Date current = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(current);
		int tomorrow = Integer.parseInt(today)+1;
		driver.findElementByXPath("//div[@class = 'days']/div[contains(text(), '"+tomorrow+"')]").click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class = 'proceed']").click();
		driver.findElementByXPath("//button[text() = 'Done']").click();
		
		List<WebElement> cars = driver.findElementsByXPath("//div[@class = 'price']");
		
		int size = cars.size();
		System.out.println(size);
		
		List<String> car = new ArrayList<>();
		
		for ()
		 
		
		
		
		
		

}
}