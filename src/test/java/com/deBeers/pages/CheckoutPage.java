package com.deBeers.pages;

import com.deBeers.utilities.BrowserUtils;
import com.deBeers.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;

public class CheckoutPage {

    public CheckoutPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//div[@class=\"item-attributes col-6 py-3 pl-0 pr-4\"]/p)[1]")
    public WebElement addedRingInCheckoutPage;

    @FindBy(xpath = "//input[@id=\"login-form-email\"]")
    public WebElement guestEmailInput;

    @FindBy(id="submitGuestCustomer")
    public WebElement checkoutAsGuestButton;

    @FindBy(xpath = "(//select[@id=\"customerTitle\"])[1]")
    public WebElement customerTitleDropdown;

    @FindBy(xpath = "(//input[@id=\"shippingFirstName\"])[1]")
    public WebElement firstNameInput;

    @FindBy(xpath = "(//input[@id=\"shippingLastName\"])[1]" )
    public WebElement lastNameInput;

    @FindBy(xpath = "(//input[@id=\"accountMobilePhoneNumber\"])[1]")
    public WebElement mobileNumberInput;

    @FindBy(xpath = "(//input[@id=\"shippingAddressOne\"])[1]")
    public WebElement addressInput;

    @FindBy(xpath = "(//input[@id=\"shippingAddressCity\"])[1]")
    public WebElement cityInput;

    @FindBy(xpath = "(//input[@id=\"shippingZipCode\"])[1]")
    public WebElement postCodeInput;

    @FindBy(xpath = "//button[@class=\"dbj-btn dbj-btn-primary submit-shipping m-auto text-uppercase\"]")
    public WebElement continueToPaymentButton;

//    Select select = new Select(customerTitleDropdown);

    public void enterContactInfo(){
        guestEmailInput.sendKeys("mdabs9@redcross.org");
        checkoutAsGuestButton.click();
        BrowserUtils.waitForClickablility(firstNameInput,5);
        firstNameInput.sendKeys("Marge");
        lastNameInput.sendKeys("Dabs");
        mobileNumberInput.sendKeys("123456789");
        addressInput.sendKeys("1");
        cityInput.sendKeys("London");
        postCodeInput.sendKeys("EC1M 4BL");
        continueToPaymentButton.click();

    }


}
