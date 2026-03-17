package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class sortedlist {

	public static void main(String[] args) {
		
		// Navigate to page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Locate dropdown
		WebElement animalDropdown = driver.findElement(By.id("animals"));

		// Create Select object
		Select selectAnimal = new Select(animalDropdown);

		// Get all options
		List<WebElement> allOptions = selectAnimal.getOptions();

		// Print options
		for (WebElement option : allOptions) {
		    System.out.println(option.getText());
		}

		// Print total options
		System.out.println("Total options: " + allOptions.size());

		// Select option
		selectAnimal.selectByIndex(2);
	}}
