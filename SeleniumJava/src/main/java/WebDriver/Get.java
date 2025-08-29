package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// It will launce chrome Browser
		driver.get("Https://mvnrepository.com/");//will navigate
	//	driver.get("Https://mvnrepositorycom/");//will not navigate
	}

}
