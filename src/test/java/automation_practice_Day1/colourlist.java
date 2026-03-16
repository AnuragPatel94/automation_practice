package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class colourlist {

	public static void main(String[] args) {
		
//navigate to the page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Locate List
		WebElement clr = driver.findElement(By.id("colors"));

		Select list = new Select(clr);

		// Get all options
		List<WebElement> allOptions =list.getOptions();

		// Print options
		for(WebElement option : allOptions)
		{
		    System.out.println(option.getText());
		}

		// Print total options
		System.out.println("Total options: " + allOptions.size());

		// Select option safely
		list.selectByIndex(2);
	}}