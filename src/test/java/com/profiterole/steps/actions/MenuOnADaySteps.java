package com.profiterole.steps.actions;

import com.profiterole.pages.MenuOnADayPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;


public class MenuOnADaySteps extends ScenarioSteps {

    private static final String INFORMATION_FROM_BREAKFAST_CREATE_MENU_ON_DAY = "Ваш завтрак";
    private MenuOnADayPage menuOnADayPage;

    @Step
    public void clickBreakfastButtonInMenuOnDay(){
        menuOnADayPage.getBreakfastButtonInMenuOnDay().click();
    }

    @Step
    public void clickDinnerButtonInMenuOnDay(){
        menuOnADayPage.getDinnerButtonInMenuOnDay().click();
    }

    @Step
    public void clickSupperButtonInMenuOnDay(){
        menuOnADayPage.getSupperButtonInMenuOnDay().click();
    }

    @Step
    public void assertThatBreakfastCreateMenuOnADayPageIsVisible(){
        assertEquals("Страница с завтраками в 'Создать меню на день' не была прогружена",
                INFORMATION_FROM_BREAKFAST_CREATE_MENU_ON_DAY, menuOnADayPage.getInformationFromBreakfastCreateMenuOnDay().getText());
    }
}
