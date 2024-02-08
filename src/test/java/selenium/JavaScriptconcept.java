package selenium;

import org.openqa.selenium.devtools.v112.page.Page.GetAppIdResponse;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptconcept 
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.edge.driver","D:\\Eclipse\\selenium\\target\\Drivers\\msedgedriver.exe");
	//WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	String insta = "https://www.instagram.com/?hl=en";
	driver.get(insta);
	driver.manage().window().maximize();
	
	WebElement mail = driver.findElement(By.xpath("//*[@type='text']"));
	WebElement password =driver.findElement(By.xpath("//*[@type='password']"));
	WebElement login =driver.findElement(By.xpath("//*[@type='submit']"));
	
	
//	Actions a = new Actions(driver);
//	a.moveToElement(mail).perform();
//	a.sendKeys(mail, "babu").perform();

	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("arguments[0].setAttribute('value','Babu')", mail,password,login);
	Thread.sleep(2000);
	js.executeScript("arguments[0].setAttribute('style','background:red')", mail);
	Thread.sleep(2000);
	js.executeScript("arguments[0].setAttribute('style','border:2px solid red')", mail);
	Thread.sleep(2000);
		
	Object getjs = js.executeScript("return arguments[0].getAttribute('value')", mail,password);
	System.out.println(getjs);
	
	driver.quit();
	
   
   
   
	
	
}
}
