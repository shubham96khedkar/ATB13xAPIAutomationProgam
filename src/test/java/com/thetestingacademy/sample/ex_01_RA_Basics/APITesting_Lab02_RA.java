package com.thetestingacademy.sample.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_RA {

    public static void main(String[] args) {

        //Gherkin Syntax
        // Given() -> Pre-request - Url, Headers, Auth, Body...
        // when() -> HTTP method - GET, POST, PIT,PATCH, DELETE...
        // then() -> Validation - status code 200 ok, first name == SHUBHAM

       //Full URL - https://api.zippopotam.us/IN/560016
       //Base URI - https://api.zippopotam.us
       //base Path - /IN/560016

//the full URL is written as base URI followed by base Path

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pin Code");
        String pincode = sc.next();

        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
//Use the pincode as 110001 in output in console
                .when()
                .get()
                .then().log().all()
                .statusCode(200);


    }
}
