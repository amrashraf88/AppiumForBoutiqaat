package com.orange.mobinilandme.stepdefinitions;

import com.orange.mobinilandme.pages.LoginPage;
import com.orange.mobinilandme.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumCucumberSteps {
    private AppiumDriver driver;
    private LoginPage LoginPage;

    @Given("User opens")
    public void userOpensTheApplication() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Test");
        caps.setCapability(MobileCapabilityType.APP, "C:/Users/Amr Ashraf/Downloads/test2.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        LoginPage = new LoginPage(driver);
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