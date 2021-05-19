package stepDefinitions;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

public class Steps {

    private static RequestSpecification requestSpec;
    RequestSpecification request;
    private  static  Response response;
    private  static  String  jsonString;
    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

	@Before
	public static void setup() {
		RestAssured.baseURI = "https://reqres.in/api";
	}

    @Given("^given that it is required to create a client$")
    public void que_se_requiere_crear_un_cliente() throws Throwable {
        request  =  RestAssured.given();
        request.header("Content-Type",  "application/json");

    }

    @When("^the name (.*) with (.*) role is sent$")
    public void se_envien_el_nombre_Sara(String nombre, String leader) throws Throwable {
        String requestBody = "{\n" +
            "  \"name\":" + nombre +
            "  \"job\": " + leader + "\n";
        response  =  request.body(requestBody).put("/users");
    }


    @Then("^successful registration is displayed$")
    public void successful_registration_is_displayed() throws Throwable {
        Assert.assertEquals(400, response.getStatusCode());

    }

    @Given("^given that it is required to delete a client$")
    public void given_that_it_is_required_to_delete_a_client() throws Throwable {
        request  =  RestAssured.given();
        request.header("Content-Type",  "application/json");
    }

    @When("^the delete is executed$")
    public void the_delete_is_executed() throws Throwable {
        response  =  request.get("/users/2");
    }

    @Then("^the successful deletion is displayed$")
    public void the_successful_deletion_is_displayed() throws Throwable {
        Assert.assertEquals(204, response.getStatusCode());
    }

    @Given("^that it is required to enroll users$")
    public void that_it_is_required_to_enroll_users() throws Throwable {
        request  =  RestAssured.given();
        request.header("Content-Type",  "application/json");
    }

    @When("^searching for the list user$")
    public void searching_for_the_list_user() throws Throwable {

        response  =  request.get("/users?page=1");
    }

    @Then("^the list is presented successfully$")
    public void the_list_is_presented_successfully() throws Throwable {
        Assert.assertEquals(200, response.getStatusCode());
    }


    @Given("^that it is required to search for a unique client$")
    public void that_it_is_required_to_search_for_a_unique_client() throws Throwable {
	    request  =  RestAssured.given();
	    request.header("Content-Type",  "application/json");
    }

    @When("^the user query is made$")
    public void the_user_query_is_made() throws Throwable {
        response  =  request.get("/users/2");

    }
    @Then("^the user is displayed successfully$")
    public void the_user_is_displayed_successfully() throws Throwable {
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Given("^given that it is required to update a client$")
    public void given_that_it_is_required_to_update_a_client() throws Throwable {
        request  =  RestAssured.given();
        request.header("Content-Type",  "application/json");
    }
    @When("^the name (.*) with (.*) role is used$")
    public void the_name_Sara_with_automation_role_is_used(String nombre, String leader) throws Throwable {
        String requestBody = "{\n" +
            "  \"name\":" + nombre +
            "  \"job\": " + leader + "\n";

        response  =  request.body(requestBody).put("/users/2");
    }

    @Then("^the successful update is displayed$")
    public void the_successful_update_is_displayed() throws Throwable {
        Assert.assertEquals(200, response.getStatusCode());
    }
}