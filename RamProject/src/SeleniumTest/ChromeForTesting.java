package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeForTesting {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriverForAndChromeTesting\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/r.php");
		System.out.println("Opened successfully");
		driver.close();
		
	}

}
