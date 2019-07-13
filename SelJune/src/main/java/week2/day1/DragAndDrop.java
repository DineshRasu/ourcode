package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// launch chrome
		ChromeDriver driver = new ChromeDriver();
		// load the URL
		driver.get("http://leafground.com/pages/drag.html");
		// max the browser
		driver.manage().window().maximize();
		
		WebElement Source = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(Source,100, 150).perform();
		
		

		
				

		
		
	}
}