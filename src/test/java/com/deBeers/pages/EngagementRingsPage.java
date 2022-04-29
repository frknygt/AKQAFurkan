package com.deBeers.pages;

import com.deBeers.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.java2d.DisposerTarget;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class EngagementRingsPage extends HomePage{

    public EngagementRingsPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class=\"title text-center mt-2 dbj-font-header2-alt1\"]")
    public WebElement actualEngagementRingsTitle;

    @FindBy(xpath = "//*[@id=\"navbarFilters\"]/div[1]/ul/li")
    public List<WebElement> actualFilters;

    @FindBy(xpath = "(//div[@class=\"dbj-tinted-image tile-image h-100\"])[1]")
    public WebElement firstRing;

    public boolean getActualFilter(List<String> filters){
        List<String> actualFiltersList = new ArrayList<>();
        boolean status = false;
        for (WebElement filter :actualFilters) {
            actualFiltersList.add(filter.getText());
        }
        if(actualFiltersList.equals(filters)){
            status = true;
        }
        return status;
    }
}
