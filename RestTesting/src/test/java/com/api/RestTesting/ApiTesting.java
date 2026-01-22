package com.api.RestTesting;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTesting {

	@Test
	void apiTest() {
		Response r = RestAssured
		.given()//this is for request block
		.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()//this is for response block
		.statusCode(200)
		.extract()
		.response();
		
		System.out.println(r.asPrettyString());
	}
}
