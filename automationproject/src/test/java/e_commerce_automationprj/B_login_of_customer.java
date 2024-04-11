package e_commerce_automationprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_login_of_customer {

	public B_login_of_customer(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign In")
	public WebElement sign;

	@FindBy(xpath = "//a[@class='action create primary']")
	public WebElement account;

	public void signin_click() {
		sign.click();
	}

	public void account_click() {
		account.click();
	}

}
