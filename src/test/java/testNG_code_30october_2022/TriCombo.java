package testNG_code_30october_2022;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TriCombo {
	
	
	
	public static WebDriver driver;
	
	public static WebDriver Driver;
	
	@BeforeMethod
	public void BeforeMethod() {
		
		
	
        
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       System.out.println("this is BeforeMethodExecution");
	

}
	@Test
	public void testcase1() {
		
	driver.get("https://google.com");
	System.out.println("test case google");
	}
	@Test
	public void testcase2() {
		
	driver.get("https://amzon.com");
	System.out.println("test case Amazon");
	}
	
	
	
	@AfterMethod
public void aftermethod() {
		
		System.out.println("This is After Method Annotation");
		
		
		//driver.quit();
	}
}