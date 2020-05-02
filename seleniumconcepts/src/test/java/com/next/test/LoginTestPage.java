package com.next.test;

import java.awt.List;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.next.pages.LandingPage;
import com.next.pages.LoginPage;

public class LoginTestPage{
	

	
	
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.next.co.uk/");
		driver.manage().window().maximize();
		
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
		//wait.until(ExpectedConditions.urlToBe("https://www2.next.co.uk/"));
		
		Menpage.menshoppingpage.click();
		System.out.println(driver.getTitle());
		
		//Menpage.menspage.click();
		//System.out.println(driver.getTitle());
		
		Menpage.newcollection.click();
		System.out.println(driver.getTitle());
		//wait.until(ExpectedConditions.urlToBe("https://www.next.co.uk/shop/gender-men/feat-newin"));
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Menpage.addshirt.click();
		System.out.println(driver.getTitle());
		//wait.until(ExpectedConditions.titleIs("Buy Slate Jacquard Collar Poloshirt from the Next UK online shop"));
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select items = new Select(driver.findElement(By.xpath("/html/body/section[1]/section[1]/div/div[2]/div[3]/div/section[2]/article[1]/section/div[4]/div[3]/div/div")));
		items.deselectByIndex(4);
		System.out.println("dropdown  value is " + items);
		
		driver.findElement(By.xpath("//*[@id=\"dk_container_Size-212-791\"]")).click();
		System.out.println(driver.getTitle());
		
		Menpage.selectmedium.click();
		
		Menpage.addtobag.click();
		System.out.println(driver.getTitle());
		
		Menpage.checkout.click();
		System.out.println(driver.getTitle());
		

		
		 
		driver.close();
		driver.quit();
	}

}