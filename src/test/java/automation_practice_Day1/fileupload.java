package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class fileupload {

	public static void main(String[] args) {

// Navigate to page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

// Locate file upload element
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='singleFileInput']"));

// Upload file (NO click required)
		fileInput.sendKeys("C:\\Users\\lib-11\\Desktop\\ANURAG\\QA\\1769920777721.pdf");

// Click upload button
		driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
		
//print msg
		WebElement resultmsg=driver.findElement(By.id("singleFileStatus"));
		String message = resultmsg.getText();
		
		System.out.println("file upload succesfully:"+message);
	}}