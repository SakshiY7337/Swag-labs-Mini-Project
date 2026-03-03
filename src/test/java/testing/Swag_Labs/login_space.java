package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class login_space extends swag_labs_launch {

//	Verify login fields do not accept only spaces. 	
	@Test
	void login_with_spaces() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("    ");
		driver.findElement(By.id("password")).sendKeys("   ");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
	}
	

}
