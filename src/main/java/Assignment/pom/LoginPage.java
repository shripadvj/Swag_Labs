package Assignment.pom;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="user-name")
	private WebElement user;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);   	

	}
	public void  setLogin(String un,String pw) {


		user.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		
	}
	
}