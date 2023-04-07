package org.automationproject2022.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {

    @FindBy(css = "div.woocommerce-MyAccount-content > p")
    private WebElementFacade welcomeTextElement;



    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }
}
