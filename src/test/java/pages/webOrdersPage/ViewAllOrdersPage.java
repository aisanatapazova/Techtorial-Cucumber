package pages.webOrdersPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ViewAllOrdersPage {

    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//h2" )
    public WebElement listHeader;
}
