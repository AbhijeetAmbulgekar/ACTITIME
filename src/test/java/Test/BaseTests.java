package Test;

import org.testng.annotations.BeforeTest;

import Gen.DriverUtilss;

public class BaseTests
{

	@BeforeTest
	
	public void setUp( )
	{
		DriverUtilss.createDriver();
	}
}
