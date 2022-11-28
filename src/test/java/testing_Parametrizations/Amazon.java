package testing_Parametrizations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	
	
	
	

	public static WebDriver driver;
	
	@Test
	public void launchBrowser() {
	
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox'] ")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//div[@class='nav-line-1-container'] ")).click();
		driver.findElement(By.xpath("//span[@id='glow-ingress-line2'] ")).click();
}
}
