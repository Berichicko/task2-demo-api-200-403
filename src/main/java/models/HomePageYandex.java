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

    public int postResponseCode(String url) {
        return given()
                .contentType(ContentType.JSON)
                .post("/api/users?page")
                .then()
                .extract()
                .statusCode();
    }


    public String getHeaders(String url) {
        String headers = given()
                .contentType(ContentType.JSON)
                .get(url).then().extract().headers().toString();
        return headers;
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
