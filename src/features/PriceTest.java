package org.automationproject2022.features;

import org.automationproject2022.pages.PricePage;
import org.junit.Test;

public class PriceTest extends BaseTest {

    @Test
    public void checkProductPrice() {
        priceSteps.clickShopButton();
        priceSteps.clickDropDownPriceList();
        priceSteps.checkFirstAndSecondProductPrice();

    }



    }

