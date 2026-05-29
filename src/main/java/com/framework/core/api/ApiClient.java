package com.framework.core.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiClient {

    // Base URI can be set once
    static {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    public static Response getUser(String userId) {
        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json");

        return request
                .when()
                .get("/users/" + userId)
                .then()
                .extract()
                .response();
    }
}
