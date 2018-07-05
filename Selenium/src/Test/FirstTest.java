package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/janu/eclipse-workspace/Selenium/lib/Chrome/chromedriver.exe");
           WebDriver Driver= new ChromeDriver();
           
           Driver.get("https://www.facebook.com/");
           Driver.close();
	}

}
