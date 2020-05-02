package com.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	public WebDriver driver;
	
	@FindBy(how = How.XPATH, using ="/html/body/header/div/section/section[3]/ul/li[1]/a")
	public WebElement myaccount;
	
	@FindBy(how = How.ID, using = "EmailOrAccountNumber")
	public WebElement username;
	
	@FindBy(how = How.CLASS_NAME, using = "password")
	public WebElement password;
	
	@FindBy(how = How.ID, using = "SignInNow")
	public WebElement signin;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
//@FindBy(how = How.ID, using = "email")
//	public WebElement fbusername;
}
}