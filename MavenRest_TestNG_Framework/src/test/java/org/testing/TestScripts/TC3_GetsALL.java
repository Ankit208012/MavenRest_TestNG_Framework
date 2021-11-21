package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetsALL 
{
	@Test
	public void ThirdTC() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesfileLoads("../MavenRest_Framework_Dummy/Environment.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response resp=http.GetAll("QA_URI");
		System.out.println("*********************_GetALL_Request_****************************");
		System.out.println("Status code is =  "+resp.statusCode());
		System.out.println("*********************_GetALL_Request_****************************");
		System.out.println("Body Data ");
		System.out.println(resp.asString());
	}

}
