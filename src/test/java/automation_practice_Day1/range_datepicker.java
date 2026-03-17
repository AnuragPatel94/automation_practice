package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class range_datepicker {

	public static void main(String[] args) {
		
		// Navigate to page
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://testautomationpractice.blogspot.com/");
				
				public static void selectDate(WebDriver driver, String expMonth, String expYear, String expDate) {

				    driver.findElement(By.id("datepicker")).click();

				    while (true) {
				        String month = driver.findElement(By.className("ui-datepicker-month")).getText();
				        String year = driver.findElement(By.className("ui-datepicker-year")).getText();

				        if (month.equals(expMonth) && year.equals(expYear)) {
				            break;
				        }

				        // Decide direction (important for range handling)
				        int currentYear = Integer.parseInt(year);
				        int targetYear = Integer.parseInt(expYear);

				        if (currentYear > targetYear) {
				            // Go backward
				            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				        } else {
				            // Go forward
				            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				        }
				    }

				    List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));

				    for (WebElement dt : dates) {
				        if (dt.getText().equals(expDate)) {
				            dt.click();
				            break;
				        }}}}
				    
				