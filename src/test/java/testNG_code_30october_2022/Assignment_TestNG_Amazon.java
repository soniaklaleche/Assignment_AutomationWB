package testNG_code_30october_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_TestNG_Amazon {

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
		driver.get("https://www.amazon.com/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test(priority = 2)
	public void clickOnSearchBox() {
		driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox'] ")).sendKeys("iphone 14");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 3)
	public void clickOnSignInRegister() {
		driver.findElement(By.xpath("//div[@class='nav-line-1-container'] ")).click();
		driver.get("https://www.amazon.com/");
	}

	@Test(priority = 4)
	public void clickOnSelectYourAdress() {
		driver.findElement(By.xpath("//span[@id='glow-ingress-line2'] ")).click();
		driver.get("https://www.amazon.com/");
	}

	@Test(priority = 5)
	public void clickOnTodayDeals() {
		driver.findElement(By.xpath("//a[text()='Today's Deals'] ")).click();
		
	}

	// a[text()='Prime Video']
	@AfterTest
	public void tearDown() {
		// driver.quit();

	}
}
