package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class checkout_overview extends swag_labs_launch {

//	Verify Cancel button redirects to Products page. 	
	@Test(priority=1)
	void checkout_view() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("sakshi");
		driver.findElement(By.id("last-name")).sendKeys("1234");
		driver.findElement(By.id("postal-code")).sendKeys("415106");
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("cancel")).click();
		
	}
}
