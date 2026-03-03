package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class menu_functionality extends swag_labs_launch {
//	Verify menu button opens side menu. 
	@Test(priority=1)
	void menu() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
	}
	
//	Verify “All Items” link works.
	@Test(priority=2)
	void all_link() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("inventory_sidebar_link")).click();
	}
	
	
//	 Verify “About” link works. 
	@Test(priority=3)
	void about() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("about_sidebar_link")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
	}
	

//	Verify “Logout” link logs out successfully. 
	@Test(priority=4)
	void log_out() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(1000);
	
	
}

	

	
	
	
}
