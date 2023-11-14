package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	//Locators
	@FindBy(xpath ="//img[@src='/static/images/home/logo.png']")WebElement pageLogo;
	@FindBy(xpath ="//h2[contains(.,'Category')]")WebElement  categoryName;
	@FindBy(xpath ="//h2[contains(.,'Features Items')]")WebElement  featureNames;
	@FindBy(xpath ="//h2[contains(.,'Brands')]")WebElement  brandsNames;
	
	@FindBy(xpath ="//a[@href='/login']")WebElement  SignUpLoginOption;
	@FindBy(xpath ="//a[@href='/products']")WebElement  productsOption;
	
	
	//methods
	
	public String titlePage() {	
		try {
			String title=driver.getTitle();
			return title;
		}catch (Exception e) {
			return e.getMessage();
		}
	}
	public boolean checkLogoStatus() {
		
		boolean statusLogo= pageLogo.isDisplayed();
		return statusLogo;
	}
	public boolean checkCategoryName() {
		boolean statusCatName= categoryName.isDisplayed();
		return statusCatName;
	}
	public boolean checkFeatureName() {
		boolean statusFeaName= featureNames.isDisplayed();
		return statusFeaName;
	}
	public boolean checkbrandsNames() {
		boolean statusFeaName= brandsNames.isDisplayed();
		return statusFeaName;
	}
	
	public void clickOnSignUpOption() {
		SignUpLoginOption.click();
	}
	
	public void productsOption() {
		productsOption.click();
	}
	

}
