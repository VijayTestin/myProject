package pageobject;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectcomp_POM {

	@FindBy(xpath = "//button[@type='button'][@class='un btn btn-secondary'][2]")
	public static WebElement pricingbutton;
	@FindBy(xpath = "/html/body/div[1]/main/div/div[3]/div/div/div/div/div[2]/div[2]/div/div[1]/div/button")
	public static WebElement free;
	@FindBy(xpath = "/html/body/div[1]/main/div/div[3]/div/div/div/div/div[2]/div[2]/div/div[2]/div/button")
	public static WebElement Essential;
	@FindBy(xpath="/html/body/div[1]/main/div/div[3]/div/div/div/div/div[2]/div[2]/div/div[3]/div/button")
	public static WebElement Adventagepro;
	@FindBy(xpath = "//button[@aria-label='Close Tour']")
	public static WebElement skiptour;
	@FindBy(xpath = "//input[@placeholder='Your property name']")
	public static WebElement yourhotel;
	@FindBy(xpath = "//input[@type='checkbox'][@class='form-check-input']")
	public static List <WebElement> comphotel;
	@FindBy(xpath = "/html/body/div[1]/main/div/div/div[3]/div[2]/div[2]/div/div[1]/div/div[2]/div")
	public static java.util.List<WebElement> yourproplist;
	@FindBy(xpath = "//button[@type='button'][text()='Get Metrics']")
	public static WebElement getmetrics;
	
	WebDriver driver;
	
	public   Selectcomp_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickpricing(){
		pricingbutton.click();
		
	}
	public void selectpackage() throws InterruptedException {
		free.click();
		Thread.sleep(2000);
		
		skiptour.click();
		
		}
	public void selectyourhotel(String string) throws InterruptedException {
		yourhotel.sendKeys(string);
		System.out.println(yourproplist);
		for(WebElement yours:yourproplist) {
			if(yours.getText().trim().contains(string)){
			yours.click();
			WebDriverWait wait=new WebDriverWait(this.driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(yours));
		
				System.out.println(yours.getText());
			}
			
		}
	}
	public void selectcomphotel() {
for(int i=0;i<4;i++) {
	comphotel.get(i).click();
}}
public void clickgetmetrics() {
	getmetrics.clear();
}
		
	}

