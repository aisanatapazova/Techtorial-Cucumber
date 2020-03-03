package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.etsyPage.ValidateTitlePage;
import utils.ConfigReader;
import utils.Driver;

public class EtsyStepDefs {

    WebDriver driver= Driver.getDriver();
    ValidateTitlePage woodenPage=new ValidateTitlePage();


    @Given("the user navigates to the  Etsy webpage")
    public void the_user_navigates_to_the_Etsy_webpage() {
        driver.get(ConfigReader.getProperty("url2"));
    }

    @When("the user inputs the item in the search box {string}")
    public void the_user_inputs_the_item_in_the_search_box(String searchValue) {
       woodenPage.searchBox.sendKeys(searchValue);
       woodenPage.searchBtn.click();
    }

    @Then("the user validates the title of the new page {string}")
    public void the_user_validates_the_title_of_the_new_page(String title) {
       Assert.assertEquals(driver.getTitle(), title);
    }

}
