package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterUserPage;
import pageObjects.SignupPage;

public class TC001_RegisterUser extends BaseClass {

	public HomePage homePage;
	public SignupPage signupPage;
	public RegisterUserPage registerUserpage;
	
	@BeforeMethod
	public void  initializePages() {
		
		homePage=new HomePage(driver);
		signupPage= new SignupPage(driver);
		registerUserpage= new RegisterUserPage(driver);
		
	}
	@Test(priority = 1)
	public void CheckAccesPage() {
		logger.debug("application logs");
		logger.info("Starting Test Case...");
		
		try {
			logger.info("Validating logo webPage...");
			Assert.assertEquals(homePage.checkLogoStatus(), true);
			logger.info("Validating title web page");
			Assert.assertEquals(homePage.titlePage(),"Automation Exercise");
		
		}catch (Exception e) {
			Assert.fail();
		}
	}
	@Test(priority = 2, dependsOnMethods = "CheckAccesPage")
	public void RegisterNewUser() throws InterruptedException {
		try {
			logger.debug("application logs");
			logger.info("Clicking on SignUp Option");
			homePage.clickOnSignUpOption();
			Thread.sleep(2000);
			logger.info("validating forms are available....");
			Assert.assertEquals(signupPage.titleLoginForm(),"Login to your account" );
			Assert.assertEquals(signupPage.titleSignupForm(),"New User Signup!");	
			logger.info("Filling first data to regist user...");
			signupPage.signupSetName("Jairo");
			signupPage.signupSetemail("test@testqa.com");
			signupPage.clickOnSignupBtn();
			//registerUserpage.checkTitleForm();
			String title=registerUserpage.getTitleForm();
			System.out.println(title);
			Assert.assertEquals(title,"ENTER ACCOUNT INFORMATION");
			logger.info("Page ready to register new User...");
			
			registerUserpage.clickMaleGender();
			logger.info("Cleaning name...");
			registerUserpage.clearName();
			logger.info("setting name...");
			registerUserpage.setName("Jairo");
			logger.info("setting password...");
			registerUserpage.setPassword("123456");
			logger.info("selecting day...");
			registerUserpage.selectDay("2");
			logger.info("selecting month...");
			registerUserpage.selectMonth("2");
			logger.info("selecting year...");
			registerUserpage.selectYear("1992");
			logger.info("setting firstName...");
			registerUserpage.setFirstName("Jairo");
			logger.info("setting lastName...");
			registerUserpage.setLastName("Bermudez");
			logger.info("setting company...");
			registerUserpage.setCompany("Coca-Cola");
			logger.info("setting address 1...");
			registerUserpage.setAddress1("Calle 1");
			logger.info("setting address 2...");
			Thread.sleep(5000);
			registerUserpage.setAddress2("calle 20");
			logger.info("setting country...");
			registerUserpage.selectCountry("Canada");
			logger.info("setting state ...");
			registerUserpage.setState("Ontario");
			logger.info("setting state ...");
			registerUserpage.setCity("Toronto");
			logger.info("setting zipCode ...");
			registerUserpage.setZipCode("68001");
			logger.info("setting mobile Number ...");
			registerUserpage.setMobileNumber("321232123");
			//registerUserpage.clickOnBtnCA();
			
			
			
		}catch (Exception e) {
			logger.error("Test Failed");
			Assert.fail();
		}
		logger.info("Test case has finished....");
		
	}
}
