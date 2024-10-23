package POMpageObjectMode;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPage 
{
 //Deceleration 
	@FindBy(id="nav-logo-sprites")
	private WebElement logo;
	
	@FindBy(id="searchDropdownBox")
	private WebElement ADD;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchTX;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchBT;
	
	@FindBy(id="nav-cart-count")
	private WebElement cart;
	
	@FindBy(xpath="//div[@id='nav-xshop-container']/descendant::a[normalize-space(@class)='nav-a']")
	private List<WebElement> header;
	
	//Inatalization
	public AmazonPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public boolean logoIsPresent()
	{
		return logo.isDisplayed();
	}
	 
	public void AllDD(String text)
	{
		Select s =  new Select(ADD);
		s.selectByVisibleText(text);
	}
	
	public void sendData(String data)
	{
		searchTX.sendKeys(data);
	}
	
	public void clickSBT() 
	{
		searchBT.click();
	}
	
	public String Gocart() 
	{
		return cart.getText();
	}
	public List<WebElement> getHeader()
	{
		return header;
	}
}
