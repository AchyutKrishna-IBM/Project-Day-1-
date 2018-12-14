package com.ibm.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
    WebDriverWait wait;

	@FindBy(name="email")
	WebElement emailEle;
	
	@FindBy(name="pword")
	WebElement passEle;
	
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/form/button")
	WebElement loginEle;
	
	public Login(WebDriver driver,WebDriverWait wait) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=wait;
	}

	public void enterEmailAddress(String userName)
	{
		emailEle.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		passEle.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		loginEle.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
 public Login(WebDriver driver)
 {
	 this.driver=driver;
 }

	@BeforeSuite
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void login() throws FileNotFoundException, IOException {

		Properties p = new Properties();
		p.load(new FileInputStream("TestData/data.properties"));
		driver.get(p.getProperty("url"));
		driver.findElement(By.name("email")).sendKeys(p.getProperty("user"));
		driver.findElement(By.name("pword")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
		Assert.assertTrue(driver.findElement(By.partialLinkText("Logout")).isDisplayed());

	}*/

}
