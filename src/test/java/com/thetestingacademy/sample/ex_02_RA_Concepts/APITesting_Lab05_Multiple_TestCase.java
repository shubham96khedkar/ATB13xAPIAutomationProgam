package com.thetestingacademy.sample.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab05_Multiple_TestCase {

    public static void main(String[] args) {

        String pincode = "110048";
//Below code is direct BDD Style.
//In direct BDD Style we are not reusing the code, we are not using classes and objects.
//We are directly using dot dot to write multiple test cases.That's why we don't prefer to use direct BDD Style

        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
//Use the pincode as 110001 in output in console
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

        pincode = "@";

        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
//Use the pincode as 110001 in output in console
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

        pincode = " ";

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
