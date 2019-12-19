package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createPatientTest {
	
	WebDriver driver;
	
	
	@Before
	//code to initialise chromedriver and maximise window
	public void setup(){
		System.setProperty("webdriver.chrome.driver","src/test/java/resources/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	//tear down browser after running tests
	public void closeBrower(){
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	
	}

	@Given("^I navigate to <url>$")
	public void i_navigate_to_url() throws Throwable {
	    driver.get("http://localhost:3000/");
	}

	@When("^I verify the page$")
	public void i_verify_the_page() throws Throwable {
	   String formText = driver.findElement(By.xpath("//h1[contains(text(),'Data Test App')]")).getText();
	   Assert.assertEquals(formText , "Data Test App");
	}

	@When("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
	    driver.findElement(By.name("firstName")).sendKeys("Adea");
	}

	@When("^I enter middle name$")
	public void i_enter_middle_name() throws Throwable {
		 driver.findElement(By.name("middleName")).sendKeys("Natchiah");
	}

	@When("^I enter last name$")
	public void i_enter_last_name() throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys("Blay");
	}

	@When("^I enter phone number$")
	public void i_enter_phone_number() throws Throwable {
	driver.findElement(By.name("phoneNumber")).sendKeys("2332456789");
	}

	@When("^I enter date of birth$")
	public void i_enter_date_of_birth() throws Throwable {
		driver.findElement(By.name("dob")).sendKeys("02092000");
	}

	@When("^I enter address$")
	public void i_enter_address() throws Throwable {
		driver.findElement(By.name("address")).sendKeys("A1234/14 Accra");
	}

	@When("^I click on the add user button$")
	public void i_click_on_the_add_user_button() throws Throwable {
		driver.findElement(By.linkText("Add New User")).click();
	   
	}

	@Then("^User card should be added to the user list$")
	public void user_card_should_be_added_to_the_user_list() throws Throwable {
	   //Verifying if user card has been added
		
		String username = driver.findElement(By.xpath("//h4[contains(text(),'Adea Natchiah Blay')]")).getText();
		Assert.assertEquals(username, "Adea Natchiah Blay");
	}
	


}
