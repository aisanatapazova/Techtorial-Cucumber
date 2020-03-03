package stepDefinitions.webOrdersStepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.webOrdersPage.HomePage;

public class HomePageStepDefs {

    HomePage page=new HomePage();

    @Then("the user validates order menu list")
    public void the_user_validates_order_menu_list() {
        for (int i=0; i< page.homeMenuHeaders.size(); i++){
            Assert.assertEquals(page.homeMenuHeaders.get(i).getText(), page.orderMenuData().get(i));
        }
    }

}
