package testNG_code_30october_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG4 {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test(priority = 1)
	public void setUp() {
		driver.get("https://www.jcpenney.com/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test(priority = 2)
	public void clickOnnSearchBox() {
		driver.findElement(By.xpath(" //li[@id='ctaBlock']/preceding::form[1]/preceding-sibling::button[1]")).click();
		
	}
	@Test(priority = 3)
	public void clickOnAddToMyCart() {
		driver.findElement(By.xpath(" //div[@class='gAUl-']")).click();
		
	}
	
	@Test(priority = 5)
	public void clickOnSignIn() {
		driver.findElement(By.xpath(" //div[@class='_2zDSc']/descendant::button[1]")).click();
		
	
	
}
	@Test(priority = 4)
	public void clickOnToysEtGames() {
		driver.findElement(By.xpath(" //div[text()='Toys & Games']")).click();
		
	
}
	@AfterTest
	public void tearDown() {
		driver.quit();

}
}
	