package com.thetestingacademy.sample.ex_02_RA_Concepts;

public class APITesting_Lab03_NP {

    //In this class name, NP means non-builder pattern

    public void step1(){

        System.out.println("Step 1");
    }

    public void step2(){

        System.out.println("Step 2");
    }

    public void step3(String param1){

        System.out.println("Step 3");
    }

    public static void main(String[] args){

        APITesting_Lab03_NP nbp = new APITesting_Lab03_NP();
        nbp.step1();
        nbp.step2();
        nbp.step3("Shubham");
//Above 4 lines is non builder pattern because we are using the same object reference in 3 different statements
//For builder pattern the code should be nbp.step1().step2().step3("Shubham"); i.e in one statement

    }

}
