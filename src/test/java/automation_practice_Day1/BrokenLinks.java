package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.net.URL;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;



public class BrokenLinks {

	public static void main(String[] args) {

//Navigate to page
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://testautomationpractice.blogspot.com/");
		  
//Locate element
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List <WebElement> linklist = driver.findElements(By.tagName("a"));

// Print all links
			int validCount = 0;
			int brokenCount = 0;

			for (WebElement element : linklist) {
			    String url = element.getAttribute("href");

			    if (url != null && !url.isEmpty()) {
			        try {
			            URL link = new URL(url);
			            HttpURLConnection conn = (HttpURLConnection) link.openConnection();
			            conn.setRequestMethod("HEAD");
			            conn.connect();

			            int responseCode = conn.getResponseCode();

			            if (responseCode >= 400) {
			                System.out.println(url + " --> Broken Link");
			                brokenCount++;   // increment broken
			            } else {
			                System.out.println(url + " --> Valid Link");
			                validCount++;    // increment valid
			            }

			        } catch (Exception e) {
			            System.out.println(url + " --> Error");
			            brokenCount++; // treat error as broken
			        }
			    }
			}

			// Final Count Output
			System.out.println("Total Valid Links: " + validCount);
			System.out.println("Total Broken Links: " + brokenCount);
	                    }
	                
	

}
