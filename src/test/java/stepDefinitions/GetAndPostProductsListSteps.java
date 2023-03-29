package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.parsing.Parser;
import pojo.ProductList;
import utilities.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class GetAndPostProductsListSteps {

    ProductList productListRes;

    @Given("the user wants to test get all products with {string}")
    public void the_user_wants_to_test_getting_all_products(String url) throws IOException {
            productListRes = given().expect().defaultParser(Parser.JSON)
                    .when().get(url).as(ProductList.class);
    }

    @Given("the user wants to test post all products with {string}")
    public void the_user_wants_to_test_post_all_products(String url) throws IOException {
        productListRes = given().expect().defaultParser(Parser.JSON)
                .when().post(url).as(ProductList.class);
    }

    @Then("Verify http status code {int}")
    public void verify_http_status_code(int code) {
        assertEquals(productListRes.getResponseCode(), code);
    }

    @Then("Verify response message")
    public void verify_response_message() {
        assertEquals(productListRes.getMessage(), "This request method is not supported.");
    }
}
