package automation_code_13Nov;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_To_Read_From_A_Properties_File {

	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// create properties file

		String path = System.getProperty("user.dir") + "\\src\\test\\java\\automation_code_13Nov\\config.properties";
		System.out.println(System.getProperty("user.dir"));
		prop = new Properties();

		ip = new FileInputStream(path);
		
		prop.load(ip);

		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("SearchBoxXpath"));
		System.out.println(prop.getProperty("search"));
		System.out.println(prop.getProperty("SignInXpath"));
		System.out.println(prop.getProperty("SelectAdressXpath"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("SearchBoxXpath")));
		driver.findElement(By.xpath(prop.getProperty("search"))).sendKeys(prop.getProperty("Iphone14"));
		driver.findElement(By.xpath(prop.getProperty("SignInXpath")));
		driver.findElement(By.xpath(prop.getProperty("SelectAdressXpath")));
	}
}
