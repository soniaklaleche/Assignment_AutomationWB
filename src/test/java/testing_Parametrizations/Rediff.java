package testing_Parametrizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff {
	
	
	
public static WebDriver driver;
	
	@Test
	public void launchBrowser() {
	
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://Rediff.com");
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.findElement(By.cssSelector("a[class=signin]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("a[class=signin]")).sendKeys("Selenium@123");

}
}
