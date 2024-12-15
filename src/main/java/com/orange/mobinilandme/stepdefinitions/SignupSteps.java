package com.orange.mobinilandme.stepdefinitions;

import com.orange.mobinilandme.pages.SignupPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps extends BaseTest {
    private SignupPage signupPage ;

    @Before
    public void setUp() throws Exception {
        initializeDriver(); // Initialize the Appium driver
        signupPage = new SignupPage(driver); // Initialize the SignupPage with the driver
    }




    @Given("User clicks on Signup button")
    public void userClicksOnSignupButton() {
        signupPage.clickSignupButton();
    }

    @When("User enters full name {string}")
    public void userEntersFullName(String fullName) {
        System.out.println("Entering full name: " + fullName);
        signupPage.enterFullName(fullName); // Call the correct method in the SignupPage class
    }

    @And("User enters phone number {string}")
    public void userEntersPhoneNumber(String phoneNumber) {
        System.out.println("Entering phone number: " + phoneNumber);
        signupPage.enterPhone(phoneNumber); // Call the correct method in the SignupPage class
    }
    @And("User enters email {string}")
    public void userEntersEmail(String email) {
        signupPage.enterEmail(email);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        signupPage.enterPassword(password);
    }

    @Then("User clicks on Register button")
    public void userClicksOnRegisterButton() {
        signupPage.clickResigster();
    }

    @Then("User takes a screenshot with name {string}")
    public void userTakesScreenshot(String fileName) {
        ScreenshotUtil.captureScreenshot(driver, fileName); // Ensure driver is initialized and passed here
    }
}