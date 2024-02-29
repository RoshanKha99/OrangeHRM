package Axis1.OrangeHRM;




	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.AfterMethod;

	public class JobDetails extends Login{
		
		@AfterMethod
		public void jobs() {

			WebDriver driver = Login.driver;
			WebElement jobDetails1 = driver.findElement(By.xpath("//a[normalize-space()='Job']"));
			jobDetails1.click();
			System.out.println("Clicked on Job");
			
			WebElement slider = driver.findElement(By.xpath("//div[@class='oxd-switch-wrapper']"));
			slider.click();
			System.out.println("Clicked on button now its showing Contract Details");
			

	}
	}

