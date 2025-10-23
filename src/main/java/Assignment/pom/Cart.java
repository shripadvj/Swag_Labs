package Assignment.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	public Cart(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private List<WebElement> cartProducts;
	
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	private WebElement checkOutBtn;

	public List<WebElement> getCartProducts() {
		return cartProducts;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}
    
	
	
	

}
