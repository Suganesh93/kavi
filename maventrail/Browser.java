package maventrail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
		
		
		
			
			WebDriver driver;
			@Test
			public void logInPage() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\HotelProject\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://adactinhotelapp.com/");
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("Suganesh");
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("Sugan@123");
				WebElement login = driver.findElement(By.id("login"));
				login.click();
				
			}
		private void bookingPage() {
			
			

		}

		
	
	
		
	

}
