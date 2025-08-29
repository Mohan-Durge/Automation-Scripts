package WebDriver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class ManageTargetLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//launch chrome browser
	Thread.sleep(1000);
	driver.get("https://demowebshop.tricentis.com/");//navigate to url	
	Thread.sleep(1000);
	driver.findElement(By.linkText("Facebook")).click();//tab
	Thread.sleep(1000);
	Set<String> all_id = driver.getWindowHandles();
	System.out.println(all_id);
	Thread.sleep(1000);
	for(String id:all_id) {
		System.out.println(id);
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
	}
	Thread.sleep(1000);
	driver.quit();
}
}
//day 6