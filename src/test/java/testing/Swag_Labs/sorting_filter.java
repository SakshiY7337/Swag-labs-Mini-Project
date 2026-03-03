package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sorting_filter extends swag_labs_launch {

	
//	Verify default sorting is “Name (A to Z)”. 
	@Test
	void  sort1() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		Select sel =new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		sel.selectByValue("az");
		
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();	
	}
	
	
	
//	Verify sorting by “Name (Z to A)” works correctly.
	@Test
	void  sort2() throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		Select sel =new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		sel.selectByValue("za");
	}
	
	
	
//	 Verify sorting by “Price (Low to High)” works correctly. 
	@Test
	void  sort3() throws InterruptedException {
		

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		Select sel =new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		sel.selectByValue("lohi");
	}
	
	
//	 Verify sorting by “Price (High to Low)” works correctly.
	@Test
	void  sort4() throws InterruptedException {
		

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		Select sel =new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		sel.selectByValue("hilo");
	}
	
}
