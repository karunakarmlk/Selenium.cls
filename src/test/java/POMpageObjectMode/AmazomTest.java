package POMpageObjectMode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazomTest 
{
 public static void main(String[] args) throws InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 AmazonPage amazon = new AmazonPage (driver);
	 if(amazon.logoIsPresent())
		 System.out.println("is present");
	 else
		 System.out.println("not present");
	 
	 System.out.println(amazon.Gocart());
	 List<WebElement> headers = amazon.getHeader();
	 for(WebElement webelement:headers) 
	 {
		 System.out.println(webelement.getText());
	 }
	 amazon.AllDD("Shoes & Handbags");
	 amazon.sendData("handBags");
	 amazon.clickSBT();
	 Thread.sleep(2000);
	 driver.quit();
	 
}
}
