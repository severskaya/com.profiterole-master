package com.profiterole.steps.actions;

import com.profiterole.pages.CreateRecipePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class CreateRecipeSteps extends ScenarioSteps {

    private CreateRecipePage createRecipePage;
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "Description";
    public static final String COOKING_TIME_HOURS = "1";
    public static final String COOKING_TIME_MINUTES = "00";
    public static final String QUANTITY_OF_DISH = "100";
    public static final String INGREDIENT_NAME = "Сливки";
    public static final String STEPS = "Steps";
    public static final String INFORMATION_FROM_PAGE_AFTER_CREATE_RECIPE = "Рецепт был успешно добавлен";
    @Step
    public void enterTitleInCreateRecipe(){
        createRecipePage.getTitleInputFieldInCreateRecipe().sendKeys(TITLE);
    }

    @Step
    public void enterDescriptionInCreateRecipe(){
        createRecipePage.getDescriptionInputFieldInCreateRecipe().sendKeys(DESCRIPTION);
    }

    @Step
    public void enterCookingTimeHoursInCreateRecipe(){
        createRecipePage.getCookingTimeHoursInputFieldInCreateRecipe().sendKeys(COOKING_TIME_HOURS);
    }

    @Step
    public void enterCookingTimeMinutesInCreateRecipe(){
        createRecipePage.getCookingTimeMinutesInputFieldInCreateRecipe().sendKeys(COOKING_TIME_MINUTES);
    }

    @Step
    public void enterQuantityOfDishInCreateRecipe(){
        createRecipePage.getQuantityOfDishInputFieldInCreateRecipe().sendKeys(QUANTITY_OF_DISH);
    }

    @Step
    public void clickOnCuisineInCreateRecipe(){
        createRecipePage.getCuisineDropDownListInCreateRecipe().click();
    }

    @Step
    public void chooseCuisineInDropDownListInCreateRecipe(){
        createRecipePage.getOneCuisineInCuisineDropDownList().click();
    }

    @Step
    public void clickOnCategoryInCreateRecipe(){
        createRecipePage.getCategoryDropDownListCreateRecipes().click();
    }

    @Step
    public void chooseCategoryInDropDownListInCreateRecipe(){
        createRecipePage.getOneCategoryInCategoryDropDownList().click();
    }

    @Step
    public void clickOnMarkerCheckBoxInCreateRecipe(){
        createRecipePage.getMarkersCheckBoxInCreateRecipe().click();
    }

    @Step
    public void enterIngredientNameInCreateRecipe(){
        createRecipePage.getIngredientsNameInputFieldInCreateRecipe().sendKeys(INGREDIENT_NAME);
    }

    @Step
    public void enterIngredientCountInCreateRecipe(){
        createRecipePage.getIngredientCountInputFieldInCreateRecipe().sendKeys(QUANTITY_OF_DISH);
    }

    @Step
    public void clickOnIngredientTypeInCreateRecipe(){
        createRecipePage.getIngredientTypeDropDownFieldInCreateRecipe().click();
    }

    @Step
    public void chooseIngredientTypeInDropDownList(){
        createRecipePage.getOneIngredientTypeInCreateRecipe().click();
    }

    @Step
    public void clickOnComplexityInCreateRecipe(){
        createRecipePage.getComplexityDropDownInCreateRecipe().click();
    }

    @Step
    public void chooseLevelOfComplexityIndropDownList(){
        createRecipePage.getOneLevelOfComplexityIndropDownList().click();
    }

    @Step
    public void enterTextInTiStepsInputField(){
        createRecipePage.getStepsInputFieldInCreateRecipe().sendKeys(STEPS);
    }

    @Step
    public void presOnCreateRecipeButton(){
        createRecipePage.getCreateButtonInCreateRecipe().click();
    }

    @Step
    public void assertThatRecipeWasCreated(){
        assertEquals("Рецепт не был создан", INFORMATION_FROM_PAGE_AFTER_CREATE_RECIPE, createRecipePage.getInformationFromYouRecipeWasCreated().getText());
    }
}
