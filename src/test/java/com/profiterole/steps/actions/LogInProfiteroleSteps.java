package com.profiterole.steps.actions;

import com.profiterole.pages.LogInProfiterolePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;


public class LogInProfiteroleSteps extends ScenarioSteps {

    private final static String INFORMATION_FROM_AFTER_LOGIN_PAGE = "Добро пожаловать на сайт";
    private LogInProfiterolePage logInProfiterolePage;

    @Step
    public void enterLoginIntoLoginField(String login){
        logInProfiterolePage.getEnterLoginField().sendKeys(login);
    }

    @Step
    public void enterPasswordIntoPasswordField(String password){
        logInProfiterolePage.getEnterPasswordField().sendKeys(password);
    }

    @Step
    public void clickEnterButtonInEntryWindow(){
        logInProfiterolePage.getEnterButtonInEntryMenu().click();
    }

    @Step
    public void assertThatUserWasLogIn(){
        assertEquals("Регистрация пользователя прошла неуспешно", INFORMATION_FROM_AFTER_LOGIN_PAGE,
                logInProfiterolePage.getInformationFromAfterLoginPage().getText());
    }
}
