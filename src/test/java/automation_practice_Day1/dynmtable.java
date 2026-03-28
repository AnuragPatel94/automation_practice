package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class dynmtable {

	public static void main(String[] args) {

//Navigate to page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//Print Table Name
		String tn=driver.findElement(By.xpath("//h2[normalize-space()='Dynamic Web Table']")).getText();
		System.out.println(tn);
		
		

// Rows
		List<WebElement> rows = driver.findElements(By.id("rows"));
		System.out.println("Rows: " + rows.size());

// Columns
		List<WebElement> cols = driver.findElements(By.id("headers"));
		System.out.println("Columns: " + cols.size());
		
//Print table data
		 
		
		}
	
	}


