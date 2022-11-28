package testNG_code_30october_2022;

import org.testng.annotations.Test;

public class Priority_AValue {
	
	
	
	
	@Test(priority=2)
	public void tc1() {
		System.out.println("Test case 1");
		
	}

	@Test(priority=3)
	public void tc2() {
		System.out.println("Test case 2");
		
	}

	@Test(priority=1)
	public void tc3() {
		System.out.println("Test case 3");
		
	}

	@Test(priority=5)
	public void tc4() {
		System.out.println("Test case 4");
		
	}

	@Test(priority=4)
	public void tc5() {
		System.out.println("Test case 5");
		
	}
	

}
