package org.automationproject2022.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy (css =".single_add_to_cart_button.button ")
    private WebElementFacade addCartButton;
    @FindBy (css=".wc-proceed-to-checkout a[href='http://qa3.umedykit.org:8008/checkout']")
    private WebElementFacade checkoutButton;

    @FindBy(css=".button.wc-forward")
    private WebElementFacade viewCartButton;

    public void clickAddCartButton() {
        clickOn(addCartButton);
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void clickViewCartButton() {clickOn(viewCartButton);}



    @FindBy(css = " div.woocommerce-message")
    private WebElementFacade successMessage;


    @FindBy(css = " .product-subtotal .woocommerce-Price-amount.amount")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount.amount")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = ".shipping .woocommerce-Price-amount.amount")
    private WebElementFacade taxPrice;

    @FindBy(css = ".order-total .woocommerce-Price-amount.amount")
    private WebElementFacade totalCartPrice;

    public String getSuccessMessage(){
        return successMessage.getText();
    }

    public int getProductsSubtotal(){
        int sum = 0;
        for(WebElementFacade elementFacade:subtotalProductsList){
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }
    public boolean checkIfSubtotalMatches(){
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }
    public boolean checkIfTotalPriceMatches(){
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal +fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }

}
