package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class footer_links extends swag_labs_launch {

	@Test
	void f_links() throws InterruptedException {
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
	driver.findElement(By.id("finish")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.linkText("Twitter")).click();
	
	driver.findElement(By.linkText("Facebook")).click();
	
	driver.findElement(By.linkText("LinkedIn")).click();
	
	}	
}
