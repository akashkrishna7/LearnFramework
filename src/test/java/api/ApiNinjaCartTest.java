package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class ApiNinjaCartTest {

    @Test
    public void testGetStates() {
        RestAssured.baseURI = "https://traders.ninjacart.in";

        JSONObject requestBody = new JSONObject();
        requestBody.put("input", new JSONObject()
                .put("language", "EN")
                .put("category", "Garlic"));

        Response response = given()
                .headers("authority", "traders.ninjacart.in",
                        "accept", "application/json, text/plain, */*",
                        "accept-language", "en-US,en;q=0.9",
                        "content-type", "application/json",
                        "origin", "https://traders-new.ninjacart.in",
                        "referer", "https://traders-new.ninjacart.in/",
                        "sec-fetch-dest", "empty",
                        "sec-fetch-mode", "cors",
                        "sec-fetch-site", "same-site",
                        "user-agent", "Mozilla/5.0 (Linux; Android 13; sdk_gphone_x86_64 Build/TE1A.220922.025; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/103.0.5060.71 Mobile Safari/537.36",
                        "x-nc-tool-id", "671b2a08-d28f-4a5c-b6aa-3c83b6430b0b",
                        "x-requested-with", "com.nc.trader")
                .body(requestBody.toString())
                .contentType(ContentType.JSON)
                .post("/workflow-engine/1/1/v1/execution/service/runWithNoAuth/get-states");

        // Pretty-print the response using Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String responseBody = response.getBody().asString();
        String prettyResponseBody = gson.toJson(gson.fromJson(responseBody, Object.class));

        // Print the formatted response
        System.out.println("API Response Body:\n" + prettyResponseBody);

        // Perform assertions on the response
        assertEquals(response.getStatusCode(), 200);
    }
}

