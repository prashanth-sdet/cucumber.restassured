package framework.stepdefinitions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Samplestepdefinitions {

	public RequestSpecification request;
	public Response response;
	public String responsebody;
	
	@Given("^I create a get request with baseURI (.*)$")
	public void givenget(String url) {
		RestAssured.baseURI = url;
		request = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON);

	}
	
	@Given("^I create a post request with baseURI (.*) and request (.*)$")
	public void givenpost(String url,String path) throws Exception {
		//System.out.println(new File("").getAbsolutePath() + "\\src\\test\\resources" + path);
		BufferedReader file = new BufferedReader(new FileReader(new File("").getAbsolutePath() + "\\src\\test\\resources\\requests" + path));
		//System.out.println(file.readLine());
		RestAssured.baseURI = url;
		request = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(file.readLine());
		file.close();
	}
	
	@When("^I pass a post request for endpoint (.*)$")
	public void whenpost(String url) {
		response = request.when().post(url);
	}
	
	@When("^I pass a get request for endpoint (.*)$")
	public void whenStatement(String url) {
		response = request.when().get(url);
	}

	@Then("^I print the response$")
	public void thenStatment() {
		responsebody = response.then().extract().asString();
		System.out.println(responsebody);
	}

	@Then("^I extract the key (.*) from response$")
	public void extractkeyvaluefromresponse(String key) {
		System.out.println(response.jsonPath().getString(key));
	}
}
