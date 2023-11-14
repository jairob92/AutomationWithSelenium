package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

	public SignupPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//h2[contains(.,'Login to your account')]")WebElement loginFormMsg;
	@FindBy(xpath = "//h2[contains(.,'New User Signup!')]")WebElement SignupFormMsg;
	//login form
	@FindBy(name = "email")WebElement loginInputEmail;
	@FindBy(name = "password")WebElement loginInputPassword;
	@FindBy(xpath = "(//button[contains(@type,'submit')])[1]")WebElement loginBtn;
	//signup Form
	@FindBy(xpath = "//input[contains(@data-qa,'signup-name')]")WebElement signupInputName;
	@FindBy(xpath = "(//input[contains(@type,'email')])[2]")WebElement signupInputEmail;;
	@FindBy(xpath = "//button[contains(.,'Signup')]")WebElement signupBtn;
	
	public String titleLoginForm() {
		try {
			String loginFormTitle=loginFormMsg.getText();
			return loginFormTitle;	
		}catch (Exception e) {
			return e.getMessage();
		}
	}
	public String titleSignupForm() {
		try {
			String signupFormTitle=SignupFormMsg.getText();
			return signupFormTitle;	
		}catch (Exception e) {
			return e.getMessage();
		}
	}
	public void loginSetEmail(String email) {
		
		loginInputEmail.sendKeys(email);
	}
	public void loginSetPassword(String password) {
		
		loginInputPassword.sendKeys(password);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	public void signupSetName(String name) {
		
		signupInputName.sendKeys(name);
	}
	public void signupSetemail(String email) {
		
		signupInputEmail.sendKeys(email);
	}
	public void clickOnSignupBtn() {
		signupBtn.click();
	}
	
	
	
	

}
