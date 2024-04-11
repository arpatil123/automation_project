package e_commerce_automationprj;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D_home_page {
	public D_home_page(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "search")
	public WebElement search;

	@FindBy(xpath = "//button[@class='action search']")
	public WebElement searchaction;

	public boolean isdisplayed() {
		boolean searchbar = search.isDisplayed();
		return searchbar;

	}

	public void itemsearch_click(String arg1) {
		search.sendKeys(arg1);

	}

	public void itemsearchsction_click() {
		searchaction.click();

	}

}