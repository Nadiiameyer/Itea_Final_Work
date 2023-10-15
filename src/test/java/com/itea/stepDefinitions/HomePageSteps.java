package com.itea.stepDefinitions;

import com.itea.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.itea.pages.BasePage.driver;
public class HomePageSteps {
    @Given("User launches Chrome Browser")
    public void User_launches_Chrome_Browser() {

        new HomePage(driver).launchBrowser();
    }
    @When("User open YAKABOO HomePage")
    public void User_open_YAKABOO_HomePage() {

        new HomePage(driver).openURL();
    }

    @Then("User verifies Home Component is displayed")
    public void User_verifies_Home_Component_is_displayed() {
        new HomePage(driver).isHomeComponentPresent();
    }

    @And("User quites browser")
    public void User_quites_browser() {
        new HomePage(driver).quit();
    }
}