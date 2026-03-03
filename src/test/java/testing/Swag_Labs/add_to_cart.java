package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class add_to_cart extends swag_labs_launch {
	
	
//	Verify user can click “Add to Cart” for a product. 
	@Test(priority=1)
	void click_addtocart() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}

	
//	Verify user can add multiple products.
	@Test(priority=2)
	void multiple_product() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
	
	
//	Verify user can remove product from Products page. /
	@Test(priority=3)
	void remove_product() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
	
	
}
