package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class datepicker {

	public static void main(String[] args) {
		
// Navigate to page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
// Open calendar widget
	    WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
	    dateField.click();

	    String expectedMonth = "March";
	    String expectedDate = "17";
	    String expectedYear = "2025";

// Loop until desired month-year appears
	    while (true) {
	        String month = driver.findElement(By.className("ui-datepicker-month")).getText();
	        String year = driver.findElement(By.className("ui-datepicker-year")).getText();

	        if (month.equals(expectedMonth) && year.equals(expectedYear)) {
	            break;
	        } else {

// Click Next button
	        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	        }
	    }

// Select the date
	    List<WebElement>AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	    for (WebElement dt : AllDates) {
	    	if(dt.getText().equals(expectedDate))
	    	{dt.click();
	    	  break;
	    	}
	    }

	    System.out.println("Custom date selected successfully:");
	}
	}