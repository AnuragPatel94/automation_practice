package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class statictable {

	public static void main(String[] args) {
		
//navigate to page
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//Print Table Name
		 String tn=driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']")).getText();
		 System.out.println(tn);
		 
		 
// Find total rows
		 List<WebElement> rowlist = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		 int rowCount = rowlist.size();

// Find total columns (from first row)
		 List<WebElement> collist = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		 int colCount = collist.size();

// Print results
		 System.out.println("Total Rows: " + rowCount);
		 System.out.println("Total Columns: " + colCount);
		 
//Print table data
		 
		 for (int i = 2; i <= rowCount; i++) {
			    for (int j = 1; j <= colCount; j++) {
			        String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]")).getText();
			        System.out.print(data + "  ");
			    }
			    System.out.println();
			}
	}

}
