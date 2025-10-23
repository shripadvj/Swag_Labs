package Assignment.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCheck {

	@FindBy(xpath = "//*[@id=\"first-name\"]")
	private WebElement firstName;

	@FindBy(xpath = "//*[@id=\"last-name\"]")
	private WebElement lastName;

	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	private WebElement zipCode;

	@FindBy(xpath = "//input[@class ='btn_primary cart_button']")
	private WebElement continu;



	public PageCheck(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getContinu() {
		return continu;
	}

}
