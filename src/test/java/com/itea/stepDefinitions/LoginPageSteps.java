package com.itea.stepDefinitions;

import com.itea.pages.HomePage;
import com.itea.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.itea.pages.BasePage.driver;

public class LoginPageSteps {
    @And("User enters valid data")
    public void User_enters_valid_data() {
        new LoginPage(driver).enterData("nadia.suworowa@hotmail.com", "Cologne123!");
    }
    @And("User clicks on Login Button")
    public void User_clicks_on_Login_Button() {

        new LoginPage(driver).clickOnLoginButton();
    }

    @Then("User verifies SignOut button is displayed")
    public void User_verifies_SignOut_button_is_displayed() {
        new LoginPage(driver).isSignOutButtonDisplayed();
    }

    @And("User enters a valid email and wrong password")
    public void User_enters_a_valid_email_and_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongPassword(table);
    }
    @Then("User verifies Alert is appears")
    public void User_verifies_Alert_is_appears(){
        new LoginPage(driver).pause(2000);
        new LoginPage(driver).isAlertAppers();
    }
}