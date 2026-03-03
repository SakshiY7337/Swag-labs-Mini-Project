package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class product_page extends swag_labs_launch{

//	Verify user is redirected to Products page after successful login. 
	@Test(priority=1)
	void navigate_product_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
	}
	
	
//	Verify page title displays “Products”. 
	@Test(priority=2)
	void page_title() {
		
		String title = driver.findElement(By.xpath("//span[@class='title']")).getText();
	    
	    System.out.println("Page Title is: " + title);
	    
	}
	
	
//	Verify product names are displayed correctly. 
	@Test(priority=3)
	void product_name() {
		
		String name = driver.findElement(By.xpath("//div[@class='inventory_item_name ']")).getText();
	    
	    System.out.println("Product name is: " +name);
	    
	}
	
//	Verify product descriptions are visible. 
	@Test(priority=4)
	void product_desp() {
		String p_description = driver.findElement(By.xpath("//div[@class='inventory_item_desc']")).getText();
	    
	    System.out.println("Product description is: " +p_description);
	}
	
}
