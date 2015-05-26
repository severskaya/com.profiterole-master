package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class CreateMenuDropDownPage extends PageObject {
//
//    @FindBy(xpath = "//a[contains(text(), 'Меню на день')]")
//    private WebElementFacade MenuOnADayInDropDownList;
//
//    @FindBy(xpath = "//a[contains(text(), 'Меню на неделю')]")
//    private WebElementFacade MenuOnAWeekInDropDownList;
//
//    @FindBy(xpath = "count(//*[@class = 'btn btn-large no-outline'])")
//    private WebElementFacade CountOfVariablesFromCreateMenuOnDayPage;
//
//    @FindBy(xpath = "//*[@class = 'btn btn-large dayOfWeekButton'])")
//    private WebElementFacade CountOfDaysFromCreateMenuOnWeek;
//
//
//    public void clickMenuOnADayButton(){MenuOnADayInDropDownList.click();}


    public WebElementFacade getMenuOnADayInDropDownList(){
        return find(By.xpath("//a[contains(text(), 'Меню на день')]"));
    }

    public WebElementFacade getMenuOnAWeekInDropDownList(){
        return find(By.xpath("//a[contains(text(), 'Меню на неделю')]"));
    }

    public WebElementFacade getInformationFromCreateMenuOnDayPage(){
        return find(By.xpath("//*[@value = '#supper']"));
    }

    public WebElementFacade getCInformationFromCreateMenuOnWeek(){
        return find(By.xpath("//*[@value = 'Mo']"));
    }
}
