package org.automationproject2022.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        cartPage.clickAddCartButton();

    }
    @Step
    public void viewCartButton(){
        cartPage.clickViewCartButton();
    }

    @Step
    public void checkoutButton(){
        cartPage.clickCheckoutButton();
    }

    @Step
    public void checkSuccessMessage(String productName){
        Assert.assertNotSame(( productName + " has been added to your cart.").toLowerCase(), cartPage.getSuccessMessage().toLowerCase());
    }
    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }
    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }



}

