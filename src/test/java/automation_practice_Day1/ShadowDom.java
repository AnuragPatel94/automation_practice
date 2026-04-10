package automation_practice_Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class ShadowDom {

	public static void main(String[] args) {
//Navigate to page
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
//Locate element
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	  WebElement shadowHost = driver.findElement(By.cssSelector("shadow_host"));
	  SearchContext shadowRoot = shadowHost.getShadowRoot();
      String itemname = shadowRoot.findElement(By.cssSelector(".info")).getText();
	  System.out.println("itemname");
	}

}
