package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders
{
@Test(dataProvider="data")
public void bookTicket(String from ,String to)
{
	System.out.println("From: "+from+ "\tTo: " + to);
}
@DataProvider
public Object[] [] data()
{
	Object[] [] obj = new Object[3] [2];
	
	obj[0][0] = "hyd";
	obj[0][1] ="delhi";
	
	obj[1][0] ="HYD";
	obj[1][1] = "chennai";
	
	obj[2][0] ="hyd";
	obj[2][1] ="goa";
	
	return obj;
}
}
