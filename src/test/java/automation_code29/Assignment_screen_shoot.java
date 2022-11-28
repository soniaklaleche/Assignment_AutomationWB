package automation_code29;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_screen_shoot {
	public static WebDriver driver;

	private static File source;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dominos.com/");
		WebElement owmScreen = driver.findElement(By.cssSelector("div.css-i6vplv"));

		File source = owmScreen.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\screenshots\\screenshot3.png");

		FileHandler.copy(source, destination);
		// C:\Users\Lenovo user\eclipse-workspace\AUTOMATION_MAVEN\screenshots

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.sephora.com/");

		WebElement sephora = driver.findElement(By.cssSelector("img.css-z3vs2m.e65zztl0"));

		File source1 = sephora.getScreenshotAs(OutputType.FILE);

		File destination1 = new File(System.getProperty("user.dir") + "\\screenshots\\screenshot4.png");

		FileHandler.copy(source1, destination1);

		// img._1xLoE KUgp0 HS1oa mChv9 ZN4WH editorialBannerImage

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.jcpenney.com/");

		WebElement jcpenny = driver
				.findElement(By.cssSelector("img._1xLoE.KUgp0.HS1oa.mChv9.ZN4WH.editorialBannerImage"));

		File source2 = jcpenny.getScreenshotAs(OutputType.FILE);

		File destination2 = new File(System.getProperty("user.dir") + "\\screenshots\\screenshot5.png");

		FileHandler.copy(source2, destination2);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com/");

		WebElement explore = driver.findElement(By.cssSelector("img.https://www.instacart.com/"));

		File source3 = explore.getScreenshotAs(OutputType.FILE);

		File destination3 = new File(System.getProperty("user.dir") + "\\screenshots\\screenshot6.png");

		FileHandler.copy(source3, destination3);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.ebay.com/");

		WebElement photocard = driver.findElement(By.cssSelector("div.ebayui-ellipsis-2"));

		File source4 = photocard.getScreenshotAs(OutputType.FILE);

		File destination4 = new File(System.getProperty("user.dir") + "\\screenshots\\screenshot6.png");

		FileHandler.copy(source4, destination4);
	}

}
