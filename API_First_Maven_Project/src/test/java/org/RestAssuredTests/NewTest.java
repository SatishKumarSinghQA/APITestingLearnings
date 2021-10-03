package org.RestAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.http.*;
public class NewTest {
  @Test
  public void FirstRestAssuredTest() {
	  
	  Response res=
			  given()
			  .contentType(ContentType.JSON)
			  .when()
			  .get("http://localhost:3000/friends");
	  
	  System.out.println("Status Code: "+res.getStatusCode());
	  System.out.println("Fetched Data is:");
	  System.out.println(res.asString());
	  
			  
			  
  }
}
