package GroupTesting;

import org.testng.annotations.Test;

public class Test1
{
@Test(groups ="smoke")
public void demo1() {
	System.out.println("Test1-demo-1-smoke");
}

	@Test(groups ="sanity")
	public void demo2() {
		System.out.println("Test1-demo-2-sanity");
	
}
	@Test(groups ={"smoke","sanity"})
public void demo3() {
	System.out.println("Test1-demo-3-smoke  and sanity");
	}
		
}