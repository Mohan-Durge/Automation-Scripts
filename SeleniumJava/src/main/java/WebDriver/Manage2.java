package WebDriver;



import javax.swing.text.Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage2 {
	
//setSize(),
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		System.out.println("Before Size:"+driver.manage().window().getSize());
		//System.out.println("Before height"+driver.manage().window().getSize().getHeight());
		Dimension D= new Dimension(700,400);
		driver.manage().window().setSize(D);
		System.out.println("After Size:"+driver.manage().window().getSize());
		
	//getPosition,setPosition
		System.out.println("Before position :"+driver.manage().window().getPosition());
		System.out.println("X: "+driver.manage().window().getPosition().getX());
		System.out.println("Y : "+driver.manage().window().getPosition().getY());
		Thread.sleep(2000);
		Point P = new Point(100, 100);
		driver.manage().window().setPosition(P);
		System.out.println("After position :"+driver.manage().window().getPosition());
		Thread.sleep(2000);
		driver.close();
	}
}
//https://www.flipkart.com/
	//https://www.amazon.in/