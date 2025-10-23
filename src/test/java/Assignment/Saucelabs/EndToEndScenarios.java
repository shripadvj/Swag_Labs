package Assignment.Saucelabs;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Assignment.pom.Cart;
//import Assignment.pom.CheckPage;
import Assignment.pom.FinalOrderConfirmation;
import Assignment.pom.OrderConfirmation;
import Assignment.pom.PageCheck;
import Assignment.pom.ProductsPage;

public class EndToEndScenarios extends BaseClass{
	@Test
	public void endtoend() throws EncryptedDocumentException, IOException
	{
		File f = new File();
		String homeUrl = f.ExcelData("SauceData", 10, 0);

		String currentUrl = driver.getCurrentUrl();

		assertEquals(homeUrl, currentUrl);

		ProductsPage Pp=new ProductsPage(driver);
		Pp.setAddToCart1();
		Pp.setAddToCart2();

		Pp.setCartButton();

		Cart cart=new Cart(driver);

		List<WebElement> products = cart.getCartProducts();
		String p1 = products.get(0).getText();
		String p2 = products.get(1).getText();



		String product1 = f.ExcelData("SauceData", 13, 0);
		String product2 = f.ExcelData("SauceData", 13, 1);


		if(p1.equalsIgnoreCase(product1) && p2.equalsIgnoreCase(product2))
				{
			Reporter.log("cart validated", true);
				}
		else
		{
			Reporter.log("cart is not validated", true);
			Assert.fail();
		}
		
		cart.getCheckOutBtn().click();
		
		PageCheck page=new PageCheck(driver);
		
		String firstname = f.ExcelData("SauceData", 7, 0);
		String lastname = f.ExcelData("SauceData", 7, 1);
		String zipcode =f.ExcelData("SauceData", 7, 2);

		page.getFirstName().sendKeys(firstname);
		page.getLastName().sendKeys(lastname);
		page.getZipCode().sendKeys(zipcode);
		
		page.getContinu().click();

		OrderConfirmation ordPage=new OrderConfirmation(driver);

		List<WebElement> ordProd = ordPage.getCartProduct();
		String prod1 = ordProd.get(0).getText();
		String prod2 = ordProd.get(1).getText();



		if(prod1.equals(product1) && prod2.equals(product2))
		{
			Reporter.log("Order summary is successfully validated", true);
		}
		else
		{
			Reporter.log("Order summary is not validated", true);
			Assert.fail();
		}
		
		ordPage.getFinish().click();

		FinalOrderConfirmation last=new FinalOrderConfirmation(driver);

		String confirmMsg = last.getFinalConfirmation().getText();

		Reporter.log(confirmMsg, true);






	}





}



