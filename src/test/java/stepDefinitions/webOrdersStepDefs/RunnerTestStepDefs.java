package stepDefinitions.webOrdersStepDefs;

import io.cucumber.java.en.Given;

public class RunnerTestStepDefs {
    @Given("the user sends key")
    public void the_user_sends_key() {
        System.out.println("This is for Test 1");
    }

    @Given("the user clicks the button")
    public void the_user_clicks_the_button() {
        System.out.println("This is for Test 2");
    }


}
