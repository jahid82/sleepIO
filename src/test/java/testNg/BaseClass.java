package testNg;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	WebDriver driver;

	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jahid_5psu063/Downloads/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://onboarding.sleepio.com/sleepio/big-health");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	// JavaSricpt executor click method
	 //Using JavaScipt executor method where selenium click does not work

	public void click_Js(WebElement how_long_have_Problem) throws InterruptedException {

		try {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", how_long_have_Problem);
		} catch (Exception e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		}
	}

	@AfterClass
	void tearDown() {

		driver.quit();
	}
}
