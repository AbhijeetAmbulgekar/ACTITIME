package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RecruitmentPage extends BasePages
{

	@FindBy(id="txtUsername")
	private WebElement unTB;

	@FindBy(id="txtPassword")
	private WebElement pwTB;

	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	
	

	@FindBy (xpath ="//b[text()='Recruitment']")
	private WebElement Recruitment;
	
	@FindBy (xpath = "//a[text()='Candidates']")
	private WebElement Candidates;


	@FindBy(xpath = "//input[@id='btnAdd']")
    private WebElement add;
	
    @FindBy(xpath = "//*[@id='addCandidate_firstName']")
    private WebElement firstName;
    
    @FindBy(xpath = "//*[@id='addCandidate_middleName']")
    private WebElement middleName;
    
    @FindBy(xpath = "//*[@id='addCandidate_lastName']")
    private WebElement lastName;
    
    @FindBy(xpath = "//*[@id='addCandidate_email']")
    private WebElement emails;
    
    @FindBy(xpath = "//*[@id='addCandidate_contactNo']")
    private WebElement contactNo;
    
     @FindBy(xpath = "//*[@id='addCandidate_vacancy']")
    private WebElement vacancy;
    
     @FindBy(xpath = "//*[@id='addCandidate_keyWords']")
    private WebElement keyWords;
    
    @FindBy(xpath = "//*[@id='addCandidate_comment']")
    private WebElement comment;
    
     @FindBy(xpath = "//*[@id='addCandidate_appliedDate']")
    private WebElement appliedDate;
    
      @FindBy(xpath = "//*[@id='addCandidate_consentToKeepData']")
    private WebElement consentToKeepData;
    
    @FindBy(xpath = "//input[@id='btnSave']")
    private WebElement btnSave;
   
    @FindBy(xpath = "//input[@type='file']")
    private WebElement file;
    
    @FindBy(xpath = "//*[@class='actionDrpDown']")
    private WebElement selectaction;
    
    @FindBy(xpath = "//*[@id='actionBtn']")
    private WebElement action;
    
    @FindBy(xpath = "//*[@id='candidateSearch_jobVacancy']")
    private WebElement jobVacancy;
    
    @FindBy(xpath = "//*[@id='candidateSearch_hiringManager']")
    private WebElement hiringManager;
    
    @FindBy(xpath = "//*[@id='candidateSearch_status']")
    private WebElement status;
    
    
    @FindBy(xpath = "//*[@id='candidateSearch_candidateName']")
    private WebElement candidateName;
    
    @FindBy(xpath = "//*[@id='candidateSearch_fromDate']")
    private WebElement fromDate;
    
    @FindBy(xpath = "//*[@id='btnSrch']")
    private WebElement btnSrch;
    
    @FindBy(xpath = "//*[@id='candidateSearch_jobTitle']")
    private WebElement jobTitle;
    
    @FindBy(xpath = "//*[@id='btnRst']")
    private WebElement btnRst;
    
    @FindBy(xpath = "//*[@id='candidateSearch_keywords']")
    private WebElement keywords;
    
    
    @FindBy(xpath = "//*[@id='ohrmList_chkSelectAll']")
    private WebElement chkSelectAll;
    
    @FindBy(xpath = "//*[@id='btnDelete']")
    private WebElement btnDelete;
    
    
    @FindBy(xpath = "//*[@id='dialogDeleteBtn']")
    private WebElement dialogDeleteBtn;
    
    
    
    
    
	//Utilization
	public void OpenWebsite()
	{
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public void enterUsername(String un)
	{
	unTB.sendKeys(un);
	}

	public void enterPassword(String pw)
	{
	pwTB.sendKeys(pw);
	}

	public void clickLogin()
	{
	loginBtn.click();
	}
	
	public void Actions() throws InterruptedException 
	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	   	 act.moveToElement(Recruitment).perform();
	   	 act.moveToElement(Candidates).perform();
	   	 Candidates.click();
		
	}

     
	public void AddCandidate(String Fn,String Mn,String Ln,String email,String con , String key,String comm,String AD) throws InterruptedException
	{
		Thread.sleep(4000);
        add.click();
        firstName.sendKeys(Fn);
        middleName.sendKeys(Mn);
        lastName.sendKeys(Ln);
        emails.sendKeys(email);
        contactNo.sendKeys(con);
       
        Select slt1 = new Select(vacancy);
        slt1.selectByIndex(8);
       
       file.sendKeys("D:\\A.pdf");
        keyWords.sendKeys(key);
        comment.sendKeys(comm);
        appliedDate.clear();
        appliedDate.sendKeys(AD);
        consentToKeepData.click();
       Thread.sleep(2000);
       btnSave.click();
       Thread.sleep(2000);
       Select sel = new Select(selectaction);
       sel.selectByIndex(1);
       Thread.sleep(4000);
       action.click();
       Thread.sleep(4000);
       Candidates.click();
       Thread.sleep(4000);
	}
	
	public void search (String name ,String date ,String key) throws InterruptedException
	{
		    /*Select sel = new Select(jobTitle);
	       sel.selectByValue(" Software Engineer");
	        Thread.sleep(2000);
	       Select sel1 = new Select(jobVacancy);
	       sel1.selectByValue(" Software Engineer");
	        Thread.sleep(2000);
	        Select sel2 = new Select(hiringManager);
	        sel2.selectByIndex(1); 
	       Thread.sleep(2000);
	        Select sel3 = new Select(status);
	        sel3.selectByIndex(2); */
	        
	        candidateName.sendKeys(name);
	        Thread.sleep(2000);
	        btnSrch.click(); 
	        Thread.sleep(10000);
	        btnRst.click();
	        Thread.sleep(2000);
	        fromDate.clear();
	        fromDate.sendKeys(date);
	        btnSrch.click(); 
	        Thread.sleep(10000);
	        btnRst.click();
	        
	        keywords.sendKeys(key);
	        btnSrch.click(); 
	        Thread.sleep(10000);
	}
	
	public void Delete() throws InterruptedException
	{
		chkSelectAll.click();
		Thread.sleep(2000);
		btnDelete.click();
		dialogDeleteBtn.click();
	}
}
