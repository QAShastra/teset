package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {


    @Given("open the Browser and Load the Login page url")
    public void open_the_browser_and_load_the_login_page_url() {
        System.out.println("open the Browser and Load the Login page url");
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        System.out.println("user enters valid username");
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        System.out.println("user enters valid password");
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("user click on login button");
    }
    @Then("verify the login profile name and baseurl contains dashboard")
    public void verify_the_login_profile_name_and_baseurl_contains_dashboard() {
        System.out.println("verify the login profile name and baseurl contains dashboard");
    }

}
