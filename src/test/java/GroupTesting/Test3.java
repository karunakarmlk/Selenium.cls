package GroupTesting;

import org.testng.annotations.Test;

public class Test3
{
@Test(groups ="regression")
public void demo1() {
	System.out.println("Test3-demo-1-regression");
}

	@Test(groups ="smoke")
	public void demo2() {
		System.out.println("Test3-demo-2-sanity");
	
}
	@Test(groups ="smoke")
public void demo3() {
	System.out.println("Test3-demo-3-regression  and sanity");
	}
		
}