package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(name = "username")
	WebElement Username;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtnLabel;
	
	//Initializing the object
	public LoginPage()
	{
		PageFactory.initElements(d, this);
	}
	//Actions
	public String validateLoginPageTitle()
	{
		return d.getTitle();
	}
	
	public HomePage Login(String un,String pwd) throws InterruptedException
	{
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		//LoginBtn.click();
		Actions act = new Actions(d);
		act.moveToElement(loginbtnLabel).build().perform();
		WebDriverWait wait = new  WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOf(LoginBtn));
		Thread.sleep(2000);
		LoginBtn.click();
		
		return new HomePage();
	}
}
	
