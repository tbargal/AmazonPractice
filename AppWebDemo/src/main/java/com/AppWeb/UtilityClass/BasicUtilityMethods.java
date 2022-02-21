package com.AppWeb.UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.AppWeb.TestClass.BaseClass;

public class BasicUtilityMethods
{
    public String Eusername;
	public String Epassword;
	WebDriver driver;
	public void screeenShot(String filename) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\TheOne\\Desktop\\Velocity\\Selenium\\Maven\\Screenshot"+filename+".jpg");
		FileHandler.copy(source, dest);
	}
	
	public void newTab(int i)
	{
		
		List<String> AllAdress=new ArrayList<String> (driver.getWindowHandles());
		System.out.println(AllAdress);
		driver.switchTo().window(AllAdress.get(i));
	}
	public void actionMethods()
	{
		Actions act=new Actions(driver);
	}
	
	public void ExcelFile() throws IOException
	{
		String path="C:\\Users\\TheOne\\Desktop\\Velocity\\Selenium\\Excel Workbook\\Selenium_Practice.xlsx";
		FileInputStream	file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Velocity");
		XSSFRow row1=sheet.getRow(0);
		XSSFCell cell1=row1.getCell(0);
		Eusername=cell1.getStringCellValue();
		XSSFRow row2=sheet.getRow(1);
		XSSFCell cell2=row2.getCell(0);
		Epassword=cell2.getStringCellValue();
		System.out.println(Eusername+"goshhguf");
	}
}
