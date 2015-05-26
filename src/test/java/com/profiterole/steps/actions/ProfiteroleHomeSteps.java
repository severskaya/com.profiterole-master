package com.profiterole.steps.actions;

import com.profiterole.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;


public class ProfiteroleHomeSteps extends ScenarioSteps {

    private static final String ABOUT_US_PROFITEROLE_PAGE_INFORMATION = "О нас";
    private ProfiteroleHomePage profiterolePage;

    @Step
    public void openPage() {
        profiterolePage.open();
    }

    @Step
    public void clickAboutUsButton() {
        profiterolePage.getAboutUsButton().click();
    }

    @Step
    public void clickEnterButton() {
        profiterolePage.getEnterButton().click();
    }

    @Step
    public void clickRecipesButton() {
        profiterolePage.getRecipesButton().click();
    }

    @Step
    public void clickCreateMenuButton() {
        profiterolePage.getCreateMenuButton().click();
    }

    @Step
    public void enterQueryIntoSearchField(String query) {
        profiterolePage.getSearchField().sendKeys(query);
    }

    @Step
    public void assertThatAboutUsPageWasOpened(){
        assertEquals("Страница 'О нас' не была открыта", ABOUT_US_PROFITEROLE_PAGE_INFORMATION,
                profiterolePage.getAboutUsProfiterolePageInformation().getText());
    }
}