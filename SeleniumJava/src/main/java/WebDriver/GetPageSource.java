package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//4
public class GetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		System.out.print(driver.getPageSource());
	}

}
