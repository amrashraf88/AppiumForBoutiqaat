package com.orange.mobinilandme.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    // Locators
    private By SignupButton = By.id("com.lezasolutions.boutiqaat:id/tvSignup");
    private By FullName = By.id("com.lezasolutions.boutiqaat:id/tie_full_name");
    private By Phone = By.id("com.lezasolutions.boutiqaat:id/tie_phone");
    private By Email = By.id("com.lezasolutions.boutiqaat:id/tie_email");

    private By passwordInputSignup = By.id("com.lezasolutions.boutiqaat:id/tie_password");
    private By registerButton = By.id("com.lezasolutions.boutiqaat:id/button_register");

    public SignupPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
    }
    private WebElement waitForElementToBeVisible(By locator) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private WebElement waitForElementToBeClickable(By locator) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(locator));
    }
    // Methods
    public void clickSignupButton() {
        waitForElementToBeClickable(SignupButton).click();
    }

    public void enterFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Full name cannot be null or empty.");
        }
        waitForElementToBeVisible(FullName).sendKeys(fullName);
    }

    public void enterPhone(String phone) {
        if (phone == null || phone.isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty.");
        }
        waitForElementToBeVisible(Phone).sendKeys(phone);
    }

    public void enterEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty.");
        }
        waitForElementToBeVisible(Email).sendKeys(email);
    }

    public void enterPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        waitForElementToBeVisible(passwordInputSignup).sendKeys(password);
    }

    public void clickResigster() {
        waitForElementToBeClickable(registerButton).click();
    }





}