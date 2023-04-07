package org.automationproject2022.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {
    @FindBy(css = ".single_add_to_cart_button.button ")
    private WebElementFacade addToCartButton;


    public void clickAddToCart(){
        clickOn(addToCartButton);
    }
}
