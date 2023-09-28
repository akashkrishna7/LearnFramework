package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class ApiSampleTest {
    @Test
    public void apiTestExample() {
        RestAssured.baseURI = "https://api.example.com"; // Replace with your API base URL

        Response response = given()
                .header("Content-Type", "application/json")
                .get("/endpoint");

        // Perform assertions on the response
        assertEquals(response.getStatusCode(), 200);
        assertTrue(response.getBody().asString().contains("expectedValue"));
    }
}
