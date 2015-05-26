package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


public class MenuOnAWeekPage extends PageObject {

    public WebElementFacade getBreakfastButtonInMenuOnWeek(){
        return find(By.xpath("//*[@id='mealNameButtons']/button[1]"));
    }

    public WebElementFacade getDinnerButtonInMenuOnWeek(){
        return find(By.xpath("//*[@id='mealNameButtons']/button[2]"));
    }

    public WebElementFacade getSupperButtonInMenuOnWeek(){
        return find(By.xpath("//*[@id='mealNameButtons']/button[3]"));
    }

    public WebElementFacade getMondayButtonInMenuOnAWeek(){
        return find(By.xpath("//*[@value = 'Mo']"));
    }

    public WebElementFacade getTuesdayButtonInMenuOnAWeek(){
        return find(By.xpath("//*[@value = 'Tu']"));
    }

    public WebElementFacade getWednesdayButtonInMenuOnAWeek(){
        return find(By.xpath("//*[@value = 'We']"));
    }

    public WebElementFacade getThursdayButtonInMenuOnAWeek(){
        return find(By.xpath("//*[@value = 'Th']"));
    }

    public WebElementFacade getFridayButtonInMenuOnAWeek(){
        return find(By.xpath("//*[@value = 'Fr']"));
    }

    public WebElementFacade getSaturdayButtonInMenuOnAWeek(){
        return find(By.xpath("//*[@value = 'Sa']"));
    }

    public WebElementFacade getSundayButtonInMenuOnAWeek(){
        return find(By.xpath("//*[@value = 'Su']"));
    }

    public WebElementFacade getInformationFromMenuOnWeek(){
        return find(By.xpath("//*[@value = 'Tu']"));
    }

}
