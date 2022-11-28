package java_6Nouvember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_with_CCS_Selector {

	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	WebDriverWait wait;

	@BeforeTest
	public void launchRediff() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void UsentererName() {
		WebElement UsentererName = driver.findElement(By.cssSelector("input#login1"));
		softassert.assertTrue(UsentererName.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(UsentererName)).sendKeys("seleniumpanda@rediffmail.com");
		softassert.assertAll();

	}

	@Test(priority = 2)
	public void enterpassword() {
		WebElement enterPassword = driver.findElement(By.cssSelector("input#password"));
		softassert.assertTrue(enterPassword.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(enterPassword)).sendKeys("Selenium@123");
		softassert.assertAll();

	}

	@Test(priority = 3)
	public void clickPnSigiIn() {
		WebElement clickPnSigiIn = driver.findElement(By.cssSelector("input.signinbtn"));
		softassert.assertTrue(clickPnSigiIn.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(clickPnSigiIn)).click();
		softassert.assertAll();

	}

	@Test(priority = 4)
	public void clickOnLogOut() {
		WebElement clickOnLogOut = driver.findElement(By.cssSelector("body.theme_1"));
		softassert.assertTrue(clickOnLogOut.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(clickOnLogOut)).click();
		softassert.assertAll();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
