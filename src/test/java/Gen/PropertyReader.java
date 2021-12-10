package Gen;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader 
{
	static Properties pro = new Properties();
	
	public static void initProperty()
	{
		try
		{
			pro.load(new FileInputStream("C:\\Users\\abhij\\eclipse-workspace\\ACTITIME\\cofig.Properties"));
            
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key)
	{
		return pro.getProperty(key);
	}

}
