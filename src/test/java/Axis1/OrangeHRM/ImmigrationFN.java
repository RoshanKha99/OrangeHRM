package Axis1.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class ImmigrationFN extends Login{

	@AfterMethod
	public void immi() {
		WebDriver driver = Login.driver;
		
			
			WebElement immi=driver.findElement(By.xpath("(//div[@class=\"orangehrm-tabs-wrapper\"])[5]"));
			immi.click();
			System.out.println("Clicked on Immigration");
		WebElement AddImmi = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[1]"));
		AddImmi.click();
		System.out.println("Clicked on Add Details");
		WebElement Visa = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		Visa.click();
		System.out.println("Select visa as document");
		WebElement Number = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		Number.click();
		Number.sendKeys("3451323452244345");
		System.out.println("Number Entered");
		
		
		WebElement issue_date = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		issue_date.click();
		issue_date.sendKeys("2023-01-01");
		System.out.println("Issue Date Selected");
		
		WebElement expiry_date = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		expiry_date.click();
		expiry_date.sendKeys("2026-01-01");
		System.out.println("Expiry Date Selected");

		WebElement eligiblestatus = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("Eligible");
		System.out.println("Eligible Status Added");
		
		WebElement review_date = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
		review_date.click();
		review_date.sendKeys("2023-08-03");
		System.out.println("Review Date Selected");
		
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("Immigration details adding");
		System.out.println("Comment added successfully");
		
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Data is Saved");
		
		
	}

}