package com.itea.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//span[@class='ui-btn-book-categories__title']")
    WebElement homeComponent;

    public HomePage isHomeComponentPresent() {
        isElementDisplayed(homeComponent);
        return this;
    }
    @FindBy(xpath = "//button[contains(text(), 'Увійти'")
    WebElement loginLink;
    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }
}