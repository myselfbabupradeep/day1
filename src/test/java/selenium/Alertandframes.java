package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertandframes 
{
public static void main(String[] args) throws Throwable
		{
	     String Alerts = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
	     String frames = "https://chercher.tech/practice/frames-example-selenium-webdriver";
	     
	     WebDriverManager.edgedriver().setup();
	     WebDriver d = new EdgeDriver();
	     d.get(Alerts);
	     d.manage().window().maximize();
	     
	     WebElement el =d.findElement(By.name("alert"));
	     el.click();
	     Thread.sleep(2000);
	     d.switchTo().alert().accept();
	     
	     WebElement el2 =d.findElement(By.name("confirmation"));
	     el2.click();
	     Thread.sleep(2000);
	     d.switchTo().alert().accept();
	     Thread.sleep(2000);
	     el2.click();
	     Thread.sleep(2000);
	     d.switchTo().alert().dismiss();
	    
//	     Robot r = new Robot();
//	     r.keyPress(KeyEvent.VK_CONTROL);
//	     r.keyPress(KeyEvent.VK_T);
//	     r.keyRelease(KeyEvent.VK_CONTROL);
//	     r.keyRelease(KeyEvent.VK_T);
//	      
	     
	        d.switchTo().newWindow(WindowType.TAB);
			Thread.sleep(2000);
			d.get(frames);
			
			d.switchTo().frame("frame1");
	        WebElement el3 =d.findElement(By.xpath("//input[@type = \"text\"]"));
			el3.sendKeys("Babu");
			
//			d.switchTo().parentFrame();
			Thread.sleep(5000);
			d.switchTo().frame("frame3");
			WebElement el4 = d.findElement(By.xpath("//input[@type = \"checkbox\"]"));
			el4.click();
			
//			d.switchTo().defaultContent();
			Thread.sleep(5000);
			d.quit();
			
			
	     
		}
}
