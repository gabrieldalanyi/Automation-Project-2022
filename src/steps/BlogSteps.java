package org.automationproject2022.steps;

import net.thucydides.core.annotations.Step;

public class BlogSteps extends BaseSteps {

    @Step
    public void clickBlogButton() {
        blogPage.clickBlogButton();

    }
    @Step
    public void setBlogCommentField(String text) {
        blogPage.setBlogCommentField(text);
    }

    @Step
    public void clickBlogSubmitButton(){
        blogPage.clickBlogSubmitButton();
    }
}