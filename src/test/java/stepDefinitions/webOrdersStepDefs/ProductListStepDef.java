package stepDefinitions.webOrdersStepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.webOrdersPage.ViewAllProductsPage;

import java.util.List;

public class ProductListStepDef {

    ViewAllProductsPage page=new ViewAllProductsPage();

    @Then("the user clicks view all products menu")
    public void the_user_clicks_view_all_products_menu() {
        page.viewAllBtn.click();
    }

    @Then("the user validates the products table")
    public void the_user_validates_the_products_table() {
        List<String> actualList=page.getProductList();
        List<String> expectedList=page.expectedList();

        Assert.assertTrue(actualList.containsAll(expectedList));
    }

}
