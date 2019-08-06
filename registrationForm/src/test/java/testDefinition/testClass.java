package testDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.studentRegistration;


public class testClass {
	
	private WebDriver driver;
	private studentRegistration page;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\jugupta\\Desktop\\chromedriver_win32\\chromedriver.exe" );
		driver= new ChromeDriver();
	}
	
	@Given("^User is on 'home' page$")
	public void user_is_on_home_page() throws Throwable {
		driver.get("D:\\BDD workspace\\registrationForm\\target\\registration.html");
		page= new studentRegistration(driver);

	}

	@When("^User enters invalid name$")
	public void user_enters_invalid_name() throws Throwable {
		page.setUserName("");
		page.setLoginButton();
	}

	@Then("^display 'please enter name'$")
	public void display_please_enter_name() throws Throwable {
		String expectedMessage="*Please enter userName";
		String actualMessage=page.getNameError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}

	@When("^User enters invalid address$")
	public void user_enters_invalid_address() throws Throwable {
		page.setUserName("Juhi");
		page.setAddress("");
		page.setLoginButton();
	}

	@Then("^Display 'please enter valid address'$")
	public void display_please_enter_valid_address() throws Throwable {
		String expectedMessage="*Please enter address";
		String actualMessage=page.getAddressError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}

	@When("^User enters invalid marks$")
	public void user_enters_invalid_marks() throws Throwable {
		page.setUserName("Juhi");
		page.setAddress("Capgemini");
		page.setMarks("");
		page.setLoginButton();
		
	}

	@Then("^Display 'please enter valid marks'$")
	public void display_please_enter_valid_marks() throws Throwable {
		String expectedMessage="*Please enter valid marks";
		String actualMessage=page.getMarksError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	
	@When("^User enters invalid Details$")
	public void user_enters_invalid_Details() throws Throwable {
		page.setUserName("Juhi");
		page.setAddress("Capgemini");
		page.setMarks("80");
		page.setLoginButton();
	}

	@Then("^Display 'please enter valid Details'$")
	public void display_please_enter_valid_Details() throws Throwable {
		String expectedMessage="Invalid login! Please try again!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		page.setUserName("Juhi");
		page.setAddress("Capgemini");
		page.setMarks("100");
		page.setLoginButton();
	}

	@Then("^display 'registration' page$")
	public void display_registration_page() throws Throwable {
		driver.get("D:\\BDD workspace\\registrationForm\\target\\success.html");
		driver.close();
	}



}
	