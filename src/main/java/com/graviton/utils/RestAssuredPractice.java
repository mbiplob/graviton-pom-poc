package com.graviton.utils;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredPractice {

 /*   public static void main(String[] args) {
        restAssuredTest();
    }*/

    @Test
    public static void restAssuredTest(){

        RestAssured.baseURI = "https://api.fiscaldata.treasury.gov/services/api/fiscal_service/";
        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.get("v2/accounting/od/debt_to_penny?sort=-record_date");
        int responseCode = response.statusCode();
        System.out.println("Response code: "+ responseCode);

        ResponseBody responseBody = response.getBody();

        JsonPath jsonPath = responseBody.jsonPath();

        System.out.println(jsonPath.getString("data[1].tot_pub_debt_out_amt"));

        Assert.assertEquals(jsonPath.getString("data[1].tot_pub_debt_out_amt"), "28427228984208.34");

    }


}
