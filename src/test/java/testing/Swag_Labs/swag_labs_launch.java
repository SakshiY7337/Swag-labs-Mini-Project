package testing.Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class swag_labs_launch {

EdgeDriver driver;
	
	@BeforeTest
	void launch() {
		
		//configure webdriver
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\sakshicorejava\\automation_testing21jan\\drivresor\\msedgedriver.exe");
				
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
}
