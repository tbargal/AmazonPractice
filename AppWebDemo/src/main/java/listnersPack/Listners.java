package listnersPack;
import com.AppWeb.UtilityClass.BasicUtilityMethods;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener
{
	
public void onTestFailure(ITestResult result)
{
	System.out.println("Test Failed Listners");
}

public void onTestSuccess(ITestResult result)
{
System.out.println("Test is Pass Listeners");
}

public void onTestSkipped(ITestResult result)
{
	System.out.println("Test is Skipped listner");
}

public void onTestStart(ITestResult result)
{
	System.out.println("Test is Started listner");
}
}
