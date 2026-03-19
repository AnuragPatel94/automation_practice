package automation_practice_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class fileuploadwithrobot {

	public static void main(String[] args) throws Exception {
		
		// Navigate to page
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://testautomationpractice.blogspot.com/");

				// Click on file input to open OS popup
				WebElement fileInput = driver.findElement(By.id("singleFileInput"));
				
				// Create Robot instance
				Robot rb = new Robot();
				rb.delay(2000);

				// Copy file path to clipboard
				StringSelection ss = new StringSelection("C:\\Users\\lib-11\\Desktop\\ANURAG\\QA\\1769920777721.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

				// Paste (CTRL + V)
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);

				// Press ENTER
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);

}
}
