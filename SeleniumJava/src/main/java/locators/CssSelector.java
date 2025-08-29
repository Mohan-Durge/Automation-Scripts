package locators;
//7

import org.openqa.selenium.By;
//1.tagname[attname='attval']
//2.[attname='attval']
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Email")).sendKeys("Abcd0");
		driver.findElement(By.cssSelector("input[class=\"button-1 login-button\"]")).click();
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
//		or
//		driver.findElement(By.cssSelector("[value=\"Log in\"]")).click();
//		or
		
		
		driver.close();
	}
}
//https://demowebshop.tricentis.com/login

//for mail : input[class='email']  or [class='email'] or input#Email