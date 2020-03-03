package stepDefinitions.webOrdersStepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.Driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hook {
WebDriver driver;
    @Before
    public void setUpDriver(){
        WebDriver driver= Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("This is before test annotation");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            BrowserUtils.takeScreenshot();
        }
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
