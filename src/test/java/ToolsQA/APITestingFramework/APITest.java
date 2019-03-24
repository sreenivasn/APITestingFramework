package ToolsQA.APITestingFramework;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {
	
	@Test
	public static void test1()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification req=RestAssured.given();
		given().log().all();
		Response resp=req.request(Method.GET,"/hyderabad");
		System.out.println("Response body is : \n"+resp.getBody().asString());
		Assert.assertEquals(resp.getStatusCode(), 200);
		System.out.println("test is passed");
		
	
		
	}
	
	//@Test
	public void test2()
	
	{
		given().
		when().get("http://restapi.demoqa.com/utilities/weather/city/banaglore").
		then().assertThat().statusCode(200);
	}

}
