package Test;


import org.testng.annotations.Test;


import Gen.PropertyReader;
import Pages.RecruitmentPage;

public class RecruitmentTests extends BaseTests
{
	RecruitmentPage R=new RecruitmentPage();
	
	
	
	@Test(priority = 0)
public void VerifyLogin() throws InterruptedException
	{
		R.OpenWebsite();
		Thread.sleep(3000);
		PropertyReader.initProperty();
		R.enterUsername(PropertyReader.getProperty("login.username"));
		Thread.sleep(3000);
		R.enterPassword(PropertyReader.getProperty("login.password"));
		Thread.sleep(3000);
		R.clickLogin();
		R.Actions();
	}	

	@Test(priority = 1)
	public void Add() throws InterruptedException
	{
		R.AddCandidate(PropertyReader.getProperty("A.firstName"),PropertyReader.getProperty("A.middleName"),PropertyReader.getProperty("A.lastName"),PropertyReader.getProperty("A.email"),PropertyReader.getProperty("A.contactNo"),PropertyReader.getProperty("A.keyWords"),PropertyReader.getProperty("A.comment"),PropertyReader.getProperty("A.appliedDate"));
	}
	
	@Test(priority = 2)
	public void Search() throws InterruptedException
	{
		
		R.search(PropertyReader.getProperty("A.Fullname"),PropertyReader.getProperty("A.appliedDate"),PropertyReader.getProperty("A.keyWords"));
	}
	
	@Test(priority = 3)
	public void delete() throws InterruptedException
	{
		R.Delete();
		Thread.sleep(5000);
	}
	
}

