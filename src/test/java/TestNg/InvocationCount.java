package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount
{
	@Test(invocationCount =2)
	public void demo1() 
	{
		Reporter.log("Demo 1",true);
	}
	@Test(invocationCount =0)
	public void demo2() 
	{
		Reporter.log("Demo 2",true);
	}
	@Test (invocationCount =-2)
	public void demo3() 
	{
		Reporter.log("Demo 3",true);
	}
	@Test(invocationCount =1)
	public void demo4()
	{
		Reporter.log("Demo 4",true);
	}
}
