package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupTest {

	public static void main(String[] args) {
		//Connecting Browser to script
		System.setProperty("webdriver.chrom.driver", "/Users/lafiaji/eclipse-workspace/PracticeSelenium/XBrowserDriver/chromedriver");
		//Instantiate driver that performs operation
		WebDriver driver = new ChromeDriver();
		//Launch the application
		driver.get("https://netowsolutions.com/swadel/");
		//Identify elements
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		//Performing an action on the element
		driver.findElement(By.id("reg_email")).sendKeys("kitana@yopmail.com");
		//Clicking Register button to perform action
		driver.findElement(By.name("register")).click();
	}
}
