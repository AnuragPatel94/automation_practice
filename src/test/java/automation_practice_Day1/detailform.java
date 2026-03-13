package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class detailform {

	public static void main(String[] args) {
		
//navigate to the page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		
//find locators and fill details
		driver.findElement(By.id("name")).sendKeys("Anurag Patel");
		driver.findElement(By.id("email")).sendKeys("apatel665@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9125496385");
		driver.findElement(By.id("textarea")).sendKeys("F1-306 CPTH GN West 201309");
		
		driver.quit();

	}

}
