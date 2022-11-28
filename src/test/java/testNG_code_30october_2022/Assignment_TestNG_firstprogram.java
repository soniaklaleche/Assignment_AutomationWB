package testNG_code_30october_2022;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_TestNG_firstprogram {
	
	public static WebDriver driver;
	
	
	
	@BeforeTest
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test(priority=1)
	public void setUp() {
		driver.get("https://www.costco.com/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test(priority=2)
	public void clickOnnSignInLink() {
		driver.findElement(By.xpath(" //a[@id='header_sign_in'] ")).click();
	}
	@Test(priority=3)
	public void clickOnCreateAccount() {
		driver.findElement(By.xpath("//a[@id='createAccount'] ")).click();
		
	}
	
	@Test(priority=4)
	public void enterValidEmailAdress() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("klalechesonia@gmail.com");
	}
	@Test(priority=5)
	public void enterValidPassword() {
		driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Sonia123");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	
	
	
	

}
}
