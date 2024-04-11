package e_commerce_automationprj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E_selectproduct {
	public E_selectproduct(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='products wrapper grid products-grid']/ol/li[2]")
	public WebElement item;

	public void product_click() {
		item.click();

	}
}