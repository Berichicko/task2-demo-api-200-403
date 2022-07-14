package models;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class HomePageYandex {

    public int getResponseCode(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .extract()
                .statusCode();
    }

    public String getHeaders(String url) {
        String s = given()
                .contentType(ContentType.JSON)
                .get(url).then().extract().headers().toString();
        return s;
    }

    public String getStatusLine(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .extract()
                .statusLine();
    }

    public String getContentType(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .extract()
                .contentType();
    }
}
