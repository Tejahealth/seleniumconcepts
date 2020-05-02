package cucumber_BDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.next.pages.LandingPage;
import com.next.pages.LoginPage;
import com.next.test.MenShoppingpage;
import com.next.utils.DriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GlueCodes {
	public static WebDriver driver;
	private LoginPage loginpage;
	private LandingPage landingpage;
	private MenShoppingpage menshoppage;
	private static DriverUtils driverutils;

	@Given("^the user navigates to \"([^\"]*)\"$")
	public void the_user_navigates_to(String arg1) throws Throwable {
		driverutils = new DriverUtils("Chrome");
		driver = driverutils.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(arg1);
		// driver.get("https://www.next.co.uk/");
		System.out.println("URL opened successfully");
	}

	@Then("^the user click on myaccount$")
	public void the_user_click_on_myaccount() throws Throwable {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.myaccount.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@Then("^the user enters \"([^\"]*)\" and \"([^\"]*)\" credentials$")
	public void the_user_enters_and_credentials(String arg1, String arg2) throws Throwable {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.username.sendKeys(arg1);
		loginpage.password.sendKeys(arg2);

	}

	@Then("^the user clicks on login button$")
	public void the_user_clicks_on_login_button() throws Throwable {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.signin.click();
		System.out.println(driver.getTitle());
		driverutils.takeScreenshot("screen02");
	}

	@Then("^the user navigate to the homepage$")
	public void the_user_navigate_to_the_homepage() throws Throwable {
		LandingPage landpage = new LandingPage(driver);
		landpage.landingpage.click();
		System.out.println(driver.getCurrentUrl());
		

	}

	@Then("^validate the currentURL$")
	public void validate_the_currentURL() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage landpage = new LandingPage(driver);

		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.next.co.uk/")) {

			System.out.println("The testcase passed");
			driverutils.takeScreenshot("screen01");
		} else {
			System.out.println("The testcase failed");
		}
		driver.close();

	}
	
	@Then("^the user clicks on the landing page$")
	public void the_user_clicks_on_the_landing_page() throws Throwable {
		LandingPage landpage = new LandingPage(driver);
		landpage.landingpage.click();
		System.out.println(driver.getCurrentUrl());
	
	}

	@Then("^the user get the screenshot of the page$")
	public void the_user_get_the_screenshot_of_the_page() throws Throwable {
	   driverutils.takeScreenshot("page");
	   
	}

	@Then("^the use clicks on the men shopping page link$")
	public void the_use_clicks_on_the_men_shopping_page_link() throws Throwable {
		MenShoppingpage menshoppage = new MenShoppingpage(driver);
		menshoppage.menshoppingpage.click();
		System.out.println(driver.getTitle());
		if (driver.getCurrentUrl().equalsIgnoreCase("http:www.next.co.uk")) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case failed");
			driver.close();
			
		}
	}


}
