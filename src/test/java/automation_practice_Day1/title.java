package automation_practice_Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class title {
	

	public static void main(String[] args) {
		
	  //Navigate to page and verify title of page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System. out.println("Title of The Web Page:" + driver.getTitle());
	   
		
		// VERIFY ALL LINK ON PAGE  
		   List<WebElement>Links=driver.findElements(By.tagName("a"));
		   System.out.println("Total No Of link:"+Links.size());
		
	    // Re-find links  and perform click action
		        for (int i = 0; i < Links.size(); i++) {
			    Links = driver.findElements(By.tagName("a"));
			    String linkText = Links.get(i).getText();
			    System.out.println("Clicking link: " + linkText);
			    Links.get(i).click();
			    
	    // Go back to main page
			    driver.navigate().back(); 
			}
		   
	}

}
