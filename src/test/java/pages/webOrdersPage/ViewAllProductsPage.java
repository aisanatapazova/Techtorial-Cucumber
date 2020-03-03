package pages.webOrdersPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;


public class ViewAllProductsPage {

    public ViewAllProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='View all products']")
    public WebElement viewAllBtn;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr")
    public List<WebElement> productList;

    public List<String> getProductList(){
        List<String> productsList=new ArrayList<>();
        for (WebElement element:productList){
            productsList.add(element.getText());
        }return productsList;
    }

    public List<String> expectedList(){
        List<String> expectedData=new ArrayList<>();
        expectedData.add("Product name Price Discount");
        expectedData.add("MyMoney $100 8%");
        expectedData.add("FamilyAlbum $80 15%");
        expectedData.add("ScreenSaver $20 10%");
        return expectedData;
    }
}
