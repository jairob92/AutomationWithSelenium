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
	public void checkSignOption() {
		
		try {
			
			logger.debug("application logs");
			logger.info("Clicking on SignUp Option");
			homePage.clickOnSignUpOption();
			Thread.sleep(2000);
			logger.info("validating forms are available....");
			Assert.assertEquals(signupPage.titleLoginForm(),"Login to your account" );
			Assert.assertEquals(signupPage.titleSignupForm(),"New User Signup!");
			
		}catch (Exception e) {
			logger.error("Test Failed");
			Assert.fail();
		}
		logger.info("Test case has finished....");
	}
	
	@Test(priority = 3, dependsOnMethods = "checkSignOption")
	public void RegisterNewUser() throws InterruptedException {
		try {
			logger.debug("application logs");
			logger.info("Filling first data to regist user...");
			signupPage.signupSetName("Jairo");
			signupPage.signupSetemail("test@testqa2.com");
			signupPage.clickOnSignupBtn();
			//registerUserpage.checkTitleForm();
			String title=registerUserpage.getTitleForm();
			logger.info("Page ready to register new User...");
			Assert.assertEquals(title,"ENTER ACCOUNT INFORMATION");
			logger.info("Registering User...");
			registerUserpage.clickMaleGender();
			registerUserpage.clearName();
			registerUserpage.setName("Jairo");
			registerUserpage.setPassword("123456");
			registerUserpage.selectDay("2");
			registerUserpage.selectMonth("2");
			registerUserpage.selectYear("1992");
			registerUserpage.setFirstName("Jairo");
			registerUserpage.setLastName("Bermudez");
			registerUserpage.setCompany("Coca-Cola");
			registerUserpage.setAddress1("Calle 1");
			registerUserpage.setAddress2("calle 20");
			registerUserpage.selectCountry("Canada");
			registerUserpage.setState("Ontario");
			registerUserpage.setCity("Toronto");
			registerUserpage.setZipCode("68001");
			registerUserpage.setMobileNumber("321232123");
			logger.info("form filled");
			Thread.sleep(3000);
			registerUserpage.clickOnBtnCA();
			logger.info("User rgistred successfull");
			String confirMsg=registerUserpage.accountCreatedmsg();
			Assert.assertEquals(confirMsg,"ACCOUNT CREATED!");
			Thread.sleep(2000);
			registerUserpage.clickonBtnContinue();
			Thread.sleep(2000);
		
			
		}catch (Exception e) {
			logger.error("Test Failed");
			Assert.fail();
		}
		logger.info("Test case has finished....");
		
	}
}
