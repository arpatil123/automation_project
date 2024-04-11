package e_commerce_automationprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class G_shopping_cart {

	public G_shopping_cart(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	public WebElement check;

	public void checkout_click() {
		check.click();

	}

}
