/**
 * 
 */
package com.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author gsant
 *
 */
public class LandingPage {
	
	
	public WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id=\"header-logo\"]")
	public WebElement landingpage;
	
	@FindBy(how= How.XPATH, using = "//*[@id=\"left-sidebar-links17-7fz9ykke4diqmmw60o2ijgluj\"]")
	public WebElement menspage;
	
	
	public LandingPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
