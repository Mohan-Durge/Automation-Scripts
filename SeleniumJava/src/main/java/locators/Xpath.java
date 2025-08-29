package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]//div[1]/div[1]/div/form//input[1]")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]//div[1]/div[1]/div/form//input[2]")).sendKeys("Pass");
		Thread.sleep(2000);
		driver.close();
	}

}
//day 9
// /html/body/div[2]/div/div/div/form/input[2]  https://www.saucedemo.com/v1/ pss fied