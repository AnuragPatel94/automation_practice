package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class dropdown {

	public static void main(String[] args) {
		
//Navigate to page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
// locate dropdown
        WebElement element = driver.findElement(By.xpath("//select[@id='country']"));

        Select dropdown = new Select(element);

 // select option
        dropdown.selectByIndex(9);

 // check multiple option
        if (dropdown.isMultiple()) {
            System.out.println("Dropdown is Multiple option");
        } 
        
        else {
            System.out.println("Dropdown is NOT Multiple option");
        }

 // print list of dropdown options
        List<WebElement> allDropdownOption = dropdown.getOptions();

        for (WebElement el : allDropdownOption) {
            System.out.println(el.getText());
        }

        System.out.println("Total Options: " + allDropdownOption.size());
    }



    }


         

        
         
    