package com.itea.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(className = "account-text")
    WebElement loginButton;

    public LoginPage clickOnLoginButton() {
        click(loginButton);
        return this;
    }

    @FindBy(css = "[placeholder='Введіть номер або email']")
    WebElement emailField;
    @FindBy(css = "[placeholder='Введіть пароль']")
    WebElement passwordField;

    public LoginPage enterData(String email, String password) {
        type(emailField, email);
        type(passwordField, password);
        return this;
    }
    @FindBy(xpath = "//button[contains(text(), 'Вийти')]")
    WebElement signOutButton;

    public LoginPage isSignOutButtonDisplayed() {
        isElementDisplayed(signOutButton);
        return this;
    }

    public LoginPage enterWrongPassword(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        enterData(email, password);
        return this;
    }

    public LoginPage isAlertAppers() {

        return this;
    }
}