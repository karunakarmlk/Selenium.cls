package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependOnMethod 
{
 @ Test (dependsOnMethods="navigateTest")
 public void LoginTest()
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demoapp.skillrary.com/login.php?type=login");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.id("email")).sendKeys("admin");
	 driver.findElement(By.id("password")).sendKeys("admin");
	 driver.findElement(By.id("last")).click();
	 driver.quit(); 
 }
 @ Test
 public void navigateTest()
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demoapp.skillrary.com/login.php?type=login");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String header = driver.findElement(By.xpath("//div[@id='login']/h3")).getText();
	System.out.println(header);
	
	driver.quit(); 
 }

}
