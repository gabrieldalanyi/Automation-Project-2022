package org.automationproject2022.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void checkoutButton() {
        cartPage.clickCheckoutButton();

    }
    @Step
    public void setUseraddress(String address) {
        checkOutPage.setAddressField(address);
    }
    @Step
    public void setUserCityaddress(String cityaddress) {
        checkOutPage.setCityAddressField(cityaddress);
    }
    @Step
    public void setStateField(String state) {
        checkOutPage.setStateField(state);
    }
    @Step
    public void setPostCodeField(String postCode) {
        checkOutPage.setPostCodeField(postCode);
    }
    @Step
    public void setTelephonefield(String telephone) {
        checkOutPage.setTelephoneField(telephone);
    }

    @Step
    public void clickPlaceOrderButton(){checkOutPage.clickPlaceOrderButton();}


}

