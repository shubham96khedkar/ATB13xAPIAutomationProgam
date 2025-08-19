package com.thetestingacademy.sample.ex_01_RA_Basics;


import io.restassured.RestAssured;

public class RestAssuredHelloWorld {

    public static void main(String[] args) {

        //the ping request for health check is below
        //https://restful-booker.herokuapp.com/ping
        //We will check if it is giving us the status code

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(201);

        //log().all() means everything we need to log to console



    }
}
