package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.net.URL;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DynamicButton {

	public static void main(String[] args) {
		
//Navigate to page
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://testautomationpractice.blogspot.com/");
		  
//Locate Element
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement button = driver.findElement(By.xpath("//button[@name='start']")); 
		  
//Perform click action
          if (button.getText().equalsIgnoreCase("Start")) {
	        button.click();
	        System.out.println("Clicked Start");
	            
	        }

	       button.click();
	        System.out.println("Clicked Stop");

		 
		  
		  
	}

}
