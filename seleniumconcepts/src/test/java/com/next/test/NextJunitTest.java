/**
 * 
 */
package com.next.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.next.pages.LandingPage;
import com.next.pages.LoginPage;
import com.next.utils.DriverUtils;

/**
 * @author gsant
 *
 */
public class NextJunitTest {

	private static WebDriver driver;
	private LoginPage loginpage;
	private LandingPage landingpage;
	private MenShoppingpage menshoppingpage;
	private static DriverUtils driverutils;

	@BeforeClass
	public static void browserinit() throws Exception {

		driverutils = new DriverUtils("Chrome");
		driver = driverutils.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		System.out.println("This is the step");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"dk_container_Size-348-309\"]/div/ul/li[8]"));
		js.executeScript("arguments[0].click();", button1);
	}

	@Test
	public void nextendtoendtest() {
		driver.get("https://www.next.co.uk/");
		System.out.println("URL opened successfully");

		LoginPage loginpage = new LoginPage(driver);
		LandingPage landpage = new LandingPage(driver);
		MenShoppingpage Menpage = new MenShoppingpage(driver);
		loginpage.myaccount.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		loginpage.username.sendKeys("gsantosh@hotmail.co.uk");
		loginpage.password.sendKeys("10santosh");

		loginpage.signin.click();
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Account Summary | My Account | Next Directory Online"));
		landpage.landingpage.click();
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.titleContains("Next Official Site: Online Fashion, Kids Clothes & Homeware"));
		String str = driver.getCurrentUrl();
		System.out.println(str);
		// wait.until(ExpectedConditions.urlToBe("https://www2.next.co.uk/"));

		Menpage.menshoppingpage.click();
		System.out.println(driver.getTitle());

		// Menpage.menspage.click();
		// System.out.println(driver.getTitle());

		Menpage.newcollection.click();
		System.out.println(driver.getTitle());
		// wait.until(ExpectedConditions.urlToBe("https://www.next.co.uk/shop/gender-men/feat-newin"));

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button = driver.findElement(By.xpath("//*[@id=\"i17\"]/section/div[1]/h2/a/span"));
		js.executeScript("arguments[0].click();", button);
		System.out.println(driver.getTitle());

		Actions actn = new Actions(driver);
		actn.click(driver.findElement(By.xpath("//*[@id=\"Style221437\"]/section/div[4]/div[18]/div[4]/div[2]/a")));

//		Select items = new Select(driver.findElement(By.xpath("/html/body/section[1]/section[1]/div/div[2]/div[3]/div/section[2]/article[1]/section/div[4]/div[3]/div/div")));
//		items.deselectByIndex(4);
//		System.out.println("dropdown  value is " + items);
//		
//		driver.findElement(By.xpath("//*[@id=\"dk_container_Size-212-791\"]")).click();
//		System.out.println(driver.getTitle());

		Menpage.addtobag.click();
		System.out.println(driver.getTitle());

		Menpage.checkout.click();
		System.out.println(driver.getTitle());

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void CloseBrowser() throws Exception {

		System.out.println("Testing complete");
		// driver.close();
		// driver.quit();
	}

}
