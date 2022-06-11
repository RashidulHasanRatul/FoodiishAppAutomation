package com.qa.tests;

import com.qa.BaseTest;
import com.qa.tests.Pages.RegistrationPage;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class RegistrationTest extends BaseTest {
    RegistrationPage registrationPage;
    JSONObject UserRegistration;
    InputStream userRegistrationData;
    // Before Class

    @BeforeClass
    public void beforeClass() throws Exception {

        try {
            System.out.println("Before Class");
            String dataFile = "data/userRegistration.json";
            userRegistrationData = getClass().getClassLoader().getResourceAsStream(dataFile);
            JSONTokener tokener = new JSONTokener(userRegistrationData);
            UserRegistration = new JSONObject(tokener);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (userRegistrationData != null) {
                userRegistrationData.close();
            }
        }

        //closeApp();
        //launchApp();

    }

    // After Class
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    // before Method
    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("This is Before Method");
    }

    // After Method
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    // Test 1
    @Test
    public void loginTest() {
        System.out.println("Registration Test");

    }

    @Test
    //This is for Validate Login with Valid UserName and Password
    public void GotoRegistrationPage() throws InterruptedException {
        Thread.sleep(8000);
        System.out.println("This is Go to Home Page ");
        registrationPage.pressGetStartedButton();
        Thread.sleep(8000);

    }
}
