package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LuxmedPage extends BasePage {

    public LuxmedPage(WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "https://www.luxmed.pl/";

    //Web Element
    By languageEnglishSelector = By.xpath("//a[@title = 'English' and contains(text(), 'EN')]");
    By languageEnglishFlag = By.xpath("//img[@alt = 'English']");

    //*********Page Methods*********

    //Go to Homepage
    public LuxmedPage goToLuxmedPage (){
        driver.get(baseURL);
        return this;
    }

    public void waitForLanguageEnglishSelector() {
        waitForDisplay(languageEnglishSelector);
    }

    public void waitForLanguageEnglishFlag() {
        waitForDisplay(languageEnglishFlag);
    }
}
