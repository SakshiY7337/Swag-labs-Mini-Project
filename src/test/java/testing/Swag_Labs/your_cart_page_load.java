package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class your_cart_page_load extends swag_labs_launch {

//	Verify Cart page title displays “Your Cart”. 
	@Test
	void your_cart() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		String title=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		System.out.println("title="+title);
	}
	
	

	
	
}
