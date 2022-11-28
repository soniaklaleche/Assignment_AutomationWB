package testing_Parametrizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zara {


	public static WebDriver driver;
	
	@Test
	public void launchBrowser() {
	
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zara.com/us/");
		driver.findElement(By.xpath(" //span[text()='Search'] ")).click();
		driver.findElement(By.xpath(" //span[text()='LOG IN'] ")).click();
		driver.findElement(By.xpath("//span[text()='CREATE ACCOUNT'] ")).click();
}
}
