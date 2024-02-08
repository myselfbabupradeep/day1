package selenium;

import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import org.openqa.selenium.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable
{
public static void main(String[] args) throws Throwable
{
	WebDriverManager.edgedriver().setup();
   WebDriver driver = new EdgeDriver();
   driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
   driver.manage().window().maximize();
   
   List<WebElement> alltable = driver.findElements(By.xpath("//table[@summary=\"Sample Table\"]"));
   for (int i = 0; i < alltable.size(); i++) 
   {
	WebElement table = alltable.get(i);
	WebElement tbody = table.findElement(By.tagName("tbody"));
	List<WebElement> allrow = tbody.findElements(By.tagName("tr"));
	
	for (int j = 0; j < allrow.size(); j++)
	{
		WebElement row = allrow.get(j);
		List<WebElement> alldata = row.findElements(By.tagName("th"));
		
		for (int k = 0; k < alldata.size(); k++) 
		{
			WebElement data = alldata.get(k);
			String text = data.getText();
			System.out.println(text);
			
//			if (text.equals("Roland Mendel"))
//			{
//				System.out.println(text+"Present in table");
//				System.out.println("at column index= "+j);
//				System.out.println("at row index= "+k);
//			}
		}
	}	
}
   driver.quit(); 
}
}
