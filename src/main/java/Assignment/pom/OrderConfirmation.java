package Assignment.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {
	public OrderConfirmation(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "inventory_item_name")
	private List<WebElement> cartProduct;
	
	@FindBy(xpath = "//a[@class='btn_action cart_button']")
	private WebElement finish;

	public WebElement getFinish() {
		return finish;
	}

	public List<WebElement> getCartProduct() {
		return cartProduct;
	}

		}

	
			



