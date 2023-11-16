package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserPage extends BasePage {

	public RegisterUserPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = "//b[contains(.,'Enter Account Information')]")WebElement titleForm;
	@FindBy(id="id_gender1")WebElement genderMale;
	@FindBy(id="id_gender2")WebElement genderFemale;
	@FindBy(id="name")WebElement inputName;
	@FindBy(id="email")WebElement inputEmail;
	@FindBy(id="password")WebElement inputPassword;
	@FindBy(id="days")WebElement selectDays;
	@FindBy(id="months")WebElement selectMonths;
	@FindBy(id="years")WebElement selectYears;
	@FindBy(id="first_name")WebElement inputFirstName;
	@FindBy(id="last_name")WebElement inputLastName;
	@FindBy(id="company")WebElement inputCompany;
	@FindBy(id="address1")WebElement inputAddress1;
	@FindBy(id="address2")WebElement inputAddress2;
	@FindBy(id="country")WebElement selectCountry;
	@FindBy(id="state")WebElement inputState;
	@FindBy(id="city")WebElement inputCity;
	@FindBy(id="zipcode")WebElement inputZipCode;
	@FindBy(id="mobile_number")WebElement inputMobileNumber;
	@FindBy(id="(//button[@type='submit'])[1]")WebElement btnCreateAccount;
	
	
	/*public boolean checkTitleForm() {
		
		boolean title= titleForm.isDisplayed();
		return title; 
	}*/
	public String getTitleForm() {
		try {
			String title=titleForm.getText();
			return title;	
		}catch (Exception e) {
			return e.getMessage();
		}
	}
	public void clickMaleGender() {
		genderMale.click();
	}
	public void clickFemaleGender() {
		genderFemale.click();
	}
	public void setName(String name) {
		inputName.sendKeys(name);
	}
	public void clearName() {
		inputName.clear();
	}
	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	public void selectDay(String day) {
		
		Select days = new Select(selectDays);
		days.selectByValue(day);	
	}
	public void selectMonth(String month) {
		
		Select months = new Select(selectMonths);
		months.selectByValue(month);	
	}
	public void selectYear(String year) {
		
		Select years = new Select(selectYears);
		years.selectByValue(year);	
	}
	public void setFirstName(String firstName) {
		inputFirstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		inputLastName.sendKeys(lastName);
	}
	public void setCompany(String company) {
		inputCompany.sendKeys(company);
	}
	public void setAddress1(String address) {
		inputAddress1.sendKeys(address);
	}
	public void setAddress2(String address) {
		inputAddress2.sendKeys(address);
	}
	public void selectCountry(String country) {
		
		Select countries = new Select(selectCountry);
		countries.selectByValue(country);	
	}
	public void setState(String state) {
		inputState.sendKeys(state);
	}
	public void setCity(String city) {
		inputCity.sendKeys(city);
	}
	public void setMobileNumber(String mobileNumber) {
		inputMobileNumber.sendKeys(mobileNumber);
	}
	public void setZipCode(String zipCode) {
		inputZipCode.sendKeys(zipCode);
	}
	
	public void clickOnBtnCA() {
		btnCreateAccount.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
