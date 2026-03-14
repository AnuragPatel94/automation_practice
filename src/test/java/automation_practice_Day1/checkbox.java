package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {

//Navigate to page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//Locate check box and click
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
// Check all
		for(WebElement cb : checkboxes) {
		    if(!cb.isSelected()) {
		        cb.click();
		    }
		}

// Uncheck all
		for(WebElement cb : checkboxes) {
		    if(cb.isSelected()) {
		        cb.click();
		    }
		}

	}

}
