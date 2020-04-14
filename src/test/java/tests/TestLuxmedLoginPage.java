package tests;

import org.testng.annotations.Test;
import pages.LuxmedLoginPage;

public class TestLuxmedLoginPage extends BaseTest {
    @Test (priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {

        //*************PAGE INSTANTIONS*************
        LuxmedLoginPage loginPage = new LuxmedLoginPage(driver);

        //*************PAGE METHODS********************
        loginPage.goToLuxmedLoginPage()
                .loginToLuxmed("dada", "11223344")
                .verifyErrorLoginToolTip("Nieprawidłowy login lub hasło.");
    }
}