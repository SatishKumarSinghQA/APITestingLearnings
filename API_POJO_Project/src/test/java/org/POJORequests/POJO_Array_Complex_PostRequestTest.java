package org.POJORequests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POJO_Array_Complex_PostRequestTest {
  @Test
  public void POJOArrayComplexPostRequestTest() {
	  
	  
	  POJO_Complex_ComplexAddress[] Address= new POJO_Complex_ComplexAddress[2];
	  Address[0]= new POJO_Complex_ComplexAddress();
	  Address[1]= new POJO_Complex_ComplexAddress();
	  
	  Address[0].H_No="135/4";
	  Address[0].Street="Mahadev Nagar 1";
	  Address[0].ZipCode="211022";
	  
	  Address[1].H_No="145/4";
	  Address[1].Street="Mahadev Nagar 1";
	  Address[1].ZipCode="211021";
	  
	  POJO_Array_Complex_BasicInfo Data= new POJO_Array_Complex_BasicInfo();
	  Data.setFirstName("Ajay");
	  Data.setLastName("Singh");
	  Data.setDesignation("VP");
	  Data.setMentorName("SK Singh");
	  Data.setCourseName("API Testing");
	  Data.setId("256097");
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
