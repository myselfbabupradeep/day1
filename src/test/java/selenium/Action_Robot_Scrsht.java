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

public class Action_Robot_Scrsht 
{
public static void main(String[] args)throws Throwable
{
	String flpkt = "https://www.flipkart.com/";
	String insta = "https://www.instagram.com/";
	
 //   WebDriverManager.edgedriver().setup();
//	WebDriver driver = new EdgeDriver();
//	driver.get(flpkt);
//	driver.manage().window().maximize();
	
//	WebElement element = driver.findElement(By.xpath("//*[text() = \"Login\"]"));
//	
//	Actions a = new Actions(driver);
//	a.moveToElement(element).perform();
//	a.click(element).perform();
//	
	WebDriverManager.edgedriver().setup();
	WebDriver dr = new EdgeDriver();
	dr.get(insta);
	dr.manage().window().maximize();
	

	
	WebElement el = dr.findElement(By.xpath("//*[text()=\"Phone number, username, or email\"]"));
	
	Actions b = new Actions(dr);
	b.moveToElement(el).perform();
	b.click(el).perform();
	b.sendKeys(el, "pradeeppabeep").perform();
	b.doubleClick().perform();
	b.contextClick().perform();
	
	Robot r = new Robot();
	
	for (int i = 0; i < 3; i++) 
	{
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
	
	WebElement er = dr.findElement(By.xpath("//*[text() = \"Show\"]"));

	b.click(er).perform();
	
	TakesScreenshot scr = (TakesScreenshot)dr;
	File fi = scr.getScreenshotAs(OutputType.FILE);
	File fi1 = new File("D:\\Eclipse\\selenium\\src\\screenshot\\image.png");
	FileUtils.copyFile(fi, fi1);
}
}
