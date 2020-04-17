package tests;

import org.testng.annotations.Test;
import pages.LuxmedPageEnglish;

public class TestLuxmedPageEnglish extends BaseTest {

    @Test ()
    public void changeLanguageToPolishTest(){

        //*************PAGE INSTANTIONS*************
        LuxmedPageEnglish loginPage = new LuxmedPageEnglish(driver);

        loginPage.goToLuxmedPageEnglish();
        try{
            loginPage.waitForLanguagePolishSelector();
        }
        catch (Exception e){
            loginPage.waitForLanguagePolskiFlag();

        }

    }

}
