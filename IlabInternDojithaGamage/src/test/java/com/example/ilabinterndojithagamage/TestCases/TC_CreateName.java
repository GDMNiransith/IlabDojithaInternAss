package com.example.ilabinterndojithagamage.TestCases;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.ilabinterndojithagamage.Pages.CreateAccountPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class TC_CreateName {

    CreateAccountPage createAccountPage;

    @BeforeClass
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp() {
        open("https://cog-stg.incubatelabs.com");
        createAccountPage = new CreateAccountPage();
    }

    @Test
    public void testSignUpFormWithCountry() {
        createAccountPage.clickNavButton();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();

        createAccountPage.inputFname("IlabTestUser");
        createAccountPage.inputLname("Dojitha");

        // Generate unique email
        String timestamp = String.valueOf(System.currentTimeMillis());
        createAccountPage.inputEmail("testuser" + timestamp + "@example.com");

        // Select Country
        createAccountPage.selectCountry("Sri Lanka");

        // Input Mobile Number
        createAccountPage.inputMobileNumber("771234567");

        // Input Password
        createAccountPage.inputPassword("Test@1234");

        // Submit the form
        createAccountPage.clickSubmitButton();

        // Optionally, verify that the user is redirected or a success message appears
        // Example: $(".success-message").shouldHave(text("Account created successfully"));
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
