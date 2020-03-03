package stepDefinitions.webOrdersStepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.webOrdersPage.LoginPage;
import pages.webOrdersPage.ViewAllOrdersPage;
import utils.ConfigReader;

public class AllOrdersStepDefs {

    LoginPage loginPage=new LoginPage();
    ViewAllOrdersPage ordersPage=new ViewAllOrdersPage();

    @When("the user provides valid username and password")
    public void the_user_provides_valid_username_and_password() {
        loginPage.username.sendKeys(ConfigReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginBtn.click();
    }

    @Then("the user navigates to view all orders menu and validates the list of all orders header {string}")
    public void the_user_navigates_to_view_all_orders_menu_and_validates_the_list_of_all_orders_header(String expectedHeader) {
       String actualHeader=ordersPage.listHeader.getText();
        Assert.assertEquals(actualHeader, expectedHeader);
    }



}
