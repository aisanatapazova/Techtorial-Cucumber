package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void switchWindow(WebDriver driver, String targetTitle) {
        Set<String> allWindows = driver.getWindowHandles();
        if (!driver.getTitle().equals(targetTitle)) {
            for (String window : allWindows) {
                driver.switchTo().window(window);
                if (driver.getTitle().equals(targetTitle)) {
                    break;
                }
            }
        }
    }

    public static void verifyBrokenLink(List<WebElement> links) {

        for (WebElement link : links) {
            String hrefValue = link.getAttribute("href");
            try {
                URL url = new URL(hrefValue);
                HttpURLConnection connect = (HttpURLConnection) url.openConnection();
                connect.setConnectTimeout(3000);
                connect.connect();
                if (connect.getResponseCode() >= 400 || connect.getResponseCode() >= 500) {
                    System.out.println(links);
                    System.out.println("The link is broken " + connect.getResponseMessage() + "\n" + connect.getResponseCode());
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void hoverOver(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public static void dragAndDrop(WebDriver driver, WebElement from, WebElement to) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();
    }

    public static void waitForVisibilityOfElement(WebDriver driver, WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForClickability(WebDriver driver, WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void takeScreenshot() throws IOException {
        File src = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File desFile = new File("ScreenShotFile/" + System.currentTimeMillis() + ".png");
        FileUtils.copyFile(src, desFile);
    }
}




