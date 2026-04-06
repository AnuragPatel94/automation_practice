package automation_practice_Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.net.URL;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Alerts {

	public static void main(String[] args) {
		
		//Navigate to page and print table name
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        //Locate element-1
       driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
       driver.switchTo().alert().accept();
       System.out.println("Done E1");
        
       
       //Locate element-2
       driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
       driver.switchTo().alert().accept();
       System.out.println("Done E2");
        
      //Locate Prompt element-3
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Alert alert = driver.switchTo().alert();
    	alert.sendKeys("Anurag");
        alert.accept();
        
        String result=driver.findElement(By.xpath("//p[@id='demo']")).getText();
        System.out.println("Done E3:"+result);
        driver.quit();
        

	}}
