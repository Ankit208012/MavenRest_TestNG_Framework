package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_PutRequest 
{
	@Test
	public void FifthTC() throws IOException
	{
		Properties pr = PropertiesFileLoad.propertiesfileLoads("../MavenRest_Framework_Dummy/Environment.properties");
		JSONObject obj= new JSONObject();
		obj.put("id", TC1_PostRequest.id);
		obj.put("firstname", "Nigam");
		obj.put( "lastname", "Ankit");
		obj.put( "designation ", "Asst. Manager");
	   
		HTTPMethods http= new HTTPMethods(pr);
		Response resp=http.PutRequest( "QA_URI",TC1_PostRequest.id,obj.toString());
		System.out.println("---------------PUT Request--------------");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
	
	}
}
