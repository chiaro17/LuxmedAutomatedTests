package tests;

import org.testng.annotations.Test;
import pages.LuxmedPage;

public class TestLuxmedPage extends BaseTest {

    @Test ()
    public void changeLanguageToEnglishTest(){

        //*************PAGE INSTANTIONS*************
        LuxmedPage loginPage = new LuxmedPage(driver);

        loginPage.goToLuxmedPage();
        try{
            loginPage.waitForLanguageEnglishSelector();
        }
        catch (Exception e){
            loginPage.waitForLanguageEnglishFlag();

        }

    }

}
