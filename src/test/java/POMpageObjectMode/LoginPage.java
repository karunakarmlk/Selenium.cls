package POMpageObjectMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// Declaration
	@FindBy(id = "email")
	private WebElement emailTF;

	@FindBy(name = "password")
	private WebElement passwordTF;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedIn;

	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement toPasswordRecovery;

	@FindBy(id = "last")
	private WebElement lastBTN;

	// Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// utilization

	public void setEamil(String email) {
		emailTF.sendKeys(email);
	}

	public void passwordTF(String password) {
		passwordTF.sendKeys(password);
	}

	public void clickkeepLoggedIn() {
		keepLoggedIn.click();
	}

	public void clicktoPasswordRecovery() {
		toPasswordRecovery.click();
	}

	public void clickLogin() {
		lastBTN.click();
	}
}
