package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest 
{
@Test(priority=5)
public void demo() 
{
	Reporter.log("hello wrold",true);
}
@Test
public void demo1() 
{
	Reporter.log("hello wrold1",true);
}
@Test (priority=3)
public void demo2() 
{
	Reporter.log("hello wrold2",true);
}
@Test(priority=2)
public void demo3()
{
	Reporter.log("hello wrold3",true);
}

@Test(priority=1)
public void demo4() 
{
	Reporter.log("hello wrold4",true);
}

@Test (priority=4)
public void demo5() 
{
	Reporter.log("hello wrold5",true);
}
}
