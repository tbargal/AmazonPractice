package com.AppWeb.POMClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.AppWeb.UtilityClass.BasicUtilityMethods;


public class AppWebPOMClass 
{
	BasicUtilityMethods execute1 = new BasicUtilityMethods();
	
	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	
	private WebElement AccountButton;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement UserName;
	
	@FindBy(xpath="//span[@id='continue']")
	private WebElement continueButton;

	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement SignInButton;
	
	@FindBy(xpath="//input[@id='auth-signin-button']")
	private WebElement SignInotp;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[2]")
	private WebElement AmazonPay;
	
	@FindBy(xpath="(//div[@class='a-section a-spacing-small a-text-center'])[8]")
	private WebElement MobileRecharge;
	
	@FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_fresh']")
	private WebElement FreshSection;
	
	@FindBy(xpath="//a[@id='nav-item-signout']")
	private WebElement SignOut;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement AccountMenu;
	
	public AppWebPOMClass(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	 
	public void clickAccountButton()
	{
		AccountButton.click();
	}
	
	public void SendUsername() throws IOException 
	{
	
	UserName.sendKeys("9561974386");
	}
	
	public void Clickcontinue() 
	{
	
	continueButton.click();
	}
	public void SendPassword()
	{
	password.sendKeys("Tushar@96");
	}
	
	public void SignInButton() 
	{
	SignInButton.click();
	}
	public void SigninOtp()
	{
	SignInotp.click();
	}
	public void AmazonPay()
	{
	AmazonPay.click();
	}
	
	public void MobileRecharge() 
	{
	
	MobileRecharge.click();
	}
	
	public void FreshSection() 
	{
		FreshSection.click();
	}
	
	public void AccountMenu() 
	{
		Actions act=new Actions(driver);
		act.moveToElement(AccountMenu).perform();
				
	}

	public void logout()
	{
		SignOut.click();
	}
	
	
}
