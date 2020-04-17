package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LuxmedPageEnglish extends BasePage {

    public LuxmedPageEnglish(WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "https://www.luxmed.pl/en.html";

    //Web Element
    By languagePolishSelector = By.xpath("//a[@title='Polish' and contains (text(), 'PL')]");
    By languagePolskiFlag = By.xpath("//img[@alt = 'Polski']");

    //*********Page Methods*********

    //Go to Homepage
    public LuxmedPageEnglish goToLuxmedPageEnglish() {
        driver.get(baseURL);
        return this;
    }

    public void waitForLanguagePolishSelector() {
        waitForDisplay(languagePolishSelector);
    }

    public void waitForLanguagePolskiFlag() {
        waitForDisplay(languagePolskiFlag);
    }
}
