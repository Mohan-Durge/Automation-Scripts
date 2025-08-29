package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		System.out.println("Before clicking :"+ driver.getTitle());
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Shopping cart")).click();
		//driver.findElement(By.partialLinkText("Shopping ")).click();// in this cas we can provide a substring of a full substring 
		System.out.println("After clicking :"+ driver.getTitle());
		Thread.sleep(2000);
		
		driver.close();
		
		// 3 4 
	}

}
