package com.AppWeb.TestClass;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.AppWeb.POMClass.AppWebPOMClass;
import com.AppWeb.UtilityClass.BasicUtilityMethods;



public class BaseClass 
{
	
	WebDriver driver;
	
	
	@Parameters("browserName")
	@BeforeClass
	public void TestNGMethod(String browserName)
	{
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TheOne\\Desktop\\Velocity\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Logger log=Logger.getLogger("AppWebDemo");
			PropertyConfigurator.configure("log4j.properties");
			log.info("Browser Opened");
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\TheOne\\Desktop\\Velocity\\Selenium\\Browsers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Logger log=Logger.getLogger("AppWebDemo");
			PropertyConfigurator.configure("log4j.properties");
			log.info("Browser Opened");
		}
		
	}
	@BeforeMethod
	public void BaselogIn() throws InterruptedException, IOException
	{
		AppWebPOMClass login=new AppWebPOMClass(driver);
		Logger log=Logger.getLogger("AppWebDemo");
		PropertyConfigurator.configure("log4j.properties");
		login.clickAccountButton();
		login.SendUsername();
		log.info("username Entered");
		login.Clickcontinue();
		login.SendPassword();
		login.SignInButton();
		log.info("Password Entered");
		Thread.sleep(20000);
		login.SigninOtp();
		log.info("Entered");
	}

	@AfterMethod
	public void BaselogOut() throws InterruptedException
	{ 	
		Logger log=Logger.getLogger("AppWebDemo");
	    PropertyConfigurator.configure("log4j.properties");
	    AppWebPOMClass login=new AppWebPOMClass(driver);
	    login.AccountMenu();
	    login.logout();
		log.info("Successfully Exited");
		Reporter.log("logged OUT successfully");
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}
