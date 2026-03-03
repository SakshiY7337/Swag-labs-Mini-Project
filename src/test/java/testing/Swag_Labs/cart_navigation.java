package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class cart_navigation extends swag_labs_launch {

//	Verify clicking cart icon navigates to Cart page.
	@Test
	void cart() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		
	}
	
//	Verify cart page displays selected products.
//	Verify cart count matches number of selected items.
	@Test
	void cart2() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.navigate().back();

		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		 
		
	}
}
