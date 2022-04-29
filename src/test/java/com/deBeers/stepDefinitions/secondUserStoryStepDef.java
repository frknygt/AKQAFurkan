package com.deBeers.stepDefinitions;

import com.deBeers.pages.CheckoutPage;
import com.deBeers.pages.EngagementRingsPage;
import com.deBeers.pages.FirstRingPage;
import com.deBeers.pages.PaymentPage;
import com.deBeers.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Instant;
import java.util.List;
import com.deBeers.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class secondUserStoryStepDef {

    EngagementRingsPage engagementRingsPage = new EngagementRingsPage();
    FirstRingPage firstRingPage = new FirstRingPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    PaymentPage paymentPage = new PaymentPage();
    @When("I view all available {string}")
    public void iViewAllAvailable(String expectedEngagementRingText) {
        engagementRingsPage.goToEngagementRingsPAge();
        System.out.println(engagementRingsPage.actualEngagementRingsTitle.getText());
        Assert.assertEquals(expectedEngagementRingText,engagementRingsPage.actualEngagementRingsTitle.getText());
    }

    @Then("I should be able to filter the product by all available following filters")
    public void iShouldBeAbleToFilterTheProductByAllAvailableFollowingFilters(List<String> expectedFilterList) {
        System.out.println("Filter first is "+ engagementRingsPage.actualFilters.get(1).getText());
        System.out.println(engagementRingsPage.actualFilters.size());
        Assert.assertTrue(engagementRingsPage.getActualFilter(expectedFilterList));
    }

    @When("I view the details of a ring")
    public void iViewTheDetailsOfARing() {
        engagementRingsPage.goToEngagementRingsPAge();
        engagementRingsPage.firstRing.click();
    }

    @Then("I should be able to personalise the ring on and add it to the shopping bag")
    public void iShouldBeAbleToPersonaliseTheRingOnAndAddItToTheShoppingBag() {
        firstRingPage.getRingPersonalisedAndAddedToShoppingBag();
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"minicart\"]/div[3]/div[3]/div[1]")));
        String expectedRing=firstRingPage.ringName.getText();
        String actualRing= firstRingPage.ringInShoppingBag.getText();
        Assert.assertEquals(expectedRing,actualRing);
    }

    @When("I add an engagement ring to the shopping bag")
    public void iAddAnEngagementRingToTheShoppingBag() {
        engagementRingsPage.goToEngagementRingsPAge();
        engagementRingsPage.firstRing.click();
        firstRingPage.getRingPersonalisedAndAddedToShoppingBag();
    }

    @Then("I should be able to place an order for the ring")
    public void iShouldBeAbleToPlaceAnOrderForTheRing() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id=\"minicart\"]/div[3]/div[3]/div[1]/div/div/a/span)[1]")));
        ((JavascriptExecutor)Driver.get()).executeScript("arguments[0].click();", element);
        checkoutPage.enterContactInfo();
        paymentPage.enterPaymentDetails();
        paymentPage.continueToReviewButton.click();
    }
}
