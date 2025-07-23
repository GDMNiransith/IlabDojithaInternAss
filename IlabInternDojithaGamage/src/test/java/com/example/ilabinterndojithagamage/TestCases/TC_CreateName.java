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
        createAccountPage.inputLname("Automation");
        createAccountPage.inputEmail("testuser" + System.currentTimeMillis() + "@example.com");
        createAccountPage.selectCountry("Sri Lanka");
    }
}
