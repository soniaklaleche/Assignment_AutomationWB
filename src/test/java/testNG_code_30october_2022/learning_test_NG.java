package testNG_code_30october_2022;

import org.junit.BeforeClass;
import org.testng.annotations.*;


public class learning_test_NG {
	
	
	
	
	
	
	//Selenium is test suite is not a tool
	//main method is the execution engine
	//test NG is a reporting system
	//test Ng is execution engine
	//test NG helps in parallel execution
	//helps in batch running of files
	//helps in grouping and running
//customizes your test cases and it's execution process
	
	//test NG has a lot of annotations which help to control all the things
	//execution preorities:
	//@BeforeSuite/@BeboreTest/@BeforeClass/@BeboreMethod
	
	//@Test(execution NG)main method
	//@AfterMethod/  @AfterClass   @AfterTest   @AfterSuite
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Testing @BeforeSuite annotation");
		
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Testing @BeforeTest annotation");
		
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Testing @BeforeClass annotation");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Testing @BeforeMethod annotation");
	}
		
		
		@Test
		public void testcase() {
			
			System.out.println("My code is workig good");
			
		
				
			}
			@AfterSuite
			public void aftersuite() {
				System.out.println("Testing @AfterSuite annotation");
			}
				
			@AfterTest
			public void aftertest() {
				System.out.println("Testing @AfterTest annotation");
				
	}
			
			@AfterClass
			public void afterclass () {
				System.out.println("Testing @AfterClass annotation");
				
				
	}
			
			@AfterMethod
			public void aftermethod() {
				System.out.println("Testing @AfterMethod annotation");
				
			
			
		
	}
}
