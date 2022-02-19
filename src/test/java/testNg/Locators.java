package testNg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Locators extends BaseClass {

		
    WebElement errorMessage=driver.findElement(By.xpath("//p[1]/label[1]/*[contains(text(),'Please answer all the questions before continuing.')]"));
	WebElement getStarted_Button=driver.findElement(By.xpath(("//*[@id='sl-flow']/div[3]/div/div/div/div/div/button")));
	WebElement Continue_Button=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
    WebElement How_long_have_Problem =driver.findElement(By.xpath("//body/div[@id='app']/div[@id='sl-flow']/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
    WebElement two_to_Four_weeks=driver.findElement(By.xpath("//option[contains(text(),'2-4 weeks')]"));
    WebElement what_Extent_Sleep_proubled =driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/label/input"));
    WebElement some_what=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div/div/select//option[contains(text(),'Somewhat')]"));
    WebElement How_many_nights=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div/div/select"));
    WebElement three_nights=driver.findElement(By.xpath("//option[contains(text(),'3 nights')]"));
    WebElement login_link=driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
    WebElement email_txt_field=driver.findElement(By.id("sl-login-email"));
    WebElement password_txt_field=driver.findElement(By.xpath("sl-login-password"));
    WebElement login_Button=driver.findElement(By.xpath("sl-login-password"));
    WebElement Login_error_message=driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[1]"));
  
}
