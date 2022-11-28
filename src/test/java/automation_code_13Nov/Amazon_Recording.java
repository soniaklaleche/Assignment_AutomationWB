package automation_code_13Nov;

import java.time.Duration;

import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Recording {

	
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	WebDriverWait wait;

	@BeforeTest
	public void launchBrowser() {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test(priority = 1)
	public static void test() throws Exception{
	
		ScreenRecorderUtil.startRecord("test");
		driver.get("https://www.amazon.com/");

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	@Test(priority = 2)
	public  void clickOnSearchBox() {
		driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox'] ")).sendKeys("iphone 14");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 3)
	public  void clickOnSignInRegister() {
		driver.findElement(By.xpath("//div[@class='nav-line-1-container'] ")).click();
		driver.get("https://www.amazon.com/");
	}

	@Test(priority = 4)
	public  static void clickOnSelectYourAdress() throws Exception {
		driver.findElement(By.xpath("//span[@id='glow-ingress-line2'] ")).click();
		driver.get("https://www.amazon.com/");
		
		
		
		ScreenRecorderUtil.stopRecord();
	}


	
}