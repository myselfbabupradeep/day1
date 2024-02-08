package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class DragandDrop 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Eclipse\\selenium\\target\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//a[text()=\" SALES \"]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	
	}

}
