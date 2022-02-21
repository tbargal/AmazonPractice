package com.AppWeb.TestClass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.AppWeb.POMClass.AppWebPOMClass;
import com.AppWeb.UtilityClass.BasicUtilityMethods;

@Listeners(listnersPack.Listners.class)
public class TestIt extends BaseClass 
{
	@Test
	public void AmazonPay() throws IOException
	{
		AppWebPOMClass perform=new AppWebPOMClass(driver);
		perform.AmazonPay();
		perform.MobileRecharge();
		Logger log=Logger.getLogger("AppWebDemo");
		PropertyConfigurator.configure("log4j.properties");
		log.info("clicked Amazon Pay Sections");
		Reporter.log("Test Failed successfully");
		
	}
	
}
