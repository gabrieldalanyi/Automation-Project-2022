package org.automationproject2022.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends PageObject {

    @FindBy(css = ".woocommerce-billing-fields__field-wrapper #billing_address_1")
    private WebElementFacade addressField;

    @FindBy(css = ".woocommerce-billing-fields__field-wrapper #billing_city")
    private WebElementFacade cityAddressField;

    @FindBy(css = "#billing_state")
    private WebElementFacade stateField;

    @FindBy(css = ".woocommerce-billing-fields__field-wrapper #billing_postcode")
    private WebElementFacade postCodeField;

    @FindBy(css = ".woocommerce-billing-fields__field-wrapper #billing_phone")
    private WebElementFacade telephoneField;


    @FindBy(css = ".woocommerce-checkout-payment .place-order")
    private WebElementFacade placeOrderButton;

    public void setAddressField(String value) {
        typeInto(addressField, value);
    }

    public void setCityAddressField(String value) {
        typeInto(cityAddressField, value);
    }

    public void setStateField(String state) {
        stateField.selectByVisibleText("Bihor");
    }

    public void setPostCodeField(String value) {
        typeInto(postCodeField, value);
    }

    public void setTelephoneField(String value) {
        typeInto(telephoneField, value);
    }
    public void clickPlaceOrderButton() {
        clickOn(placeOrderButton);
    }
}






