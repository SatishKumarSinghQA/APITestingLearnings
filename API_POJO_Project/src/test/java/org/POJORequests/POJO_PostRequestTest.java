package org.POJORequests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.http.*;


public class POJO_PostRequestTest {
  @Test
  public void POJO_PostReq() {
	  POJO_BasicInfo Data= new POJO_BasicInfo();
	  Data.setFirstName("Satish");
	  Data.setLastName("Singh");
	  Data.setDesignation("SQA and Automation Associate");
	  Data.setMentorName("Rituraaj Singh");
	  Data.setCourseName("API Testing");
	  Data.setId("211674");
	  
	  Response res=
			  given()
			  .contentType(ContentType.JSON)
			  .body(Data)
			  .when()
			  .post("http://localhost:3000/friends");
	  
	  System.out.println("Status Code for POST Request: "+res.getStatusCode());
	  System.out.println("Data Parsed is: ");
	  System.out.println(res.asString());
	  
  }
  
}
