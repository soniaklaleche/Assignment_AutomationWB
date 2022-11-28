package testNG_code_30october_2022;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Dependency_operations {
	
	
	
	
	@Test()
	public void tc1() {
		System.out.println("Test case 1");
		
		Assert.fail("Deliberately failing to show my students");
		
	}

	@Test(dependsOnMethods="tc1",alwaysRun=true)
	public void tc2() {
		System.out.println("Test case 2");
		
	}

	@Test(dependsOnMethods={"tc1","tc2"})
	public void tc3() {
		System.out.println("Test case 3");
		
	}

	@Test(dependsOnMethods={"tc1","tc2","tc3"})
	public void tc4() {
		System.out.println("Test case 4");
		
	}

	@Test(dependsOnMethods={"tc1","tc2","tc3","tc4"})
	public void tc5() {
		System.out.println("Test case 5");

}
}
