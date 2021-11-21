package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_DeleteRequest 
{
	@Test
	public void SixthTC() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesfileLoads("../MavenRest_Framework_Dummy/Environment.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response resp=http.DeleteRequest( "QA_URI",TC1_PostRequest.id);
		System.out.println("---------------Delete Request--------------");
		System.out.println(resp.getStatusCode());
		System.out.println("*********** Delete Request Executed **************");
	
	}

}
