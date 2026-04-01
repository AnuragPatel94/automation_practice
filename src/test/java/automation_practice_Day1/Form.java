package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Form {

	public static void main(String[] args) {
		
//Navigate to page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//Locate element
		WebElement input1 = driver.findElement(By.id("input1"));
		input1.sendKeys("I am");
        String val1 = input1.getAttribute("value");
        System.out.println("Input1 Value: " + val1);
        Assert.assertEquals(val1, "I am");
        driver.findElement(By.id("btn1")).click();
		
		WebElement input2 = driver.findElement(By.id("input2"));
		input2.sendKeys("Anurag");
		String val2 = input2.getAttribute("value");
		System.out.println("Input2 Value: " +val2);
		Assert.assertEquals(val2, "Anurag");
		driver.findElement(By.id("btn2")).click();
		
		WebElement input3 = driver.findElement(By.id("input3"));
		input3.sendKeys("Patel");
		String val3 = input3.getAttribute("value");
		System.out.println("Input3 Value:" +val3);
		Assert.assertEquals(val3, "Patel");
		driver.findElement(By.id("btn3")).click();
		
	
	}

}
