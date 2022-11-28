package automation_code29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_alerts_PopUps {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
	
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
       driver.findElement(By.name("proceed")).click();
       
       //Alert is an interface it is not a class  Tricky interview/alert some time is comming because of humain erreur or dowing negatif testing
       
       Alert alert=driver.switchTo().alert();
      String text =alert.getText();
      System.out.println("Text of the alert is:"+text);
      if(text.equals("Please enter a valid user name")) {
     
      Thread.sleep(2000);
      alert.accept();
      }else {
    	  alert.dismiss();
    	  
      }
      Thread.sleep(2000);
       driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
       driver.findElement(By.id("password")).sendKeys("Selenium@123");
       
		
		
		
		

	}

}
