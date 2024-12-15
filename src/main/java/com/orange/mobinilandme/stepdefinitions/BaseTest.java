
package com.orange.mobinilandme.stepdefinitions;

        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.remote.MobileCapabilityType;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import org.openqa.selenium.remote.DesiredCapabilities;

        import java.io.File;
        import java.io.IOException;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.nio.file.Files;

public class BaseTest {
    protected static AppiumDriver driver;

    public static void initializeDriver() throws MalformedURLException {
        if (driver == null) {
            System.out.println("Initializing Appium Driver...");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Test");
            caps.setCapability(MobileCapabilityType.APP, "/Users/amrashraf/Documents/GitHub/AppiumForBoutiqaat/src/test/Test.apk");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            System.out.println("Driver initialized successfully.");
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            System.out.println("Quitting Appium Driver...");
            driver.quit();
            driver = null;
        }
    }

    public static class ScreenshotUtil {

        public static void captureScreenshot(AppiumDriver driver, String fileName) {
            try {
                // Take screenshot and store it as a file
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                // Define destination file path
                File destination = new File(System.getProperty("user.dir") + "/screenshots/" + fileName + ".png");
                // Ensure the directory exists
                Files.createDirectories(destination.getParentFile().toPath());
                // Copy the screenshot to the destination
                Files.copy(screenshot.toPath(), destination.toPath());
                System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
    }
}