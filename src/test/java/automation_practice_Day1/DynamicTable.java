package automation_practice_Day1;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
    public static void main(String[] args) {
    	
       //Navigate to page and print table name
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        System.out.println("\n=== Dynamic Web Table ===");

        // Print Headers name and size
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
        int colCount = headers.size();

        // Print Rows size
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
        int rowCount = rows.size();

        //Print counts (NOW VISIBLE & CLEAN)
        System.out.println("\nTotal Rows    : " + rowCount);
        System.out.println("Total Columns : " + colCount);

        // Print headers
        System.out.println("\nColumns:");
        for (WebElement header : headers) {
            System.out.print(header.getText() + " | ");
        }

        // Print table data
        System.out.println("\n\nData:");
        System.out.println("------------------------------------------------------------");

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));

            for (WebElement col : cols) {
                System.out.printf("%-20s", col.getText());
            }
            System.out.println();
        }

        // Summary
        System.out.println("\n\n=== Table Summary ===");

        List<WebElement> results = driver.findElements(By.xpath("//div[@id='HTML12']//p"));

        for (WebElement res : results) {
            System.out.println("✔ " + res.getText());
        }

        driver.quit();
    }
}