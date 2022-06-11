package com.qa.tests.Pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationPage extends BaseTest {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Get Started\"]")
    public MobileElement getStartedButton;

    public RegistrationPage pressGetStartedButton() {
        click(getStartedButton);
        return this;
    }
}
