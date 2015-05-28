package com.profiterole.steps.actions;

import com.profiterole.pages.ProfiterolesCuisinePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;


public class ProfiteroleCuisineSteps extends ScenarioSteps {

    private static final String INFORMATION_FROM_UKRAINIAN_DISHES_PAGE = "Украинская кухня";
    private static final String INFORMATION_FROM_MEXICO_DISHES_PAGE = "Мексиканская кухня";
    private static final String INFORMATION_FROM_FRENCH_DISHES_PAGE = "Французская кухня";
    private static final String INFORMATION_FROM_UKRAINIAN_SNACKSPAGE = "Молоко";

    private ProfiterolesCuisinePage profiterolesCuisinePage;

    @Step
    public void chooseCuisine(String cuisine){
        profiterolesCuisinePage.getCuisine(cuisine).click();
    }

    @Step
    public void clickOnShackButtonInUkrainianCuisine(){
        profiterolesCuisinePage.getSnacksButton().click();
    }

    @Step
    public void assertThatUkrainianDishesPageIsVisible(){
        assertEquals("Страница 'Украинская кухня' не прогрузилась", INFORMATION_FROM_UKRAINIAN_DISHES_PAGE,
                profiterolesCuisinePage.getInformationFromUkrainianDishesPage().getText());
    }

    @Step
    public void assertThatMexicoDishesPageIsVisible(){
        assertEquals("Страница 'Мексиканская кухня' не прогрузилась", INFORMATION_FROM_MEXICO_DISHES_PAGE,
                profiterolesCuisinePage.getInformationFromMexicoDishesPage().getText());
    }

    @Step
    public void assertTahtFrenchDishesPageisVisible(){
        assertEquals("Страница 'Французская кухня' не прогрузилась", INFORMATION_FROM_FRENCH_DISHES_PAGE,
                profiterolesCuisinePage.getInformationFromFrenchDishesPage().getText());
    }

    @Step
    public void assertThatUkrainianSnacksIsVisible(){
        assertEquals("Страница 'Закуски Украинской кухни' не прогрузилась", INFORMATION_FROM_UKRAINIAN_SNACKSPAGE,
                profiterolesCuisinePage.getInformationFromUkrainiansnacksPage().getText());
    }
}
