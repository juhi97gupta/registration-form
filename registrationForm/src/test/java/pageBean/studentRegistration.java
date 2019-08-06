package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class studentRegistration {
	
WebDriver driver;
	
	//step 1 : identify elements
	@FindBy(name="SName")
	@CacheLookup
	WebElement userName;

	@FindBy(name="SAddress")
	@CacheLookup
	WebElement address;
	

	@FindBy(name="Smarks")
	@CacheLookup
	WebElement marks;
	
	@FindBy(className="btn")
	@CacheLookup
	WebElement loginButton;
	
	
	@FindBy(xpath="//*[@id=\"userErrMsg\"]")
	WebElement nameError;
	
	@FindBy(xpath="//*[@id=\"addErrMsg\"]")
	WebElement addressError;


	@FindBy(xpath="//*[@id=\"mrkErrMsg\"]")
	WebElement marksError;
	
	//using how class
	/*@FindBy(how=How.NAME, using="userPwd")
	@CacheLookup
	WebElement password;
*/
	
	//initiating the elements
	public studentRegistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public WebDriver getDriver() {
		return driver;
	}



	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}



	public WebElement getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}



	public WebElement getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address.sendKeys(address);
	}



	public WebElement getMarks() {
		return marks;
	}



	public void setMarks(String marks) {
		this.marks.sendKeys(marks);
	}



	public WebElement getNameError() {
		return nameError;
	}



	public void setNameError(WebElement nameError) {
		this.nameError = nameError;
	}



	public WebElement getAddressError() {
		return addressError;
	}



	public void setAddressError(WebElement addressError) {
		this.addressError = addressError;
	}



	public WebElement getMarksError() {
		return marksError;
	}



	public void setMarksError(WebElement marksError) {
		this.marksError = marksError;
	}



	public void setLoginButton() {
		this.loginButton.click();
		}

}
