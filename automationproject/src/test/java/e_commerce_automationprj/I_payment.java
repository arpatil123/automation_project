package e_commerce_automationprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class I_payment {
	public I_payment(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='$44.00' and @class='price']")
	public WebElement total;

	@FindBy(xpath = "//button[@class='action primary checkout']")
	public WebElement order;

	public void text() throws InterruptedException {
		String total1 = total.getText();
		System.out.println("total order price=" + total1);
		Assert.assertEquals("$44.00", total1);

	}

	public void clickble() {
		order.click();

	}
}
