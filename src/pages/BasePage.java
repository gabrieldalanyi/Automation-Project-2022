package org.automationproject2022.pages;

import net.serenitybdd.core.pages.PageObject;


    public class BasePage extends PageObject {

        public int convertStringToInteger(String element){
            return Integer.parseInt(element
                    .replaceAll(" lei", "")
                    .replaceAll(",","")
                    .replaceAll("\\.",""));
        }


}
