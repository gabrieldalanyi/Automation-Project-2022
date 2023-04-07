package org.automationproject2022.features;

import org.automationproject2022.utils.Constans;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("gabrieldalanyi");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
