package com.uay.controller;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoControllerIT {

    @Test
    public void getEchoHello() throws InterruptedException {
        get("/echo/get")
                .then().assertThat()
                .body("message", equalTo("Hello get"));
    }

    @Test
    public void postEchoJson() {
        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{\"message\": \"post\"}")
                .when()
                .post("/echo")
                .then().assertThat()
                .body("message", equalTo("Hello post"));
    }
}