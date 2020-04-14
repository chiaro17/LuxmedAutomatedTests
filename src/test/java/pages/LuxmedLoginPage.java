package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

public class LuxmedLoginPage extends BasePage {

    //*********Constructor*********
    public LuxmedLoginPage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "https://rezerwacja.luxmed.pl/start/portalpacjenta";

    //*********Web Elements*********
    By loginInput = By.xpath("//input[@name = 'Login']");
    By passwordInput = By.id("passwordInput");
    By loginButton = By.xpath("//div[@id='ShowSignsLogInRow']/button");
    By errorMessageToolTip = By.className("inner");

    //*********Page Methods*********

    //Go to Homepage
    public LuxmedLoginPage goToLuxmedLoginPage (){
        driver.get(baseURL);
        return this;
    }

    public LuxmedLoginPage loginToLuxmed (String username, String password) {
        //Enter Username(Email)
        writeText(loginInput,username);
        //Enter Password
        writeText(passwordInput, password);
        //Click Login Button
        click(loginButton);
        return this;
    }

    //Verify Username Condition
    public LuxmedLoginPage verifyErrorLoginToolTip (String expectedText) {
        assertEquals(errorMessageToolTip, expectedText);
        return this;
    }
}