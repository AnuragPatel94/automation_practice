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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class searchTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Search
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("India");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.id("Wikipedia1_wikipedia-search-results")
		));

		// Get links
		List<WebElement> links = wait.until(
		    ExpectedConditions.presenceOfAllElementsLocatedBy(
		        By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a")
		    )
		);

		// Click first link
		links.get(0).click();
		
		// Switch to new tab
		String parentWindow = driver.getWindowHandle();
		for (String window : driver.getWindowHandles()) {
		    if (!window.equals(parentWindow)) {
		        driver.switchTo().window(window);
		    }
		}

		
	}
	}
