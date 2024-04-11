package e_commerce_automationprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_customer_details {
	public C_customer_details(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstname")
	public WebElement first;

	@FindBy(name = "lastname")
	public WebElement last;

	@FindBy(name = "email")
	public WebElement email;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "password_confirmation")
	public WebElement password_cfr;

	@FindBy(xpath = "//button[@class='action submit primary']")
	public WebElement account2;

	public void first_name(String arg1) {

		first.sendKeys(arg1);
	}

	public void last_name(String arg1) {
		last.sendKeys(arg1);

	}

	public void setemail(String arg1) {
		email.sendKeys(arg1);
	}

	public void setpass(String arg1) {
		password.sendKeys(arg1);
	}

	public void setpass2(String arg1) {
		password_cfr.sendKeys(arg1);
	}

	public void acc_click() {
		account2.click();
	}

}
