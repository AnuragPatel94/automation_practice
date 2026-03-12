package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class rediobtn {

	public static void main(String[] args) {

//navigate to the page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
			
//locate element and perform action
		List<WebElement> rediobtnList = driver.findElements(By.xpath("//input[@type='radio']"));

		for(WebElement radio : rediobtnList) {
			 if(radio.getAttribute("id").equals("female")){
			        radio.click();
			        
		    System.out.println(radio.getAttribute("id"));
			 }
		}
	}
}

