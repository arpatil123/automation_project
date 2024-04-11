package e_commerce_automationprj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class A_testscenarios {
	public WebDriver driver;

	@BeforeTest 

	public void launchbrowser() {

		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\LENOVO\\\\Desktop\\\\seleniumchrome\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
        System.out.println(driver.getTitle().length());
        String actualresult=driver.getTitle();
         String expectedresult=("Home Page");
         
        System.out.println(actualresult.equals(expectedresult));     //chk equlity
        System.out.println(actualresult.equalsIgnoreCase(expectedresult));
        System.out.println("chk contains:"+actualresult.contains("Page"));     
        
        String currenturl=driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl().length());
        
        if(actualresult.length()>currenturl.length())
        {
       	 System.out.println("pass");
        }
        else
        {
       	 System.out.println("fail");
        }
        boolean actuallogo =  driver.findElement(By.xpath("//a[@class='logo']")).isDisplayed();               
		 System.out.println("logo test is successfully="+actuallogo);
	}
	
	@Test (priority = 1)
	public void signin() {
		System.out.println("sign in successfull");

		B_login_of_customer sign=new B_login_of_customer(driver);
		sign.signin_click();
		sign.account_click();

	}
	
	@Test (priority = 2)
	public void customer_info() {
		System.out.println("create account successfully");
		C_customer_details info=new C_customer_details(driver);

		info.first_name("ash");

		info.last_name("patil");
		
		info.setemail("ashwinigf@gmail.com");

		info.setpass("Ncb@4636fj56");

		info.setpass2("Ncb@4636fj56");

		info.acc_click();
		

	}
	
	@Test (priority = 3)
	public void searchbox() {
		System.out.println("search item in searchbox");

		D_home_page search1=new D_home_page(driver);
		boolean bar=search1.isdisplayed();
		 System.out.println("search button is displayed="+bar);

		search1.itemsearch_click("women blue dress");
		search1.itemsearchsction_click();
		
       
	}
	
	@Test (priority = 4)
	public void listpage() throws InterruptedException {
		System.out.println("product list");

		E_selectproduct search2=new E_selectproduct(driver);

		search2.product_click();

	}
	@Test (priority = 5)
	public void product_details() throws InterruptedException {
		System.out.println(" product details ");

		F_addtocart search3=new F_addtocart(driver);
		
		search3.product_header();
		Thread.sleep(3000);

		search3.product_name();

	}
	
	@Test (priority = 6)
	public void shopping_cartdetails() throws InterruptedException {
		System.out.println("click on proceed to checkout");

		G_shopping_cart search4=new G_shopping_cart(driver);
	

		search4.checkout_click();
	Thread.sleep(2000);


	}	
	@Test (priority = 7)
	public void shipping_page() throws InterruptedException {
	
		System.out.println("shipping details ");

		H_shipping_page search5=new H_shipping_page(driver);


		search5.setemail("ashwidfdf@gmail.com");
		
		search5.first_name("ash");

		search5.last_name("patil");

		search5.company_name("tcs");
		
		search5.street_name("hingwadi,pune");
		


		search5.city_name("pune");
		Thread.sleep(2000);

		search5.country_name(104);


		Thread.sleep(2000);


		search5.zip_code("425424");
		Thread.sleep(2000);

		search5.mob_no("7864235463");
		
		search5.state_name("Goa");
		Thread.sleep(3000);

		search5.button();

	}	
	@Test (priority = 8)
	public void payment_details() throws InterruptedException {
		System.out.println("place order");

		I_payment pay=new I_payment(driver);
		Thread.sleep(2000);

		 pay.text();
			Thread.sleep(2000);

		 pay.clickble();
  

	}
	@Test (priority = 9)
	public void confirmdetails() throws InterruptedException
	{
		System.out.println("confirm order");

		J_orderconfirm demo=new J_orderconfirm(driver);
		 demo.complete();

	}
	
}
//@AfterTest

//public void last() throws InterruptedException
//{
	//.close();
//}
//}


