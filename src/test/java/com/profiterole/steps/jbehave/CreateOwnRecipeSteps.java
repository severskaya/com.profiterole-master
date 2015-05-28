package com.profiterole.steps.jbehave;

import com.profiterole.steps.actions.CreateRecipeSteps;
import com.profiterole.steps.actions.RecipesDropDownSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CreateOwnRecipeSteps {

    @Steps
    private CreateRecipeSteps createRecipeSteps;

    @Steps
    private RecipesDropDownSteps recipesDropDownSteps;

    @When("the user clicks on Create Recipe Button")
    public void whenUserClicksCreateRecipeButton(){
        recipesDropDownSteps.clickCreateRecipeButton();
    }

    @When("the user enters Title in Create recipe")
    public void whenUserEntersTitle(){
        createRecipeSteps.enterTitleInCreateRecipe();
    }

    @When("the user enters Description in Create recipe")
    public void whenUserEntersDescription(){
        createRecipeSteps.enterDescriptionInCreateRecipe();
    }

    @When("the user enters Coocking Time Hours in Create recipe")
    public void whenUserEntersCoockingTimeHours(){
        createRecipeSteps.enterCookingTimeHoursInCreateRecipe();
    }

    @When("the user enters Coocking Time Minutes in Create recipe")
    public void whenUserEntersCoockingTimeMinutes(){
        createRecipeSteps.enterCookingTimeMinutesInCreateRecipe();
    }

    @When("the user enters Quantity of Dish in Create recipe")
    public void whenUserEntersQuantityOfDish(){
        createRecipeSteps.enterQuantityOfDishInCreateRecipe();
    }

    @When("the user clicks on Cuisine in Create recipe")
    public void whenUserClicksOnCuisine(){
        createRecipeSteps.clickOnCuisineInCreateRecipe();
    }

    @When("the user chooses Cuisine in Create recipe")
    public void whenUserChoosesCuisine(){
        createRecipeSteps.chooseCuisineInDropDownListInCreateRecipe();
    }

    @When("the user clicks on Category in create recipe")
    public void whenUserClicksOnCategory(){
        createRecipeSteps.clickOnCategoryInCreateRecipe();
    }

    @When("the user chooses Category in Create recipe")
    public void whenUserChoosesCategory(){
        createRecipeSteps.chooseCategoryInDropDownListInCreateRecipe();
    }

    @When("the user clicks on Marker in Create recipe")
    public void whenUserClicksOnMarker(){
        createRecipeSteps.clickOnMarkerCheckBoxInCreateRecipe();
    }

    @When("the user enters Ingredient Name in Create recipe")
    public void whenUserEntersIngredientName(){
        createRecipeSteps.enterIngredientNameInCreateRecipe();
    }

    @When("the user enters Count of Ingredients in Create recipe")
    public void whenUserEntersCountOfIngredient(){
        createRecipeSteps.enterIngredientCountInCreateRecipe();
    }

    @When("the user clicks on Type of Ingredients in Create recipe")
    public void whenUserClocksOnTypeOfIngredient(){
        createRecipeSteps.clickOnIngredientTypeInCreateRecipe();
    }

    @When("the user chooses Type of Ingredient in Create recipe")
    public void whenUserChooseTypeOfIngredient(){
        createRecipeSteps.chooseIngredientTypeInDropDownList();
    }

    @When("the user clicks on Complexity in Create recipe")
    public void whenUserClicksOnComplexity(){
        createRecipeSteps.clickOnComplexityInCreateRecipe();
    }

    @When("the user chooses Complexity in Create recipe")
    public void whenUserChoosesComplexity(){
        createRecipeSteps.chooseLevelOfComplexityIndropDownList();
    }

    @When("the user enters Steps in Create recipe")
    public void whenUserEntersSteps(){
        createRecipeSteps.enterTextInTiStepsInputField();
    }

    @When("the user presses Create Button in Create recipe")
    public void whenUserPressesCreateButton(){
        createRecipeSteps.presOnCreateRecipeButton();
    }

    @Then("the user should see the message 'Рецепт был успешно создан'")
    public void thenUserShouldSeeMessage(){
        createRecipeSteps.assertThatRecipeWasCreated();
    }
}
