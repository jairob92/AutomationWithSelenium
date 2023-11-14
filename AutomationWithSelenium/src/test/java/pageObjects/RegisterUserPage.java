package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage extends BasePage {

	public RegisterUserPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = "//b[contains(.,'Enter Account Information')]")WebElement titleForm;
	
	
	
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

}
