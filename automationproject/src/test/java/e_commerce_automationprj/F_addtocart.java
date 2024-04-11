package e_commerce_automationprj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class F_addtocart {
	public F_addtocart(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Chloe Compete Tank']")
	public WebElement header;

	@FindBy(xpath = "//div[@id='option-label-size-143-item-167']")
	public WebElement size;

	@FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
	public WebElement color;

	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement add;

	@FindBy(xpath = "//a[@class='action showcart']")
	public WebElement cart;

	@FindBy(xpath = "//span[text()='View and Edit Cart']")
	public WebElement show_cart;

	public void product_header() throws InterruptedException {
		String order2 = header.getText();
		System.out.println("item name=" + order2);
		Assert.assertEquals("Chloe Compete Tank", order2);
	}

	public void product_name() throws InterruptedException {

		size.click();
		color.click();
		Thread.sleep(3000);

		add.click();
		Thread.sleep(3000);

		cart.click();
		Thread.sleep(4000);

		show_cart.click();
		Thread.sleep(3000);

	}

}
