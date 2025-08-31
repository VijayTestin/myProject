package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Selectcomp_POM;

public class Selectcompetitor  {
	WebDriver driver;
	Selectcomp_POM compobj;
	
	@Given("user should be on Select comp page")
	public void user_should_be_on_select_comp_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.ratemetrics.com/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);  
		
	driver.get("https://beta.ratemetrics.com/");
	Thread.sleep(3000);

	
	}
		
			
	@Given("Get the package details")
	public void get_the_package_details() throws InterruptedException {
		compobj=new Selectcomp_POM(driver);
		
		compobj.clickpricing();
		compobj.selectpackage();
	
	}

	@When("User selecting your hotel {string}")
	public void user_selecting_your_hotel(String string) throws InterruptedException {
		compobj=new Selectcomp_POM(driver);
		compobj.selectyourhotel(string);
	}

	@When("User selecting theri competitor page")
	public void user_selecting_theri_competitor_page() {
		compobj=new Selectcomp_POM(driver);
		compobj.selectcomphotel();
	}

	@When("Click on get metrics button")
	public void click_on_get_metrics_button() {
		compobj=new Selectcomp_POM(driver);
		compobj.clickgetmetrics();
	}


	@Then("Free rateshop is created")
	public void free_rateshop_is_created() {
	   
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}


}
