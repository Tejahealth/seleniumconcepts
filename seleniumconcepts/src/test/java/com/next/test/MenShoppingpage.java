package com.next.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MenShoppingpage {
WebDriver driver = null;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"MainNavigation\"]/div/ul/li[3]")
	public WebElement menshoppingpage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-sidebar-links3-etsm8lq5v6mew1ujafaeqndm6\"]")
	public WebElement jeanlink;
	
	@FindBy(how= How.XPATH, using = "/html/body/section[1]/section[1]/div/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div[7]/a")
	public WebElement newcollection;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"i11\"]/section/div[1]/h2/a/span")
	public WebElement addshirt;
	
	@FindBy(how = How.XPATH, using = "/html/body/section[1]/section[1]/div/div[2]/div[3]/div/section[2]/article[1]/section/div[4]/div[2]/div/div/a")
	public WebElement selectsizze;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dk_container_Size-761-465\"]/div/ul/li[4]/a")
	public WebElement selectmedium;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Style242045\"]/section/div[4]/div[5]/div[4]/div/a[1]")
	public WebElement addtobag;
	
	@FindBy(how = How.XPATH, using = "/html/body/header/div/section/div[3]/a")
	public WebElement checkout;

	
	
	
	
	public MenShoppingpage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
		
	}

}
