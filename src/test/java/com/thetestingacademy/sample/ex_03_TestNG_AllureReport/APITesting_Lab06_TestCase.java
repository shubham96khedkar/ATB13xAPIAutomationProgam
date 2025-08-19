package com.thetestingacademy.sample.ex_03_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {

    String pincode;

    @Test
//@Test is a TestNG annotation.After writing @Test, TestNg will consider just below method of annotation as a Test case and it will have a green triangle symbol to run that TC
//For below method or function use valid pincode as 110001

    public void test_tc1_pincode_valid(){

        pincode = "110048";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
//Use the pincode as 110001 in output in console
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }

    @Test
    //For below method use pincode as @ or any special character as pincode for input

    public void test_tc2_pincode_invalid(){

        pincode = "@";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
//Use the pincode as 110001 in output in console
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }

    @Test
    //For below method use pincode as ' ' i.e blank input or pincode

    public void test_tc3_pincode_invalid(){

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
