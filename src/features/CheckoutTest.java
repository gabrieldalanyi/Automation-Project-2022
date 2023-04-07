package org.automationproject2022.features;

import org.automationproject2022.utils.Constans;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest() {
        loginSteps.doLogin(Constans.USER_EMAIl,Constans.USER_PASS);
        searchSteps.navigateToProductName("Belt");
        cartSteps.addProductToCart();
        cartSteps.viewCartButton();
        checkoutSteps.checkoutButton();
        checkoutSteps.setUseraddress("Str. Iza Nr. 27 Ap. 19");
        checkoutSteps.setUserCityaddress("Oradea");
        checkoutSteps.setStateField("Bihor");
        checkoutSteps.setPostCodeField("410568");
        checkoutSteps.setTelephonefield("0765988723");
        checkoutSteps.clickPlaceOrderButton();




    }
}
