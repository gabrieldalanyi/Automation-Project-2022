package org.automationproject2022.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.automationproject2022.steps.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;
    @Steps
    protected PriceSteps priceSteps;

    @Steps
    protected BlogSteps blogSteps;

    @Steps
    protected MyAccountSteps myAccountSteps;

    @Before
    public void init(){
        driver.manage().window().maximize();
        driver.get("http://qa3.umedykit.org:8008/");
    }


}
