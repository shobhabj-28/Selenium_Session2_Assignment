package com.ibm.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Register_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://magento.com");

		
		  
		  //WebElement companyEle= driver.findElement(By.xpath("//select[@name='companytype']"));
		  //Select select =new (Select(companyEle));
		 
		WebElement myAccountEle = driver.findElement(By.linkText("My Account"));
		myAccountEle.click();
		
		//Thread.sleep(10000);
	
		
		WebElement registerEle=driver.findElement(By.xpath("//span[text()='Register']/ancestor::button"));
		registerEle.click();
		
		WebElement firstNameEle=driver.findElement(By.id("firstname"));
		firstNameEle.sendKeys("shobha");
		
		WebElement lastNameEle=driver.findElement(By.id("lastname"));
		lastNameEle.sendKeys("b");
		
		WebElement emailAddressEle = driver.findElement(By.id("email_address"));
		emailAddressEle.sendKeys("shobha.mce2003@gmail.com");
		
		Select oSelect = new Select(driver.findElement(By.id("country")));
		oSelect.selectByVisibleText("India");
		
		Select oSelect1 = new Select(driver.findElement(By.id("customer_company_type")));
		oSelect1.selectByVisibleText("Is a merchant who sells online");
		
		Select oSelect2 = new Select(driver.findElement(By.id("customer_individual_role")));
		oSelect2.selectByVisibleText("Technical/developer");
		
		WebElement passWordEle=driver.findElement(By.id("password"));
		passWordEle.sendKeys("Welcome1234");
		
		WebElement confirmpassWordEle=driver.findElement(By.id("confirmation"));
		confirmpassWordEle.sendKeys("Welcome1234");
		
		WebElement checkBoxEle=driver.findElement(By.id("agree_terms"));
		checkBoxEle.click();
		
		WebElement registerSubmitEle=driver.findElement(By.xpath("//span[text()='Submit']/ancestor::button"));
		registerSubmitEle.click();
		
		
	}
}
