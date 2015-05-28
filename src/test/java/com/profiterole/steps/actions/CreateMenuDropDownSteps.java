package com.profiterole.steps.actions;

import com.profiterole.pages.CreateMenuDropDownPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;

public class CreateMenuDropDownSteps extends ScenarioSteps {

    final static private String INFORMATION_FROM_CREATE_MENU_ON_A_WEEK = "Mo";
    final static private String INFORMATION_FROM_CREATE_MENU_ON_A_DAY = "#supper";

    private CreateMenuDropDownPage createMenuDropDownPage;

    @Step
    public void clickMenuOnADayButton() {
        createMenuDropDownPage.getMenuOnADayInDropDownList().click();
    }

    @Step
    public void clickMenuOnaWeekButton() {
        createMenuDropDownPage.getMenuOnAWeekInDropDownList().click();
    }

    @Step
    public void assertThatCreateMenuOnADayPageIsVisible() {

        assertEquals("Страница Создать меню на день не прогрузилась", INFORMATION_FROM_CREATE_MENU_ON_A_DAY,
                createMenuDropDownPage.getInformationFromCreateMenuOnDayPage().getValue());
    }

    @Step
    public void assertThatPageWithSevenDaysIsVisible() {

       assertEquals("Страница 7 дней недели не прогрузилась", INFORMATION_FROM_CREATE_MENU_ON_A_WEEK,
               createMenuDropDownPage.getCInformationFromCreateMenuOnWeek().getValue());
    }
}
