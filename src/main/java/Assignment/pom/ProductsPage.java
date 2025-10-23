package Assignment.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[1]")
	private WebElement AddToCart1;

	@FindBy(xpath = "(//button[@class=\"btn_primary btn_inventory\"])[3]")
	private WebElement AddToCart2;

	@FindBy(id="shopping_cart_container")
	private WebElement CartButton;

	@FindBy(xpath = "//button[text()='Open Menu']")
	private WebElement burgerBtn;

	@FindBy(id="logout_sidebar_link")
	private WebElement lgOutBtn;


	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//For runtime initialization

	}
	public void setAddToCart1() 
	{
		AddToCart1.click();//to click
	}
	public void setAddToCart2() {
		AddToCart2.click();
	}


	public void setCartButton() {
		CartButton.click();// to click
	}


	public void setLogout() {
		
		burgerBtn.click();
		lgOutBtn.click();
		
	}


	


	}
