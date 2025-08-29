package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
//10
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		System.out.println("Size:"+driver.manage().window().getSize());
		System.out.println("height:"+driver.manage().window().getSize().getHeight());
		System.out.println("width:"+driver.manage().window().getSize().getWidth());
		Thread.sleep(2000);
		System.out.println("----------------------------------------------------------------------------------");
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		System.out.println("Size:"+driver.manage().window().getSize());
		System.out.println("height:"+driver.manage().window().getSize().getHeight());
		System.out.println("width:"+driver.manage().window().getSize().getWidth());
		Thread.sleep(2000);
		System.out.println("----------------------------------------------------------------------------------");
		driver.manage().window().minimize();
		System.out.println("Size:"+driver.manage().window().getSize());
		System.out.println("height:"+driver.manage().window().getSize().getHeight());
		System.out.println("width:"+driver.manage().window().getSize().getWidth());
		Thread.sleep(2000);
		
		
		Point p = new Point(100, 70);
		driver.manage().window().setPosition(p);
		System.out.println("After position :"+driver.manage().window().getPosition());
		driver.close();
	}
}
