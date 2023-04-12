package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.*;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {


        given()
                .baseUri("http://localhost:9999/api/v1")

                .when()
                .get("/demo/accounts")

                .then()
                .statusCode(200);
    }
}
