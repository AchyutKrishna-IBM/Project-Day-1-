package com.ibm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminPage{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//*[@id='side-menu']/li[2]/a")
	WebElement catalogEle;
	@FindBy(xpath="//*[@id='side-menu']/li[2]/ul/li[1]/a")
	WebElement tabEle;
	@FindBy(xpath="//a[@title='Add New']")
	WebElement addNewEle;
	@FindBy(xpath="//input[@name='name']")
	WebElement tabNameEle;
	@FindBy(xpath="//input[@name='sort']")
	WebElement sortOrderEle;
	@FindBy(xpath="//select[@name='status']")
	WebElement statusEle;
	@FindBy(xpath="//*[@id='page-wrapper']/div/form/div[1]/button/i")
	WebElement saveEle;
	@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]")
	WebElement succesmessageEle;
	@FindBy(xpath="//input[@type='search']")
	WebElement searchEle;
	@FindBy(xpath="//table[@id='dataTableExample2']/tbody/tr/td[2]")
	WebElement addedTabNameEle;
	@FindBy(xpath="//table[@id='dataTableExample2']/tbody/tr/td[3]")
	WebElement addedSortOrderEle;
	@FindBy(xpath="//table[@id='dataTableExample2']/tbody/tr/td[4]")
	WebElement addedStatusEle;
	
	public AdminPage(WebDriver driver,WebDriverWait wait)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=wait;
	}
	public void clickOnCatalog()
	{
		catalogEle.click();
	}
	public void clickOnTabs()
	{
		tabEle.click();
	
	}
	public void clickOnAddNew()
	{
		addNewEle.click();
}
	public void enterTabName(String tabName)
	{
		tabNameEle.sendKeys(tabName);
	}
	public void enterSortOrder(String sortOrder)
	{
		sortOrderEle.sendKeys(sortOrder);
	}
	public void selectStatus(String status)
	{
		Select s = new Select(statusEle);
		s.selectByVisibleText(status);
	}
	public void clickOnSave()
	{
		saveEle.click();
	}
	public void successMessageConfirmation()
	{
		String str = succesmessageEle.getText().trim();
		Assert.assertTrue(str.contains("Success: You have successfully inserted new tab!"));
	}
	public void searchTab(String searchTab)
	{
		searchEle.sendKeys(searchTab);
	}
	
	public void addedTabNameCheck(String addedtab)
	{
		if (addedTabNameEle.getText().trim().equals(addedtab)) {
			System.out.println("Tab Name is displayed properly");
		}
	}
	public void addedSortOrderCheck(String addedsortorder)
	{
		if (addedSortOrderEle.getText().trim().equals(addedsortorder)) {
			System.out.println("Sort Order is displayed properly");
	}
	}
	public void addedStatusCheck(String addedstatus)
	{
		if (addedStatusEle.getText().trim().equals(addedstatus)) {
			System.out.println("Status is displayed properly");
		}
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
