package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.BaseTest;

public class DealsPage extends BaseTest{
	@FindBy(xpath="//td[contains(text(),'Deals')]")
	WebElement DealsLabel;
	
	public DealsPage() {
		PageFactory.initElements(d, this);
	}
	
	public boolean verifyDealsLabel() {
		return DealsLabel.isDisplayed();
	}
	
	public void verifyDealId(String Dealname) throws InterruptedException {
		Thread.sleep(2000);
        d.findElement(By.xpath("//a[text()='"+Dealname+"']"
		+ "//parent::td[@class='datalistrow']"
		+ "//preceding-sibling::td[@class='datalistrow']//a[@context='deal']")).click();
	}
}
