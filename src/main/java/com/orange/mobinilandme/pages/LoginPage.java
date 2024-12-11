package com.orange.mobinilandme.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    // Locators
    private By menCategoryButton = By.id("com.lezasolutions.boutiqaat:id/_tv_category_first");
    private By womenCategoryButton = By.id("com.lezasolutions.boutiqaat:id/_tv_category_second");
    private By accountTab = By.xpath("//android.widget.TextView[@resource-id='com.lezasolutions.boutiqaat:id/tab_name' and @text='Account']");
    private By signUpButton = By.id("com.lezasolutions.boutiqaat:id/tvSignup");
    private By signInButton = By.id("com.lezasolutions.boutiqaat:id/tvLogin");
    private By emailInput = By.id("com.lezasolutions.boutiqaat:id/edtEmail");
    private By passwordInput = By.id("com.lezasolutions.boutiqaat:id/edtPassword");
    private By loginButton = By.xpath("//android.widget.Button[@resource-id=\"com.lezasolutions.boutiqaat:id/btnLogin\"]");
    private By Allow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    public LoginPage(AppiumDriver driver) {
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
    public void clickMenCategory() {
        waitForElementToBeClickable(menCategoryButton).click();
    }

    public void clickWomenCategory() {
        waitForElementToBeClickable(womenCategoryButton).click();
    }

    public void navigateToAccount() {
        waitForElementToBeClickable(accountTab).click();
    }

    public void clickSignUp() {
        waitForElementToBeClickable(signUpButton).click();
    }

    public void clickSignIn() {
        waitForElementToBeClickable(signInButton).click();
    }

    public void enterEmail(String email) {
        waitForElementToBeVisible(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        waitForElementToBeVisible(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        waitForElementToBeClickable(loginButton).click();
    }
    public void clickAllow() {
        waitForElementToBeClickable(Allow).click();
    }
}