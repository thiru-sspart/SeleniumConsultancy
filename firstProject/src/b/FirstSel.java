package b;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSel {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		//ChromeDriver driver1= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		
		
	}

}
