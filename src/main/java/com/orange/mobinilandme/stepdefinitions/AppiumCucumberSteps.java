package com.orange.mobinilandme.stepdefinitions;

import com.orange.mobinilandme.pages.LoginPage;
import com.orange.mobinilandme.pages.LoginPage;
import com.orange.mobinilandme.pages.SignupPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumCucumberSteps extends BaseTest {

    private LoginPage LoginPage ;

    @Before
    public void setUp() throws Exception {
        initializeDriver(); // Initialize the Appium driver
        LoginPage = new LoginPage(driver); // Initialize the SignupPage with the driver
    }


    @When("User chooses Gender")
    public void userChoosesArabicLanguage() throws InterruptedException {

        LoginPage.clickMenCategory();

    }

    @And("User open account tab")
    public void userAcceptsTheTermsAndConditions() throws InterruptedException {

       LoginPage.clickAllow();

        LoginPage.navigateToAccount();
    }

    @And("User presses sign in btn")
    public void userPressesNextButton() throws InterruptedException {

        LoginPage.clickSignIn();
    }

    @And("User write email {string}")
    public void userEntersEmailAndPassword(String email) throws InterruptedException {


        LoginPage.enterEmail(email);


    }
    @Then("User write {string}")
    public void userEntersPassword(String password) throws InterruptedException {



        LoginPage.enterPassword(password);
        try {

            LoginPage.clickLogin();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}