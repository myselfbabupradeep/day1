package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.internal.Options;

public class SelectClass 
{

	public static void main(String[] args) throws Throwable
	{
		String a = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		
		d.get(a);
		d.manage().window().maximize();
		
		
		WebElement el = d.findElement(By.xpath("//select[@id=\"first\"]"));
		
		Select s = new Select(el);
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("Apple");
		Thread.sleep(2000);
		s.selectByVisibleText("Bing");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
		WebElement el2 = d.findElement(By.xpath("//select[@id=\"second\"]"));           
		
		Select s1 = new Select(el2);
		Thread.sleep(2000);
		boolean multiple2 = s1.isMultiple();
		System.out.println(multiple2);
		
		List<WebElement> li = s1.getOptions();
	    for (int i = 0; i < li.size(); i++) 
	    {
		WebElement ell= li.get(i);
		String text = ell.getText();
		System.out.println(text);
		}
	    
	    s1.selectByValue("pizza");
	    Thread.sleep(2000);
	    s1.selectByVisibleText("Bonda");
	    Thread.sleep(2000);
	    s1.selectByIndex(1);
	    Thread.sleep(2000);
	    s1.deselectByIndex(3);
	    Thread.sleep(2000);
	   List<WebElement> allselect =s1.getAllSelectedOptions();
	  
	   for (int i = 0; i < allselect.size(); i++) 
   {
		WebElement el3 = allselect.get(i);
		String text1 = el3.getText();
		System.out.println(text1);
		
	}
	   s1.deselectAll();
	   Thread.sleep(2000);
	   
		d.quit();
	}

}
