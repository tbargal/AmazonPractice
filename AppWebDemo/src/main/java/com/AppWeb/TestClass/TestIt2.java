package com.AppWeb.TestClass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.AppWeb.POMClass.AppWebPOMClass;
import com.AppWeb.UtilityClass.BasicUtilityMethods;

import listnersPack.Listners;

@Listeners(listnersPack.Listners.class)
public class TestIt2 extends BaseClass
{
	
	
	@Test
	public void Fresh() throws IOException
	{
		
		AppWebPOMClass perform=new AppWebPOMClass(driver);
		perform.FreshSection();
		Logger log=Logger.getLogger("AppWebDemo");
		PropertyConfigurator.configure("log4j.properties");
		log.info("clicked fresh Sections");
		SoftAssert soft=new SoftAssert();
		soft.assertAll("Soft assertApplied");
		soft.assertAll();
		Reporter.log("Test is passed successfully");
	}
	
}
