package SkillraryDemoApp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Test
public class AddCategory extends BaseClass
{
 public void addcategory()
 {
	 driver.findElement(By.xpath("//span[text()='Courses']")).click();
	  driver.findElement(By.xpath("//a[text()=' Category']")).click();
	  driver.findElement(By.xpath("//a[text()=' New']")).click();
	  driver.findElement(By.id("name")).sendKeys("mlk");
	  driver.findElement(By.name("add")).click();
	  driver.findElement(By.xpath
			  ("//td[text()='mlk']/following-sibling::td/button[text()=' Delete']")).click();
	  driver.findElement(By.name("delete")).click(); 
 }
}
