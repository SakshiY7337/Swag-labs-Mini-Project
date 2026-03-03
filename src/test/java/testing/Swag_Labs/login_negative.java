package testing.Swag_Labs;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class login_negative extends swag_labs_launch {
	
	
//	Verify error message area is displayed properly. 
	@Test
	void error_msg() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("gdfhfh");
		driver.findElement(By.id("password")).sendKeys("d6heg");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		
		String Error_msg= driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println("msg="+ Error_msg);
	}
}
