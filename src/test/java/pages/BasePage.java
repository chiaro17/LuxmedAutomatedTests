package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    //Wait Wrapper Method
    public void waitForDisplay(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click (By elementBy) {
        waitForDisplay(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text Method
    public void writeText (By elementBy, String text) {
        waitForDisplay(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text Method
    public String readText (By elementBy) {
        waitForDisplay(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert Method
    public void assertEquals (By elementBy, String expectedText) {
        waitForDisplay(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);

    }
}