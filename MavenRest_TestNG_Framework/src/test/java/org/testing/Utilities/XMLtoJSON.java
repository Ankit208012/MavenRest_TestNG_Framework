package org.testing.Utilities;

import org.json.JSONObject;
import org.json.XML;

public class XMLtoJSON
{
	public String conversionXMLtoJSON(String xml)
	{
		JSONObject js= XML.toJSONObject(xml);
		return js.toString();
	}

}
