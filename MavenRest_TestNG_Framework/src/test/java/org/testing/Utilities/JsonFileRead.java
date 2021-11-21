package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileRead 
{
	public static String bodyDataRead(String Path) throws FileNotFoundException
	{
		File f = new File(Path);
		FileReader fr = new FileReader(f);
		JSONTokener jst= new JSONTokener(fr);
		JSONObject bodydata= new JSONObject(jst);
		return bodydata.toString();
		
	}
}
