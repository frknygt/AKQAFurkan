package com.deBeers.pages;

import com.deBeers.utilities.BrowserUtils;
import com.deBeers.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstRingPage {

    public FirstRingPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class=\"product-info__title\"]")
    public WebElement ringName;

    @FindBy(xpath = "(//div[@class=\"slider-handle min-slider-handle slider-handle-borderPrimaryColor round\"])[1]")
    public WebElement slider;

    @FindBy(xpath = "//*[@id=\"collapseExample1\"]/div[2]/div[1]")
    public WebElement caratOfRing;

    @FindBy(xpath = "//div[@class=\"position-relative square selectable notSelected diamondClarity desktop VS1\"]")
    public WebElement clarityOfRing;

    @FindBy(xpath = "//*[@id=\"collapseExample3\"]/div/div/div[2]")
    public WebElement colourOfRing;

    @FindBy(xpath = "//*[@id=\"collapseExample0\"]/div/div/div[1]")
    public WebElement ringSize;

    @FindBy(xpath = "(//*[@class='btn-addToBag dbj-btn dbj-btn-primary dbj-font-button1 w-100'])[1]")
    public WebElement addToBAgButton;

    @FindBy(xpath = "(//*[@id=\"minicart\"]/div[1]/div[4]/div/div/div/div/div/div[1]/div/span)[1]")
    public WebElement ringInShoppingBag;

    @FindBy(xpath = "//*[@id=\"minicart\"]/div[3]/div[3]/div[1]")
    public WebElement secureCheckoutButton;

    public void getRingPersonalisedAndAddedToShoppingBag() {
        slider.click();
        caratOfRing.click();
        BrowserUtils.waitForClickablility(clarityOfRing,5);
        clarityOfRing.click();
        BrowserUtils.waitForClickablility(colourOfRing,5);
        colourOfRing.click();
        BrowserUtils.waitForClickablility(ringSize,5);
        ringSize.click();
        BrowserUtils.waitForClickablility(addToBAgButton,5);
        addToBAgButton.click();
    }
}
