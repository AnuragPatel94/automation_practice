package automation_practice_Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PriceSlider {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Locate slider
        WebElement slider = driver.findElement(By.id("slider-range"));

        // Create Actions class
        Actions actions = new Actions(driver);

        // Move slider (adjust X offset as per need)
        actions.clickAndHold(slider)
               .moveByOffset(100, 0) // move right
               .release()
               .perform();
        
        String priceRange = driver.findElement(By.id("amount")).getAttribute("value");
        System.out.println("Selected Price Range: " + priceRange);

        Thread.sleep(2000);
        //driver.quit();
    }
}