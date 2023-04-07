package org.automationproject2022.features;
import org.automationproject2022.pages.MyAccountPage;
import org.automationproject2022.utils.Constans;
import org.junit.Test;

public class MyAccountTest extends BaseTest {

    @Test
    public void changePassword() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        myAccountSteps.clickMyAccountButton();
        myAccountSteps.clickAccountDetailsButton();
        myAccountSteps.setCurrentPasswordField(Constans.USER_PASS);
        myAccountSteps.setNewPasswordField(Constans.NEW_USER_PASS);
        myAccountSteps.setNewPasswordConfirmField(Constans.NEW_CONFIRM_USER_PASS);
        myAccountSteps.clickSaveChangesPasswordButton();
        myAccountSteps.clickAccountDetailsButton();
        myAccountSteps.setCurrentPasswordField(Constans.NEW_USER_PASS);
        myAccountSteps.setNewPasswordField(Constans.USER_PASS);
        myAccountSteps.setNewPasswordConfirmField(Constans.USER_PASS);
        myAccountSteps.clickSaveChangesPasswordButton();
        myAccountSteps.checkPasswordMessageConfirmation();

    }
}