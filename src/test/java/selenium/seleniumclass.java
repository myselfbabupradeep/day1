package selenium;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.NullOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class seleniumclass 
{
	public static void main(String[] args)throws Throwable {
		String fb = "https://www.facebook.com/";
		String me = "https://www.meesho.com/";
		
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(me);
		driver.manage().window().maximize();
	
//		WebElement element = driver.findElement(By.xpath("//*[text()=\"Profile\"]"));
//	
//		Actions action = new Actions(driver);
//	action.moveToElement(element).perform();
//		action.click(element).perform();
		
		WebDriver driver1 = new EdgeDriver();
		driver1.get(fb);
		driver1.manage().window().maximize();
		WebElement element1 = driver1.findElement(By.id("email"));
		Actions b = new Actions(driver1);
		b.moveToElement(element1).perform();
		b.click(element1).perform();
		b.sendKeys(element1, "pradeep").perform();
		b.doubleClick().perform();
		b.contextClick().perform();
		Robot r = new Robot();
	for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
				
		TakesScreenshot s = (TakesScreenshot)driver1;
		File file = s.getScreenshotAs(OutputType.FILE);
		File fi1e1 = new File("D:\\Eclipse\\selenium\\src\\main\\Img\\test1.png");
		FileUtils.copyFile(file, fi1e1);
	}
}
