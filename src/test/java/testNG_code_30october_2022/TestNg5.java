package testNG_code_30october_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg5 {
	
	

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
		driver.get("https://www.wayfair.com/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test(priority=2)
	public void clickOnnSearchBox() {
		driver.findElement(By.xpath("//div[@class='listbox']/preceding::span[2]/preceding::input ")).click();
		
	}
	@Test(priority=3)
	public void clickOnCart() {
		driver.findElement(By.xpath("//div[@class='CartButton']/descendant::sup[1] ")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=4)
	public void clickOnSele() {
		driver.findElement(By.xpath("//a[text()='Sale']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
}
	@Test(priority=5)
	public void clickOnFourniture() {
		driver.findElement(By.xpath("//button[text()='Furniture']")).click();
		
	
}
	@AfterTest
	public void tearDown() {
		driver.quit();

}
}
