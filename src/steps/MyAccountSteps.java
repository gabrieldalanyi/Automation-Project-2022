package org.automationproject2022.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class MyAccountSteps extends BaseSteps {

    @Step
    public void clickMyAccountButton() {
        myAccountPage.clickMyAccountButton();
    }

    @Step
    public void clickAccountDetailsButton() {
        myAccountPage.clickAccountDetailsButton();
    }

    @Step
    public void setCurrentPasswordField(String currentpassword) {
        myAccountPage.setCurrentPasswordField(currentpassword);
    }

    @Step
    public void setNewPasswordField(String newpassword) {
        myAccountPage.setNewPasswordField(newpassword);
    }

    @Step
    public void setNewPasswordConfirmField(String newpasswordconfirm) {
        myAccountPage.setNewPasswordConfirmField(newpasswordconfirm);
    }

    @Step
    public void clickSaveChangesPasswordButton() {
        myAccountPage.clickSaveChangesPasswordButton();
    }

    @Step
    public void checkPasswordMessageConfirmation() {
      Assert.assertSame((" ACCOUNT DETAILS CHANGED SUCCESSFULLY. ").toLowerCase(),myAccountPage.getCheckPasswordMessageConfirmation().toLowerCase());
    }
   // @Step
   // public void checkSuccessMessage(String productName){
   //     Assert.assertNotSame(( productName + " has been added to your cart.").toLowerCase(), cartPage.getSuccessMessage().toLowerCase());
   // }
}