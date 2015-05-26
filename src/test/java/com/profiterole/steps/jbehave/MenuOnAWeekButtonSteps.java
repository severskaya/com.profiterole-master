package com.profiterole.steps.jbehave;

import com.profiterole.steps.actions.CreateMenuDropDownSteps;
import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MenuOnAWeekButtonSteps {

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private CreateMenuDropDownSteps createMenuDropDownSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Create Menu Button")
    public void givenClicksCreateMenuButton(){
        profiteroleHomeSteps.clickCreateMenuButton();
    }

    @When("the user clicks on Menu on a Week Button")
    public void whenClicksMenuOnAWeekButton(){
        createMenuDropDownSteps.clickMenuOnaWeekButton();
    }

    @Then("the user should see the page with seven choices 'Mo', 'Tu','We', 'Th', 'Fr', 'Sa', 'Su'")
    public void thenShouldSeePageWithSevenDays(){
        createMenuDropDownSteps.assertThatPageWithSevenDaysIsVisible();
    }

}
