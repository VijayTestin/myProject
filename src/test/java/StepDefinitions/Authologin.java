package StepDefinitions;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Rates_pom;
import pageobject.login_pom;

public class Authologin  {
static WebDriver driver;
String parentwindow;
String autho;
login_pom loginobj;
Rates_pom ratesobj;
@Given("^User is on Login page")
public void user_is_on_login_page() {
	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://beta.ratemetrics.com/");
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);   // Write code here that turns the phrase above into concrete actions
}

@Given("^User clicking login button")
public void user_clicking_login_button() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Going to click");
	loginobj=new login_pom(driver);
	
	loginobj.clicklogin();

	//driver.findElement(By.xpath("//button[@id='combo']")).click();
	  parentwindow=    driver.getWindowHandle();
	Set<String> newwindow=driver.getWindowHandles();
	for(String autho:newwindow) {
		driver.switchTo().window(autho);
		
	}
}



@When("^User Enters Valid Email and Password (.*) and (.*)")

public void user_enters_valid_email_and_password_and( String Email , String  Password) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions

	System.out.println(Email);
	System.out.println(Password.toString());
	loginobj.email_password(Email, Password);
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
//    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
//    
}
@When("^User Enters inValid Email and Password (.*) and (.*)")
public void user_enters_in_valid_email_and_password(String Email , String  Password) {
    // Write code here that turns the phrase above into concrete actions
	PageFactory.initElements(Authologin.driver, login_pom.class);
   loginobj.email_password(Email, Password);
   
 
}

@When("User clicked signin button")
public void user_clicked_signin_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	loginobj.clicksignin();
	driver.switchTo().window(parentwindow);
	
	
}


@Then("User should navigate to Rates Module")
public void user_should_navigate_to_rates_module() {
   
	ratesobj=new Rates_pom(driver);
	if(driver.getWindowHandle().equals(parentwindow))
	{	
		ratesobj.your_properity();
		System.out.println("Login sucesfull"+parentwindow);
	}
	else {
		
		System.out.println("invalid");
	}
	
	
	WebElement mydashboard= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/header/div/div/div[2]/span/button/i"));
	Actions act=new Actions(driver);
	driver.quit();
}}
