package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTRAVEL {
	public PhpTRAVEL(WebDriver driver) {
		// using the driver initialize or locate or elements initialize class
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//li[@id='li_myaccount']")
	public WebElement myAccount;
	
	@FindBy(xpath= "(//a[@href='https://www.phptravels.net/login'])[2]")
	public WebElement loginqwe;
	
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")
	public WebElement eMail;
	
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/div[1]/div[5]/button")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[2]/a")
	public WebElement hotels;
	
	@FindBy(xpath = "//*[@id=\"collapse1\"]/div[1]/div/div[5]/div/ins")
	public WebElement starts;
	
	@FindBy (xpath = "//*[@id=\"collapse2\"]/div/div/div[1]/div[3]")
	public WebElement slider;
}
	
