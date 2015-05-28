package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class CreateRecipePage extends PageObject {

    public WebElementFacade getTitleInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@name = 'title']"));
    }

    public WebElementFacade getDescriptionInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@name = 'description']"));
    }

    public WebElementFacade getCookingTimeHoursInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@name = 'cookingTimeHours']"));
    }

    public WebElementFacade getCookingTimeMinutesInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@name = 'cookingTimeMinutes']"));
    }

    public WebElementFacade getQuantityOfDishInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@name = 'quantityOfDish']"));
    }

    public WebElementFacade getCuisineDropDownListInCreateRecipe(){
        return find(By.xpath("//*[@name = 'cuisineId']"));
    }

    public WebElementFacade getOneCuisineInCuisineDropDownList(){
        return find(By.xpath("//option[contains(text(), 'Украинская')]"));
    }

    public WebElementFacade getCategoryDropDownListCreateRecipes(){
        return find(By.xpath("//*[@name = 'categoryId']"));
    }

    public WebElementFacade getOneCategoryInCategoryDropDownList(){
        return find(By.xpath("//option[contains(text(), 'Закуски')]"));
    }

    public WebElementFacade getMarkersCheckBoxInCreateRecipe(){
        return find(By.xpath("//*[@type = 'checkbox' and @value = 'острый']"));
    }

    public WebElementFacade getIngredientsNameInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@name='ingredientsNameList[0]']"));
    }

    public WebElementFacade getIngredientCountInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@name='ingredientsCountList[0]']"));
    }

    public WebElementFacade getIngredientTypeDropDownFieldInCreateRecipe(){
        return find(By.xpath("//*[@name='ingredientsTypeList[0]']"));
    }

    public WebElementFacade getOneIngredientTypeInCreateRecipe(){
        return find(By.xpath("//option[contains(text(), 'мл')]"));
    }

    public WebElementFacade getComplexityDropDownInCreateRecipe(){
        return find(By.xpath("//*[@name = 'complexity']"));
    }

    public WebElementFacade getOneLevelOfComplexityIndropDownList(){
        return find(By.xpath("//*[@value = 'легкий']"));
    }

    public WebElementFacade getStepsInputFieldInCreateRecipe(){
        return find(By.xpath("//*[@class = 'stepTextarea forinputs']"));
    }

    public WebElementFacade getCreateButtonInCreateRecipe(){
        return find(By.xpath("//*[@id='OK']"));
    }

    public WebElementFacade getInformationFromYouRecipeWasCreated(){
        return find(By.xpath("//h4[contains(text(), 'Рецепт был успешно добавлен')]"));
    }
}
