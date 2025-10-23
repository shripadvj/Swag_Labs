package Assignment.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalOrderConfirmation {
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
     private WebElement FinalConfirmation;
	
	public FinalOrderConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
		public WebElement getFinalConfirmation() {
			return FinalConfirmation;
		}
}