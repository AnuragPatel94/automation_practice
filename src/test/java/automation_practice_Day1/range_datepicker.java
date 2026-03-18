package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class range_datepicker {

	public static void main(String[] args) {
		
// Navigate to page
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://testautomationpractice.blogspot.com/");
				
//switch to frame
				//driver.switchTo().frame("date-picker-box"); 
		       //driver.switchTo().frame(0);
				
				
				       

 // Step 2: Locate From and To date fields
				        WebElement startdate = driver.findElement(By.id("start-date"));
				        WebElement enddate = driver.findElement(By.id("end-date"));

// Step 3: Clear and enter dates (MM/DD/YYYY)
				        startdate.clear();
				        startdate.sendKeys("03/10/2025");

				        enddate.clear();
				        enddate.sendKeys("03/10/2026");

// Optional: press TAB or ENTER if needed
				        driver.findElement(By.xpath("//button[@class='submit-btn']")).click();

// Get values from input fields
				        String stdt = startdate.getAttribute("value");
				        String endt = enddate.getAttribute("value");
				        WebElement resultmsg=driver.findElement(By.id("result"));
				        String message = resultmsg.getText();

// Print in console
				        System.out.println("Start Date: " + stdt + " | End Date: " + endt);
				        System.out.println("Result Message: " + message);
				        
	}
}