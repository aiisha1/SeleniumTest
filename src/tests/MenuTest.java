package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MenuTest {
	WebDriver driver;
	@BeforeTest
	public void setupBrowser() {  
		System.setProperty("webdriver.chrome.driver", "/Users/lafiaji/eclipse-workspace/PracticeSelenium/XBrowserDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel/");
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
   }
	
	@Test(priority=0)
	public void validLogin() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("kitana@yopmail.com");
		
		driver.findElement(By.name("password")).sendKeys("@SeleniumTest1");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
	}

	@Test(priority=1)
	public void Menu() throws InterruptedException {
		driver.findElement(By.id("menu-header_2-1357"));
		driver.findElement(By.cssSelector("#page_content > div > section > div > ul > li.product.type-product.post-682.status-publish.first.instock.product_cat-kids.product_tag-boy.product_tag-girl.product_tag-kid.product_tag-product.has-post-thumbnail.shipping-taxable.purchasable.product-type-simple.cz_image.cz_image_fade_to_top > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > div > div.cz_image_in > div.cz_hover_image > img")).click();
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void AftTest() {
		driver.quit();
	}
}
