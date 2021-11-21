package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonParsingUsingOrgJSON;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_GetAll_FetchID 
{
	@Test
	public void FourthTC() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesfileLoads("../MavenRest_Framework_Dummy/Environment.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response resp=http.GetAll("QA_URI");
		System.out.println("*********************__GetAll_FetchID__****************************");
		JsonParsingUsingOrgJSON.JsonParse(resp.asString(), "id");
	}


}
