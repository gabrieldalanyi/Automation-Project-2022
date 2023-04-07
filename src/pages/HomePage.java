package org.automationproject2022.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.umedykit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-1730")
    private WebElementFacade accountLink;

    @FindBy(css = ".fa-search ")
    private WebElementFacade searchFieldButton;

    @FindBy( css = ".search-block .search-form .search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".search-form .search-submit")
    private WebElementFacade searchButton;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

   public void clickSearchFieldButton(){clickOn(searchFieldButton);}

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }
}
