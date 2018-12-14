package com.ibm.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ibm.initialization.WebDriverLaunch;
import com.ibm.pages.AdminPage;
import com.ibm.pages.Login;
import com.ibm.utilities.PropertiesFileHandler;

public class BaseTest extends WebDriverLaunch {
	
	    @Test
        public void positiveCredentials() throws FileNotFoundException, IOException
        {
		String url = p.getProperty("url");
		String UserName = p.getProperty("user");
		String Password = p.getProperty("password");
        driver.get(url);
		Login login = new Login(driver,wait);
		login.enterEmailAddress(UserName);
		login.enterPassword(Password);
		login.clickOnLogin();

        }
	   @AfterMethod
	    public void tabAddition()
	    {
		  
		   
	    	String TabName=p.getProperty("tabName");
	    	String SortOrder=p.getProperty("sortOrder");
	    	String Status=p.getProperty("status");
	    	String SearchTab=p.getProperty("search");
	    	AdminPage adm=new AdminPage(driver,wait);
	    	adm.clickOnCatalog();
	    	adm.clickOnTabs();
	    	adm.clickOnAddNew();
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='panel-title']/h4")));
	    	adm.enterTabName(TabName);
	    	adm.enterSortOrder(SortOrder);
	    	adm.selectStatus(Status);
	    	adm.clickOnSave();
	    	adm.successMessageConfirmation();
	    	adm.searchTab(SearchTab);
	    	adm.addedTabNameCheck(TabName);
	    	adm.addedSortOrderCheck(SortOrder);
	    	adm.addedStatusCheck(Status);
	    	
	    	
	    }
}
