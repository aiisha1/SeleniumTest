package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestFireFox {

	public static void main(String[] args) {
		//Connecting Browser to script
		System.setProperty("webdriver.gecko.driver", "/Users/lafiaji/eclipse-workspace/PracticeSelenium/XBrowserDriver/geckodriver");
		//Instantiate driver that performs operation
		WebDriver driver = new FirefoxDriver();
		//Launch the application
		driver.get("https://netowsolutions.com/swadel/");
		//Identify Elements
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/div/div[2]/div[3]/a/i")).click();
		//Interacting with Element
		driver.findElement(By.name("username")).sendKeys("kitana@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("@SeleniumTest1");
		//Clicking Login Button
		driver.findElement(By.name("login")).click();
	}

}