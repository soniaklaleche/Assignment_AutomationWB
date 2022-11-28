package increment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incrementclass {

	public static void main(String[] args) {
		
		
		int i=1;
		int j=++i - --i;
		int k=j-- - --i +i-- - --j;
		int l=--k - k-- +i-- - --i +j++ - --j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
		
		

	}

}
