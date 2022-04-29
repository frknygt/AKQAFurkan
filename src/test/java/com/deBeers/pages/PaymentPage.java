package com.deBeers.pages;

import com.deBeers.utilities.BrowserUtils;
import com.deBeers.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    public PaymentPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="anchor-billing-payment")
    public WebElement selectPaymentMethod;

    @FindBy(xpath = "//iframe[@title=\"Iframe for secured card number\"]")
    public WebElement iframeForCarNumber;

    @FindBy(xpath = "//iframe[@title=\"Iframe for secured card expiry date\"]")
    public WebElement iframeForCardExpiryDate;

    @FindBy(xpath = "//iframe[@title=\"Iframe for secured card security code\"]")
    public WebElement iframeForCardSecurityCode;

    @FindBy(xpath ="//input[@id=\"encryptedCardNumber\"]")
    public WebElement cardNumberInput;

    @FindBy(xpath = "//*[@id=\"encryptedExpiryDate\"]")
    public WebElement cardExpiryDateInput;

    @FindBy(xpath = "//*[@id=\"encryptedSecurityCode\"]")
    public WebElement cardSecurityCodeInput;

    @FindBy(xpath = "//button[@class=\"dbj-btn dbj-btn-primary submit-payment m-auto text-uppercase\"]")
    public WebElement continueToReviewButton;

    public void enterPaymentDetails(){
        BrowserUtils.waitForVisibility(selectPaymentMethod,5);
        Driver.get().switchTo().frame(iframeForCarNumber);
        cardNumberInput.sendKeys("1234567890123456");
        Driver.get().switchTo().defaultContent();
        Driver.get().switchTo().frame(iframeForCardExpiryDate);
        cardExpiryDateInput.sendKeys("0119");
        Driver.get().switchTo().defaultContent();
        Driver.get().switchTo().frame(iframeForCardSecurityCode);
        cardSecurityCodeInput.sendKeys("111");
        Driver.get().switchTo().defaultContent();
        continueToReviewButton.click();
    }
}
