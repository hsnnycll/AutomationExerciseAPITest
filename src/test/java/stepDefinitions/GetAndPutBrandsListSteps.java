package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.parsing.Parser;
import pojo.BrandsList;
import utilities.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class GetAndPutBrandsListSteps {
    BrandsList brandsListRes;

    @Given("the user wants to test get all brands with {string}")
    public void the_user_wants_to_test_getting_all_brands(String url) throws IOException {
        brandsListRes = given().expect().defaultParser(Parser.JSON)
                .when().get(url).as(BrandsList.class);
    }

    @Given("the user wants to test put all brands with {string}")
    public void the_user_wants_to_test_put_all_brands(String url) throws IOException {
        brandsListRes = given().expect().defaultParser(Parser.JSON)
                .when().put(url).as(BrandsList.class);
    }

    @Then("Verify {int} http status code")
    public void verify_http_status_code(int code) {
        assertEquals(brandsListRes.getResponseCode(), code);
    }

    @Then("Verify Response message")
    public void verify_rspnse_message() {
        assertEquals(brandsListRes.getMessage(), "This request method is not supported.");
    }
}
