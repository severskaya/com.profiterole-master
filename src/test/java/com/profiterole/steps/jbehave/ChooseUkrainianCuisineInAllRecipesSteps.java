package com.profiterole.steps.jbehave;


import com.profiterole.steps.actions.ProfiteroleCuisineSteps;
import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import com.profiterole.steps.actions.RecipesDropDownSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ChooseUkrainianCuisineInAllRecipesSteps {

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private RecipesDropDownSteps recipesDropDownSteps;

    @Steps
    private ProfiteroleCuisineSteps profiteroleCuisineSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Recipes Button")
    public void givenClicksRecipesButton(){
        profiteroleHomeSteps.clickRecipesButton();
    }

    @Given("the user clicks on All Recipes Button")
    public void givenClicksAllRecipesButton(){
        recipesDropDownSteps.clickAllRecipesButton();
    }

    @When("the user clicks on Ukrainian cuisine")
    public void whenClicksUkrainianCuisine(){
        profiteroleCuisineSteps.chooseCuisine("Украинская");
    }

    @Then("the user should see the page with all Ukrainian dishes")
    public void thenShouldSeeUkrainianDishesPage(){
        profiteroleCuisineSteps.assertThatUkrainianDishesPageIsVisible();
    }
}
