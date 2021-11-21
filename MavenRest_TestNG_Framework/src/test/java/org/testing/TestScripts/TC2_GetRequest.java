package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetRequest 
{
	@Test
	public void SecondTC() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesfileLoads("../MavenRest_Framework_Dummy/Environment.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response resp=http.GetRequest("QA_URI", TC1_PostRequest.id);
		System.out.println("Status code is =  "+resp.statusCode());
		System.out.println("*********************_GetRequest_****************************");
		System.out.println("Body Data ");
		System.out.println(resp.asString());
	}

}
