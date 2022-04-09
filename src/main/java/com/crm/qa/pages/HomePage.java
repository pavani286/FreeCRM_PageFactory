package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.BaseTest;

public class HomePage extends BaseTest{

	@FindBy(xpath="//td[@align='left'and @class='headertext']")
	WebElement UserNameLabel;
	
	@FindBy(xpath ="//a[@title ='Contacts']")
	WebElement ContactsLink;
	
	@FindBy(xpath ="//a[@title ='Deals']")
	WebElement DealsLink;
	
	@FindBy(xpath ="//a[@title ='Tasks']")
	WebElement TasksLink;
	
	
	//Initializing the object
	public HomePage(){
		PageFactory.initElements(d, this);
	}
	
	//Actions (or) Features
	public String validateHomePageTitle(){
		return d.getTitle();
	}
	
	public boolean VerifyCorrectusername() {
		return UserNameLabel.isDisplayed();
	  }
	
	public ContactsPage clickonContactsLink(){
		ContactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickonDealsPage(){
		DealsLink.click();
		return new DealsPage();
	}
	public TasksPage clickonTasksLink(){
		TasksLink.click();
		return new TasksPage();
	}
	
	
}
