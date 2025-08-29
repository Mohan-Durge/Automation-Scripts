package WebDriver;
//2
import java.net.http.WebSocket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://mvnrepository.com/");
	System.out.println(driver.getTitle());
}
}
