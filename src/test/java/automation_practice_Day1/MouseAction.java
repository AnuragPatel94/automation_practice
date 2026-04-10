package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MouseAction {

    public static void main(String[] args) {
    	
    	
//Navigate to page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

 // Hover on dropdown button
        WebElement productlist = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(productlist).perform();

       
        
        
// Double click
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();

// Get value from input field
        WebElement field2 = driver.findElement(By.id("field2"));
        String copytext = field2.getAttribute("value");

        System.out.println("Copy: " + copytext);
        
     // Drag and Drop
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions acts = new Actions(driver);
        acts.clickAndHold(source)
            .moveToElement(target)
            .release()
            .perform();

        // Get text after drop
        String printtext = target.getText();
       
        if(printtext.contains("Dropped")) {
            System.out.println("Drag and Drop Successful ✅");
        } else {
            System.out.println("Drag and Drop Failed ❌");
        }
        driver.quit();
        

        
    }
}