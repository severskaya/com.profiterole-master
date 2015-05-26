package com.profiterole.steps.jbehave;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuiteRunner extends SerenityStories {

    public AcceptanceTestSuiteRunner() {
        findStoriesCalled("**/stories/ChooseMexicoCuisineStory.story");
    }
}
