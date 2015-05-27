package com.profiterole.steps.jbehave;


import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import com.profiterole.steps.actions.RecipesDropDownSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CreateRecipeButtonSteps {

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private RecipesDropDownSteps recipesDropDownSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Recipes Button")
    public void givenUserClicksRecipesButton(){
        profiteroleHomeSteps.clickRecipesButton();
    }

    @When("the user clicks on Create Recipe Button")
    public void whenUserClicksCreateRecipeButton(){
        recipesDropDownSteps.clickCreateRecipeButton();
    }

    @Then("the user should see the page where he can create his own recipe")
    public void thenShouldSeeCreateRecipePage(){
        recipesDropDownSteps.assertThatCreateRecipePageIsVisible();
    }

}
