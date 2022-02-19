package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SleepoiGetStarted extends BaseClass {

	Locators locator = new Locators();

	// Validate log
	@Test
	void SleepIoLogo_validation() throws InterruptedException {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"sl-flow\"]/header/div/a[1]/img"));
		Assert.assertTrue(logo.isDisplayed(), "SleepId logo is found");

	}

	// Validate page title
	@Test
	void SleepIoTitle_Validation() throws InterruptedException {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Onboarding Sleep Test - Sleepio");

	}

	// Error Validation- when click on continue with out fill up form
	@Test
	void Error_Validation() throws InterruptedException {

		String errorMessage_text = locator.errorMessage.getText();

		locator.getStarted_Button.click();
		locator.Continue_Button.click();
		wait(2000);
		Assert.assertEquals(errorMessage_text, "Please answer all the questions before continuing.");

	}

	// Validate Login
	@Test
	void Valide_login() throws InterruptedException {

		String errorMessage_text = locator.errorMessage.getText();

		locator.login_link.click();
		locator.email_txt_field.sendKeys("validUser");
		locator.password_txt_field.sendKeys("validPassword");
		locator.login_Button.click();
		
		//I have not assert because I don't know proper credentials.
		
	}

	// Invalid Validate Login
	@Test
	void Invalid_login() throws InterruptedException {

		String errorMessage_text = locator.errorMessage.getText();

		locator.login_link.click();
		locator.email_txt_field.sendKeys("InvalidUser");
		locator.password_txt_field.sendKeys("InvalidPassword");
		locator.login_Button.click();
		wait(2000);
		String Login_error_message_txt=locator.Login_error_message.getText();
		
		Assert.assertEquals(Login_error_message_txt, "Please enter a valid email");

	}

	@Test
	void FormFilldup_First3Pages_Validation() throws InterruptedException {

		String errorMessage_text = driver.findElement(By.xpath("//button[contains(text(),'Over the past month')]"))
				.getText();

		// Click on get started and click continue
		locator.getStarted_Button.click();
		locator.Continue_Button.click();

		// page-3
		click_Js(locator.what_Extent_Sleep_proubled);
		click_Js(locator.some_what);

		// page-3
		click_Js(locator.How_long_have_Problem);
		click_Js(locator.two_to_Four_weeks);

		// page-4
		click_Js(locator.How_many_nights);
		click_Js(locator.three_nights);

		Assert.assertEquals(errorMessage_text, "Over the past month");

	}

}
