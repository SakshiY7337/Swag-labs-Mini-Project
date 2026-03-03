package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class checkout_functionality extends swag_labs_launch {
	
//	 Verify clicking “Checkout” redirects to Checkout Information page.
	
	@Test(priority=1)
	void checkout_btn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkout")).click();
		
	}
	
//	Verify user can enter valid First Name.
	@Test(priority=2)
	void firstname() {
		
		driver.findElement(By.id("first-name")).sendKeys("sakshi");
		
//		 Verify error message appears when First Name is empty. 
		//driver.findElement(By.id("first-name")).sendKeys("");
	}
	
//	Verify user can enter valid Last Name.
	@Test(priority=3)
	void lastname() {
		driver.findElement(By.id("last-name")).sendKeys("1234");
		
//	Verify error message appears when Last Name is empty.
		//driver.findElement(By.id("last-name")).sendKeys("   ");
		
	}
	
//	Verify user can enter valid Postal Code.
	@Test(priority=4)
	void pcode() {
		driver.findElement(By.id("postal-code")).sendKeys("415106");
//		 Verify error message appears when Postal Code is empty.
		//driver.findElement(By.id("postal-code")).sendKeys("415106");
		
	}
	
//	 Verify Continue button works with valid data.
	@Test(priority=5)
	void cont_btn() {
		
		driver.findElement(By.id("continue")).click();
		
	}
	
//	Verify Cancel button redirects to Cart page.
	@Test(priority=6)
	void cancel_btn() {
		//driver.findElement(By.id("cancel")).click();
	}
	
}
