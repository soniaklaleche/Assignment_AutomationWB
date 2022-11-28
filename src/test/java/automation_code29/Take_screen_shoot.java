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

public class Take_screen_shoot {

	public static WebDriver driver;
	private static File source;

	public static void main(String[] args) throws Exception {

		// we do the same thing like sniping tool does by using automation

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		WebElement owmScreen = driver.findElement(By.cssSelector("div.section.where-to"));

		File source = owmScreen.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\screenshots\\screenshot1.png");

		FileHandler.copy(source, destination);
		// C:\Users\Lenovo user\eclipse-workspace\AUTOMATION_MAVEN\screenshots

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://shaadi.com");

		WebElement shaadiBanner = driver.findElement(By.cssSelector("div.css-83u8gt"));

		File source1 = shaadiBanner.getScreenshotAs(OutputType.FILE);

		File destination1 = new File(System.getProperty("user.dir") + "\\screenshots\\screenshot2.png");

		FileHandler.copy(source1, destination1);
	}

}
