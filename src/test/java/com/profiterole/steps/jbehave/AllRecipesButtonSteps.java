package com.profiterole.steps.jbehave;


import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import com.profiterole.steps.actions.RecipesDropDownSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AllRecipesButtonSteps {

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

    @When("the user clicks on All Recipes Button")
    public void whenUserClicksAllRecipesButton(){
        recipesDropDownSteps.clickAllRecipesButton();
    }

    @Then("the user should see all 12 cuisines: Украинская, Русская, Японская, Китайская, Тайская, Итальянская, Мексиканская, " +
            "Французская, Армянская, Индийская, Греческая, Грузинская")
    public void thenUserShouldSeeAllCuisines(){
        recipesDropDownSteps.assertThatCuisinesAreVisibleForUser();
    }
}
