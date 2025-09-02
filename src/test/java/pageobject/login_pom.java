package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pom {
	@FindBy(xpath = "//button[@id='combo']")
	public static WebElement home_login;
	@FindBy(xpath = "//input[@name='email']")
	public static WebElement email;
	@FindBy(xpath="//input[@name='password']")
	public static WebElement password;
	@FindBy(xpath = "//button[@name='submit']")
	public static WebElement submit;
	@FindBy(xpath = "//a[@class='auth0-lock-alternative-link']")
	public static WebElement forgotpassword;
	@FindBy(xpath = "/html/body/div/div/div[2]/form/div/div/div/div/div[2]/div[1]/div/div/span/span")
	public static WebElement logerror;
	WebDriver driver;
	public login_pom(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clicklogin() {
		home_login.click();
	}
	public void email_password(String Email,String Password) {
		email.sendKeys(Email);
		password.sendKeys(Password);
	}
public void clicksignin() {
	submit.click();
	System.out.println("button clicked");
}
	
public void printerror() {
String errormessage=	logerror.getText();
	System.out.println(errormessage);
}}

