package org.POJORequests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POJO_Complex_PostRequestTest {
  @Test
  public void POJOComplexTest() {
	  
	  POJO_Complex_ComplexAddress Address= new POJO_Complex_ComplexAddress();
	  Address.H_No="124/4";
	  Address.Street="Mahadev Nagar";
	  Address.ZipCode="211019";
	  
	  POJO_Complex_BasicInfo Data= new POJO_Complex_BasicInfo();
	  Data.setFirstName("Anup");
	  Data.setLastName("Singh");
	  Data.setDesignation("SQA");
	  Data.setMentorName("Satish Singh");
	  Data.setCourseName("API Testing");
	  Data.setId("234690");
	  Data.setAddress(Address);
	  
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
