package Annotaion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
@BeforeSuite
public void suitConfig()
{
	System.out.println("@BeforeSuite");
}
@BeforeTest
public void testConfig()
{
	System.out.println("@BeforeTest");
}
@BeforeClass
public void ClassConfig()
{
	System.out.println("@BeforeClass");
}
@BeforeMethod
public void methodConfig()
{
	System.out.println("@Beforemethod");
}
@AfterMethod
public void methodTeardown() 
{
	System.out.println("@aftermethod");
}
@AfterClass
public void classTeardown() 
{
	System.out.println("@Afterclass");
}
@AfterTest
public void testTeardown() 
{
	System.out.println("@Aftertest");
}
@AfterSuite
public void suiteTeardown() 
{
	System.out.println("@Aftersuite");
}
}
