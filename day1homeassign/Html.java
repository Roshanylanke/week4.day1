package week4.day1homeassign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		
		//count number of rows
				List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
				int rowSize = rows.size(); 
				System.out.println("Total number of rows in the table: " + rowSize);

				
				//count number of columns
				List<WebElement> columns = driver.findElements(By.xpath("//table[@class='attributes-list']//tr//th"));
				System.out.println("Total number of coloumns in the table: " +columns.size());

	}

}
