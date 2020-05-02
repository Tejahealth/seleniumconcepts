package com.next.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils {

	private WebDriver driver;
	private static final String SCREENSHOT_PATH = "Screenshots";
	private static final File SCREENSHOT_FILE = new File(SCREENSHOT_PATH);

	/**
	 * Constructor for Initializing driver
	 * 
	 * @param browser
	 *            String value. Can take values of Chrome, InternetExplorer,
	 *            Firefox
	 */
	public DriverUtils(String browser) {

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("InternerExplorer")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}

		if (!SCREENSHOT_FILE.exists()) {
			SCREENSHOT_FILE.mkdir();
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	/**
	 * 
	 * @return web driver instance
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * Method for taking screenshot
	 * @param stepName
	 * @throws IOException
	 */
	public void takeScreenshot(String stepName) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(SCREENSHOT_PATH + File.separator + stepName + ".png"));
	}

}
       
