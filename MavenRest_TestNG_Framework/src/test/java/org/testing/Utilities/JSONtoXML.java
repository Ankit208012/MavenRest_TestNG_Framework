package org.testing.Utilities;

import org.json.JSONObject;
import org.json.XML;

public class JSONtoXML 
{
	public String ConversionJSONtoXML(String json)
	{
		JSONObject jsobj=new JSONObject(json);
		String xml_data= XML.toString(jsobj);	
		return xml_data;
		
	}

}
