package e_commerce_automationprj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class H_shipping_page {
	
	public H_shipping_page(WebDriver driver){
		
		  PageFactory.initElements(driver,this);  	
}
	
	@FindBy (xpath ="//fieldset[@id='customer-email-fieldset']/div/div/input")
	public WebElement email;
	
	
	
	@FindBy (xpath ="//input[@name='firstname']")
	public WebElement first;
	
	
	
	@FindBy (xpath ="//input[@name='lastname']")
	public WebElement last;
	
	@FindBy (xpath ="//input[@name='company']")
	public WebElement item;
	
	@FindBy (xpath ="//input[@name='street[0]']")
	public WebElement srt;
	
	@FindBy (xpath ="//input[@name='city']")
	public WebElement cty;
	
	@FindBy (xpath ="//select[@name='region_id']")
	
	public WebElement region;
	


	
	@FindBy (xpath ="/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")
	public WebElement code;
	
	@FindBy (xpath ="//select[@name='country_id']")
	public WebElement country;

	
	
	@FindBy (xpath ="//input[@name='telephone']")
	public WebElement number;
	
	@FindBy (xpath ="//span[text()='Next']")
	WebElement next;

	public void setemail(String arg1 )
	{
		
		email.sendKeys(arg1);
	}


	public void first_name( String arg1) {
		
		first.sendKeys(arg1);
	}
	
	public void last_name(String arg1 )
	{
		last.sendKeys(arg1);
		
	}
	

	public void company_name(String arg1 )
	{
		item.sendKeys(arg1);
	}
	
	public void street_name(String arg1 )
	{
		srt.sendKeys(arg1);
	}
	
	public void city_name(String arg1 )
	{
		cty.sendKeys(arg1);
	}

	
	public void state_name(String string)
	{
		Select dropdown3 = new Select(region);  
		   dropdown3.selectByVisibleText(string);
		 
	}
	
	
	
	public void zip_code(String string )
	{
		code.sendKeys(string);
	}
	
	public void country_name(int index1 )
	{
		Select dropdown2 = new Select(country);  
		   dropdown2.selectByIndex(index1);


	}
	
	public void mob_no(String string )
	{
		number.sendKeys(string);
	}
	
	public void button() {
		next.click();
	}
	

	

}
