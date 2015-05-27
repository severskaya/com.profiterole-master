package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class ProfiterolesCuisinePage extends PageObject {

    protected List<WebElementFacade> getAllCuisines(){
        return findAll(By.xpath("//*[@id = 'cuisine']/div"));
    }

    public WebElement getCuisine(String cuisine){
        WebElement returnElement = null;
        for(WebElement element : getAllCuisines()){
            if (element.getText().equals(cuisine))
                this.waitABit(300);
                returnElement = element;
        }
        return returnElement;
    }

	//TODO: what if you'll have like 20 counties? or even 40? why can't we use name 'bla-bla кухня' as a parameter?
    public WebElementFacade getInformationFromMexicoDishesPage(){
        return find(By.xpath("//h4[contains(text(), 'Мексиканская кухня')]"));
    }

    public WebElementFacade getInformationFromUkrainianDishesPage(){
        return find(By.xpath("//h4[contains(text(), 'Украинская кухня')]"));
    }

    public WebElementFacade getInformationFromFrenchDishesPage(){
        return find(By.xpath("//h4[contains(text(), 'Французская кухня')]"));
    }

    public WebElementFacade getSnacksButton(){
        return find(By.xpath("//a[contains(text(), 'Закуски')]"));
    }

	//TODO: 'Молоко' is just content, so it should be a parameter
    public WebElementFacade getInformationFromUkrainiansnacksPage(){
        return find(By.xpath("//div[contains(text(), 'Молоко')]"));
    }
}
