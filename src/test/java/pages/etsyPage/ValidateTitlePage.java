package pages.etsyPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ValidateTitlePage {

    public ValidateTitlePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='etsy-icon wt-nudge-b-1']")
    public WebElement searchBtn;

}
