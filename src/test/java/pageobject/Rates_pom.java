package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rates_pom {

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[2]/h1/span")
	public static WebElement yourhotel;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div/div[1]/span/span[1]")
	public static WebElement plantype;
	WebDriver driver;
	public  Rates_pom(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		}
	public void your_properity() {
	String yourprop=yourhotel.getText();
	System.out.println(yourprop);
	String plan=plantype.getText();
	System.out.println(plan);
		System.out.println("Check");
		System.out.println("Check1");
	}
}
