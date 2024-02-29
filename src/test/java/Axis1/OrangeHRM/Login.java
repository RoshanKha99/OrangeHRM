package Axis1.OrangeHRM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Login {
	public static WebDriver driver;
	@Test
	public void logintest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Roshan Khapekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); 
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
	        Username.sendKeys("Admin");
	        System.out.println("username entered");
	        
	        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
	        Password.sendKeys("admin123");
	        System.out.println("password entered");
	        
	        WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	        LoginButton.click();
	        System.out.println("Clicked on login");
	        WebElement myinfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
			myinfo.click();
			System.out.println("Clicked on Myinfo");
	
	
	}}
