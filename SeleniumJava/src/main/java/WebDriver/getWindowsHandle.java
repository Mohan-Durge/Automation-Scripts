package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//7 ,8
public class getWindowsHandle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	//driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Facebook")).click();
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	driver.close();
}
}
