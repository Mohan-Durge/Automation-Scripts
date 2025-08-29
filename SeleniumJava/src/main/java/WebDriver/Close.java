package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//5,6
public class Close {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Facebook")).click();
	//driver.close();
	driver.quit();
	}
}
