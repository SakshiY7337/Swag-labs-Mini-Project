package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class product_detail_navigation extends swag_labs_launch{

//	Verify clicking product name opens product detail page.
	
	@Test(priority=1)
	void product_detail() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		
		
//		verify “Back to Products” button returns to Products page 
		Thread.sleep(1000);
		driver.findElement(By.name("back-to-products")).click();
			
	}
	
	
//	verify clicking product image opens product detail page. 
	@Test(priority=2)
	void image() throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"item_0_img_link\"]/img")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("back-to-products")).click();
		
		
		
	}

}
