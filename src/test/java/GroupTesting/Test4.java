package GroupTesting;

import org.testng.annotations.Test;

public class Test4
{
@Test
public void demo1() {
	System.out.println("Test4- demo1");

}
	@Test(groups ={"smoke","sanity","regression"})
public void demo3() {
	System.out.println("Test4-demo-2-smoke,sanity,regression");
	}
		
}