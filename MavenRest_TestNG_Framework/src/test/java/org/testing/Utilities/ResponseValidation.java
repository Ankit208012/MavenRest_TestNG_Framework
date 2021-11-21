package org.testing.Utilities;

import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseValidation 
{
	public static void statuscode(int expectedstatuscode, Response resp)
	{
		Assert.assertEquals(resp.statusCode(), expectedstatuscode);
	}
}
