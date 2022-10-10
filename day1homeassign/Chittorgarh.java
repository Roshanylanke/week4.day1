package week4.day1homeassign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chittorgarh.com/");
		
		driver.findElement(By.id("navbtn_stockmarket")).sendKeys("STOCK MARKET",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).sendKeys("NSE BULK DEALS",Keys.ENTER);
		
		List<WebElement> securityNames= driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
		List<String>list = new ArrayList<String>();
		int totalSecurityNames = securityNames.size();
		System.out.println("Total number of Security Name records in the table: " + totalSecurityNames);
		
		for (WebElement eachSecurityName : securityNames) {
			String names = eachSecurityName.getText();
			list.add(names);		
		}
		
		//Printing Unique set of Security names
				Set<String> unique= new TreeSet<String>(list);
				System.out.println("Total number of Unique Security names in the unique set: " + unique.size());
				System.out.println(unique);



	}

}
