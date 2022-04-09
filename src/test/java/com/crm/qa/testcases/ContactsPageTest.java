package com.crm.qa.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends BaseTest{
	LoginPage loginpage;
	HomePage  homepage;
	TestUtil testutil;
	ContactsPage contactpage;
	public ContactsPageTest(){
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException{
		intialization();
		contactpage = new ContactsPage();
		testutil =new TestUtil();
		loginpage = new LoginPage();
		homepage =loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.SwtichToFrame();
		contactpage= homepage.clickonContactsLink();
	  }
	@Test(priority=1)
	public void verfiyContactTest() {
      AssertJUnit.assertTrue("contactlabel didn't appear", contactpage.verifyContactLabel()); 
     }
	@Test(priority=2)
	public void selectContactNameTest() {
		contactpage.selectContacts("pradeep vemula");
	}
	@AfterMethod
	public void closebrowser() {
		d.close();
	}
}


