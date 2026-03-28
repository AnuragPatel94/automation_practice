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

public class TbResult {

	public static void main(String[] args) {
//Navigate to Page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//get text
		String r1=driver.findElement(By.xpath("//div[@id='HTML12']//p[1]")).getText();
		String r2=driver.findElement(By.xpath("//div[@id='HTML12']//p[2]")).getText();
		String r3=driver.findElement(By.xpath("//div[@id='HTML12']//p[3]")).getText();
		String r4=driver.findElement(By.xpath("//div[@id='HTML12']//p[4]")).getText();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		

	}

}
