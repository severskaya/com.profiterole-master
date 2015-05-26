package com.profiterole.steps.actions;

import com.profiterole.pages.RecipesDropDownPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;

public class RecipesDropDownSteps extends ScenarioSteps {

    private static final String INFORMATION_FROM_ALL_CUISINES_PAGE = "Выберите кухню";
    private static final String INFORMATION_FROM_CREATE_RECIPE_PAGE = "Создать рецепт";

    private RecipesDropDownPage recipesDropDownPage;

    @Step
    public void clickAllRecipesButton() {
        recipesDropDownPage.getAllRecipesButtonInDropDownList().click();
    }

    @Step
    public void clickCreateRecipeButton() {
        recipesDropDownPage.getCreateRecipeButtonInDropDownList().click();
    }

    @Step
    public void assertThatCuisinesAreVisibleForUser() {
        assertEquals("Кухни не видны пользователю", INFORMATION_FROM_ALL_CUISINES_PAGE,
                recipesDropDownPage.getTextFromAllCuisinePage().getText());
    }

    @Step
    public void assertThatCreateRecipePageIsVisible() {
        assertEquals("Страница с созданием рецептов не видна", INFORMATION_FROM_CREATE_RECIPE_PAGE,
                recipesDropDownPage.getTextFromCreateRecipeProfiterolePage().getText());
    }
}
