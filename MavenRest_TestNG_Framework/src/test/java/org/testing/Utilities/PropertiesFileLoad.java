package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad
{
	//It will return the Object of Properties class...
	public static Properties propertiesfileLoads(String filepath) throws IOException
	{
		File fl= new File(filepath);
		FileInputStream fis= new FileInputStream(fl);
		Properties pr = new Properties();
		pr.load(fis);
		return pr;
		
	}

}
