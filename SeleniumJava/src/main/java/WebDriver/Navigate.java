package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//9
public class Navigate {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	//driver.findElement(By.linkText("Register")).click();
	driver.get("https://demowebshop.tricentis.com/register");//reg page
	Thread.sleep(2000);
	driver.navigate().refresh();//reg page
	System.out.println("before calling back():"+driver.getTitle());//reg page
	driver.navigate().back();//reg->main
	System.out.println("after calling back():"+driver.getTitle());//main page
	driver.navigate().refresh();//main page
	System.out.println("before calling forward():"+driver.getTitle());//main page
	driver.navigate().forward();//main->reg
	System.out.println("after calling forward():"+driver.getTitle());//reg page
	Thread.sleep(2000);
	driver.navigate().to("https://www.shoppersstack.com/");
	System.out.println("using to():"+driver.getTitle());
	driver.quit();
}
}
