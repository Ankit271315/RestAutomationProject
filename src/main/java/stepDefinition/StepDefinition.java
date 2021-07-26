package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("Create issue in jira with payload {string} {string} {string}")
	public void create_issue_in_jira_with_payload(String string, String string2, String string3) {

	}

	@When("user calls {string} with post http request")
	public void user_calls_with_post_http_request(String string) {

	}

	@Then("Api got success with status code {int}")
	public void api_got_success_with_status_code(Integer int1) {

	}

	@Then("{string} in respones body is {string}")
	public void in_respones_body_is(String string, String string2) {

	}

}
