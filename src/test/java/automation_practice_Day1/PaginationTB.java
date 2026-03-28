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

public class PaginationTB {

	public static void main(String[] args) throws InterruptedException {
//Navigate to page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//Print Table Title
		String title=driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']")).getText();
		System.out.println(title);
		
//Locate table header and size
		List<WebElement> headers=driver.findElements(By.xpath("//table[@id='productTable']/thead/tr/th"));
		System.out.println("Total Columns: " + headers.size());
		
// Print header names
        System.out.print("Headers: ");
        for (WebElement header : headers) {
            System.out.print(header.getText() + " | ");
        }
        System.out.println();
		
 // Locate total pages from pagination footer
        List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
        int totalPages = pages.size();
        System.out.println("Total Pages: " + totalPages);
        
// Iterate through all pages
        for (int p = 1; p <= totalPages; p++) {
            System.out.println("\n---- Reading Page " + p + " ----");

// Click pagination link (skip first page since it's already loaded)
            if (p > 1) {
                driver.findElement(By.xpath("//ul[@id='pagination']/li/a[text()='" + p + "']")).click();
                
// wait for table to refresh               
                Thread.sleep(2000); 
            }

// Get all rows from current page
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));

// Loop rows
            for (int r = 1; r <= rows.size(); r++) {
                
// Loop columns
            for (int c = 1; c <= headers.size(); c++) {
                    
            	// If last column -> it's a checkbox
                    if (c == headers.size()) {
                        WebElement checkbox = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[" + r + "]/td[" + c + "]/input[@type='checkbox']"));
                        checkbox.click(); // Check the box
                        System.out.print("[CHECKED] | ");
                    } else {
                        // Print cell data
                        WebElement cell = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[" + r + "]/td[" + c + "]"));
                        System.out.print(cell.getText() + " | ");
                    }
                }
                System.out.println();
            }
        }

        // Done
        System.out.println("\n✅ All pages read and all last-column checkboxes checked successfully!");
        driver.quit();
	}

}
