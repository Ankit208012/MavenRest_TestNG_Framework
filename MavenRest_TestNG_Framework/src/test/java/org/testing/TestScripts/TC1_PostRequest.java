package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonFileRead;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseValidation;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	//Body Data Ready >> Taking from JsonFile...
	//Random Number generate >> Pass that Number into ID OR variable value replacement..
	//Properties file load in which we load our API..
	//Hit the Post request..
	//Added TestNG.....
	static String id;
	@Test
	public void firstTC() throws IOException 
	{
		String body=JsonFileRead.bodyDataRead("../MavenRest_Framework/src/test/java/org/testing/PayloadData/body.json");
		Random r= new Random();
		Integer intgr=r.nextInt();
		body= JsonVariableReplacement.jsonVariable(body, "id", intgr.toString());
		System.out.println(body);
		Properties pr = PropertiesFileLoad.propertiesfileLoads("../MavenRest_Framework_Dummy/Environment.properties");
		HTTPMethods http= new HTTPMethods(pr);
		Response resp=http.PostRequest(body, "QA_URI");
		System.out.println("************************_PostRequest_*************************");
		System.out.println("Status code is =  "+resp.statusCode());
		System.out.println("*************************************************");
		System.out.println("Body Data ");
		System.out.println(resp.asString());
		System.out.println("*************************************************");
		id=resp.jsonPath().get("id");
		System.out.println("**************** Response validation  **********************");
		ResponseValidation.statuscode(201, resp);
		
	}

}
