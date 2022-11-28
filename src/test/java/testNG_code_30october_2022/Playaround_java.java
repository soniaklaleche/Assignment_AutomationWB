package testNG_code_30october_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Playaround_java {

	private static final String Durattion = null;
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test
	public void setUp() {
		driver.get("https://www.rediff.com/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test
	public void clickOnnSignInLink() {
		driver.findElement(By.className("signin")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
