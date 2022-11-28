package testNG_code_30october_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Rediff_Css {

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
		driver.get("https://rediff.com/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test(priority = 2)
	public void clickOnSignIn() {
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 3)
	public void enterUserName() {
		driver.findElement(By.cssSelector("a[class=signin]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority = 4)
	public void enterpassword() {
		driver.findElement(By.cssSelector("a[class=signin]")).sendKeys("Selenium@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority = 5)
	public void clickOnSignInButton() {
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	}

