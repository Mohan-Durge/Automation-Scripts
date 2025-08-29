package relativeXpath;
//    1.  x pathb attribute

import org.openqa.selenium.By;
//   tagname[@attname = 'attval']   it will directly jumps for that attribute value pair in html code
//<input class="button-1 login-button" type="submit" value="Log in">
//input[@class="button-1 login-button"]
//input[@type="submit"]-> 2 matches->2nd match
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();//indexing
		driver.close();
	}

}
