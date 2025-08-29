package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3
public class GetCurrentURL {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://mvnrepository.com/");
	String URL =driver.getCurrentUrl();
	System.out.print(URL);
}
}
