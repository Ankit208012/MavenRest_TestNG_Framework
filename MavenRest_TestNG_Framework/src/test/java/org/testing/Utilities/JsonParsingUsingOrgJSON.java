package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJSON 
{
	public static void JsonParse(String responseData, String Keyname)
	{
		if(responseData.startsWith("["))
		{
			JSONArray data= new JSONArray(responseData);
			 int length=data.length();
			 for (int i = 0; i < length; i++)
			 {
				JSONObject obj =data.getJSONObject(i);
				System.out.println("id value is : "+obj.get(Keyname));
				
			 }
		}
		else
		{
			
		}
		
	}

}
