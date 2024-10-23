package CrossBrowser;

import org.testng.annotations.Test;

public class Test2 extends BaseClass
{ 
	@Test
	public void seleniumTest() 
	{
		driver.get("https://www.selenium.com/");
	}
}
