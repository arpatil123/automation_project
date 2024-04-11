package e_commerce_automationprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class J_orderconfirm {
	public J_orderconfirm(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Thank you for your purchase!']")
	public WebElement done;

	public void complete() {
		// TODO Auto-generated method stub
		String order1 = done.getText();
		System.out.println("total order price=" + order1);
		Assert.assertEquals("Thank you for your purchase!", order1);
	}
}
