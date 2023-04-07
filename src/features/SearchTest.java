package org.automationproject2022.features;


import org.automationproject2022.utils.Constans;
import org.junit.Test;

public class SearchTest extends BaseTest {


    @Test
    public void loginAndSearchForProductNameTest() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.searchForKeyword("Beanie ");
        searchSteps.findProductWithNameInListAndOpen("BEANIE WITH LOGO");

    }

    @Test
    public void loginAndSearchForFirstProductNameTest() {
        loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
        searchSteps.searchForKeyword("produs");
        searchSteps.findProductWithNameInListAndOpen("PRODUSUL MEU EL");

    }
       @Test
        public void loginAndSearchForSecondProductNameTest() {
            loginSteps.doLogin(Constans.USER_EMAIl, Constans.USER_PASS);
            searchSteps.searchForKeyword("Hoodie");
            searchSteps.findProductWithNameInListAndOpen("HOODIE WITH ZIPPER");

        }
    }
