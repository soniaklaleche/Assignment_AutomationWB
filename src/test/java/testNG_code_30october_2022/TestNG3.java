package testNG_code_30october_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG3 {

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
		driver.get("https://www.zara.com/us/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test(priority = 3)
	public void clickOnnSearchBox() {
		driver.findElement(By.xpath(" //span[text()='Search'] ")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 2)
	public void clickOnLogIn() {
		driver.findElement(By.xpath(" //span[text()='LOG IN'] ")).click();
		
	}

	@Test(priority = 5)
	public void ClickOnHelp() {
		driver.findElement(By.xpath("//span[text()='HELP'] ")).click();
		
	}
	@Test(priority = 4)
	public void ClickOnCreateAccount() {
		driver.findElement(By.xpath("//span[text()='CREATE ACCOUNT'] ")).click();
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}

