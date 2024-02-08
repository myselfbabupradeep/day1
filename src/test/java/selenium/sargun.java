package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class sargun
{
public static void main (String[] args) throws Throwable
{
	String Naukri= "https://www.naukri.com/registration/createAccount?othersrcp=22636";
	WebDriver driver = new EdgeDriver();
	driver.get(Naukri);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[text()=\"Upload Resume\"]")).click();

	Thread.sleep(2000);
	Runtime.getRuntime().exec("D:\\sargunfile.exe\\");

}
	
	
}
