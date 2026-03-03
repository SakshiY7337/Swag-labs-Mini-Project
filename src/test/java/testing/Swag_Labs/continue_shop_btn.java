package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class continue_shop_btn extends swag_labs_launch {

	@Test
	void btn() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("continue-shopping")).click();
		}
}
