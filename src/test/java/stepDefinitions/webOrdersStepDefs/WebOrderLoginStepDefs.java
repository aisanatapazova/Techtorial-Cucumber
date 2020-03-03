package stepDefinitions.webOrdersStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.webOrdersPage.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class WebOrderLoginStepDefs {

    WebDriver driver= Driver.getDriver();
    LoginPage page=new LoginPage();

    @Given("the user navigates to the web orders page")
    public void the_user_navigates_to_the_web_orders_page() {
        System.out.println("Navigated to WebOrder page");
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("the user provides valid username")
    public void the_user_provides_valid_username() {
        System.out.println("The user sent tester");
        page.username.sendKeys(ConfigReader.getProperty("username"));

    }

    @When("the user provides valid password")
    public void the_user_provides_valid_password() {
        System.out.println("The user sent test");
        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.loginBtn.click();
    }

    @Then("the user should see home page")
    public void the_user_should_see_home_page() {
        System.out.println("The user validated home page");
        String expectedTitle="Web Orders";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("the user provides the username {string}")
    public void the_user_provides_the_username(String username) {
        page.username.sendKeys(username);
    }

    @When("the user provides the password {string}")
    public void the_user_provides_the_password(String password) {
      page.password.sendKeys(password);
      page.loginBtn.click();
    }

    @Then("the user should validate text {string}")
    public void the_user_should_validate_text(String message) {
        String actualMessage=page.errorMessage.getText();
        Assert.assertEquals(actualMessage, message);
    }

    @When("the user provides the username {int}")
    public void the_user_provides_the_username(Integer int1) {
        page.username.sendKeys(""+int1);
    }

    @When("the user provides the password {int}")
    public void the_user_provides_the_password(Integer int1) {
        page.password.sendKeys(int1.toString());
        page.loginBtn.click();
    }

    @When("the user provides the username {string} and password {string}")
    public void the_user_provides_the_username_and_password(String username, String password) {
       page.username.sendKeys(username);
       page.password.sendKeys(password);
       page.loginBtn.click();
    }




}
