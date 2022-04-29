package com.deBeers.pages;

import com.deBeers.utilities.BrowserUtils;
import com.deBeers.utilities.ConfigurationReader;
import com.deBeers.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//p[@class='m-0 pointer align-items-center']")
    public WebElement regionName;

    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//*[@id='customCountry-continueOn-button']/span")
    public WebElement continueToWebsiteButton;

    @FindBy(xpath = "//a[@id='G10002']")
    public WebElement weddingAndEngagement;

    @FindBy(xpath = "//div[@id=\"G10002\"]/div/div/div[1]/a[1]")
    public WebElement engagementRingsLink;

    public void goToHomePage(String region) {

        switch(region){
            case "United Kingdom":
                Driver.get().get(ConfigurationReader.get("urlUk"));
                BrowserUtils.waitForClickablility(acceptCookiesButton,5);
                acceptCookiesButton.click();
                BrowserUtils.waitForVisibility(regionName,5);
                break;
            case "France":
                Driver.get().get(ConfigurationReader.get("urlFr"));
                BrowserUtils.waitForClickablility(acceptCookiesButton,5);
                acceptCookiesButton.click();
                continueToWebsiteButton.click();
                break;
            case "Italy":
                Driver.get().get(ConfigurationReader.get("urlIt"));
                BrowserUtils.waitForClickablility(acceptCookiesButton,5);
                acceptCookiesButton.click();
                continueToWebsiteButton.click();
        }
    }

    public void getUrl(String region){
        switch(region){
            case "United Kingdom":
                Assert.assertEquals(Driver.get().getCurrentUrl(), "https://www.debeers.co.uk/en-gb/home") ;
                break;
            case "France":
                Assert.assertEquals(Driver.get().getCurrentUrl(), "https://www.debeers.fr/en-fr/home");
                break;
            case "Italy":
                Assert.assertEquals(Driver.get().getCurrentUrl(), "https://www.debeers.com/en-it/home");
        }
    }

    public void goToEngagementRingsPAge(){
        weddingAndEngagement.click();
        BrowserUtils.waitForClickablility(engagementRingsLink,5);
        engagementRingsLink.click();
    }

    public String expectedTitle(String region){
        String title = null;
        switch(region){
            case "United Kingdom":
                title="Diamond Jewellery | Luxury Jewellery | De Beers UK";
                break;
            case "France":
                title="De Beers Jewellers | Iconic Diamond Jewellery | De Beers";
                break;
            case "Italy":
                title="De Beers Jewellers | Iconic Natural Diamonds | De Beers IT";
        }
        return title;
    }

}
