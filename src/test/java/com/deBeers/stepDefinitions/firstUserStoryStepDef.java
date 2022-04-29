package com.deBeers.stepDefinitions;

import com.deBeers.pages.HomePage;
import com.deBeers.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class firstUserStoryStepDef {

    HomePage homePage = new HomePage();
    @Given("A user from one of the {string}")
    public void aUserFromOneOfThe(String marketRegion)  {
        homePage.goToHomePage(marketRegion);

    }

    @When("The user visits the store front{string}")
    public void theUserVisitsTheStoreFront(String marketRegion) {
        String expectedTitle=homePage.expectedTitle(marketRegion);
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("They should be able to view the content related to the {string}")
    public void theyShouldBeAbleToViewTheContentRelatedToThe(String marketRegion) {
        String actualRegionName=homePage.regionName.getText();
        String expectedRegionNAme="De Beers " + marketRegion;
        Assert.assertEquals(expectedRegionNAme,actualRegionName);
    }
}
