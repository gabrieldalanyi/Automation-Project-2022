package org.automationproject2022.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageObject {

    @FindBy(css="a[href='http://qa3.umedykit.org:8008/my-account']")
    private WebElementFacade myAccountButton;

   @FindBy(css=".woocommerce-MyAccount-navigation a[href='http://qa3.umedykit.org:8008/my-account/edit-account/']")
    private WebElementFacade accountDetailsButton;

   @FindBy(css="#password_current")
   private WebElementFacade currentPasswordField;

   @FindBy(css="#password_1")
   private WebElementFacade newPasswordField;
   @FindBy(css="#password_2")
   private WebElementFacade newPasswordconfirmField;

   @FindBy(css=".woocommerce-Button.button")
   private WebElementFacade saveChangesPasswordButton;

   @FindBy(css=".woocommerce .woocommerce-message")
  private WebElementFacade checkPasswordMessageConfirmation;


    public void clickMyAccountButton() {
        clickOn(myAccountButton);
    }
    public void clickAccountDetailsButton(){clickOn(accountDetailsButton);}

    public void setCurrentPasswordField(String value) {typeInto(currentPasswordField, value);}

    public void setNewPasswordField(String value) {typeInto(newPasswordField, value);}

    public void setNewPasswordConfirmField(String value) {typeInto(newPasswordconfirmField, value);}

    public void clickSaveChangesPasswordButton(){clickOn(saveChangesPasswordButton);}

    public String getCheckPasswordMessageConfirmation(){
        return checkPasswordMessageConfirmation.getText();
    }

}
