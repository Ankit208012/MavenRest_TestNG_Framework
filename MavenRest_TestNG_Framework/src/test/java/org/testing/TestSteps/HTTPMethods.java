package org.testing.TestSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

//URI >>environment.properties
public class HTTPMethods
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	public Response PostRequest(String bodydata,String uriKey)
	{
		Response resp=
		given()
		 .contentType(ContentType.JSON)
		 .body(bodydata)
		 .when()
		 .post(pr.getProperty(uriKey));
		
		return resp;
		
	}
	
	public  Response GetRequest(String URIKey, String idvalue)
	{
		String base =pr.getProperty(URIKey);
		String uri=base+"/"+idvalue;
		Response resp=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		return resp;				
		
	}
	
	public Response GetAll(String uriKey)
	{
		Response resp=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uriKey));
		return resp;
	}
	
	public Response PutRequest(String uriKey, String id,String bodydata)
	{
		String uri=pr.getProperty(uriKey)+"/"+id;
		Response resp=
		given()
		 .contentType(ContentType.JSON)
		 .body(bodydata)
		 .when()
		 .put(uri);
		
		return resp;
		
	}
	
	public Response DeleteRequest(String UriKey, String id)
	{
		Response resp=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(pr.getProperty(UriKey));
		
		return resp;
	}

}
