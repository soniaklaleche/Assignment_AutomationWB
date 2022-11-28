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

public class Assignment_6thNov2022_automatiopractice {

	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	WebDriverWait wait;

	@BeforeTest
	public void launchAutomationPractice() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://http://automationpractice.pl/index.php");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void clickOnSignIn() {
		WebElement clickOnSignIn = driver.findElement(By.cssSelector("a.login"));
        softassert.assertTrue(clickOnSignIn.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(clickOnSignIn)).click();
		softassert.assertAll();
	}

	@Test(priority = 2)
	public void enterEmailAdresst() {
		WebElement enterEmailAdress = driver.findElement(By.cssSelector("div#columns>div:nth-child(1)+div+div input[id=email_create]"));
		softassert.assertTrue(enterEmailAdress.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(enterEmailAdress)).sendKeys("klalechesonia05@gmail.com");
		softassert.assertAll();
	}

	@Test(priority = 3)
	public void clickOnCreateAnAccount() {
		WebElement clickOnCreateAnAccount = driver.findElement(By.cssSelector("button#SubmitCreate >span"));
		softassert.assertTrue(clickOnCreateAnAccount.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(clickOnCreateAnAccount)).click();
		softassert.assertAll();
	}

	@Test(priority = 4)
	public void clickOnGender() {
		WebElement clickOnGender = driver.findElement(By.cssSelector("input#id_gender2"));
		softassert.assertTrue(clickOnGender.isSelected());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(clickOnGender)).click();
		softassert.assertAll();
	}

	@Test(priority = 5)
	public void EnterPersonalInformation() {
		WebElement FirstnameTextBox = driver.findElement(By.cssSelector("input#customer_firstname"));
		WebElement LastnameTextBox = driver.findElement(By.cssSelector("input#customer_lastname"));
		WebElement EmailTextBox = driver.findElement(By.cssSelector("input#email"));
		WebElement PasswordTextBox = driver.findElement(By.cssSelector("input#passwd"));
		softassert.assertTrue(FirstnameTextBox.isEnabled());
		softassert.assertTrue(LastnameTextBox.isEnabled());
		softassert.assertTrue(EmailTextBox.isEnabled());
		softassert.assertTrue(PasswordTextBox.isEnabled());

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(FirstnameTextBox)).sendKeys("sonia");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(LastnameTextBox)).sendKeys("klaleche");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(EmailTextBox)).sendKeys("klalechesonia05@gmail.com");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(PasswordTextBox)).sendKeys("Sonia$123");

		softassert.assertAll();
	}

	@Test(priority = 6)
	public void enterDateOfBirth() {
		WebElement DayOfBirth = driver.findElement(By.cssSelector("select#days"));
		WebElement MonthOfBirth = driver.findElement(By.cssSelector("select#months"));
		WebElement YearOfBirth = driver.findElement(By.cssSelector("select#years"));
		softassert.assertTrue(DayOfBirth.isSelected());
		softassert.assertTrue(MonthOfBirth.isSelected());
		softassert.assertTrue(YearOfBirth.isSelected());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(DayOfBirth)).click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(MonthOfBirth)).click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(YearOfBirth)).click();

		softassert.assertAll();
	}

	@Test(priority = 7)
	public void ClickOnRegister() {

		WebElement ClickOnRegister = driver.findElement(By.cssSelector("button#submitAccount>span"));
		softassert.assertTrue(ClickOnRegister.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ClickOnRegister)).click();
		softassert.assertAll();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
