package increment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validation_Rediff_Each_step {
	
private static final Object ExpectedCurrentTitle = null;
private static final Object ExpectedCurrentUrl = null;
public static WebDriver driver;
	

	public static void main(String[] args) {
		
		

		ChromeOptions options=new ChromeOptions();
        //options.setPageLoadStrategy(PageLoadStrategy.NONE); 
        //options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rediff.com");
       // Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String ActualCurrentUrl="https://www.rediff.com/";
        String ActualCurrentTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
        
		String ExeptedCurrentUrl=driver.getCurrentUrl();
		String SrtingExeptedCurrentTitle = driver.getTitle();	
		if(ActualCurrentUrl.equals(ExpectedCurrentUrl) && ActualCurrentTitle.equals(ExpectedCurrentTitle));
		
		{
			System.out.println("My Url is correct");
		
		} else {
			System.out.println("My Url is not correct");
		}
			

		WebElement siginButtonLink=driver.findElement(By.className("signin"));
		if(siginButtonLink.isEnabled()==true &&siginButtonLink.isDisplayed()==true) {
			siginButtonLink.click();
		}else {
			System.out.println("the button field is not enabled or displayed");
			
			
			WebElement usernameTextBox=driver.findElement(By.id("login1"));
			if(usernameTextBox.isEnabled()==true &&usernameTextBox.isDisplayed()==true) {
				usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
			}else {
				System.out.println("the link is not working");
				
				}
				WebElement passwordTextBox=driver.findElement(By.id("password"));
				if(passwordTextBox.isEnabled()==true &&passwordTextBox.isDisplayed()==true) {
					passwordTextBox.sendKeys("Selenium@123");
				}else {
					System.out.println("the pssword textbox field is not enabled or displayed");
				}
				WebElement LogOutLink=driver.findElement(By.className("rd_logout"));
				
			
				if(LogOutlink.isEnabled()==true &&LogOutLink.isDisplayed()==true) {
					LogOutLink.click();
					System.out.println("succefully signedout");
					
				
		}
	}
}

		}
	}

}
