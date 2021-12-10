package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Gen.DriverUtilss;

public class BasePages 
{
	WebDriver driver;
public BasePages()
{
driver=DriverUtilss.getDriver();
PageFactory.initElements(driver,this);
}

}
