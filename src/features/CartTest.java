package org.automationproject2022.features;



import org.automationproject2022.utils.Constans;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constans.USER_EMAIl,Constans.USER_PASS);
        searchSteps.navigateToProductName("CAP");
        cartSteps.addProductToCart();

    }
    @Test
    public void checkTotalAndSubtotalTest(){
        searchSteps.navigateToProductName("BELT");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("BELT");

        searchSteps.navigateToProductName("CAP");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("CAP");

        cartSteps.checkoutButton();

        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }
}
