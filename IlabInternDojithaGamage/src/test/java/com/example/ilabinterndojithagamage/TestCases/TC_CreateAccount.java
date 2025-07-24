package com.example.ilabinterndojithagamage.TestCases;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.ilabinterndojithagamage.Pages.CreateAccountPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TC_CreateAccount {

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
    public void InValidPasswordAccountCreation() {
        createAccountPage.clickNavButton();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();

        createAccountPage.inputFname("IlabTestUser 2");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithail5ab@example.com");
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234567");
        createAccountPage.inputPassword("wrong password"); // invalid password
        createAccountPage.clickSubmitButton();
        //error msg
        String actualErrorMsg = $x("//*[@id=\"sign-up-form\"]/div[5]/p")
                .shouldBe(visible)
                .getText();

    }
    @Test
    public void InValidEmailAccountCreation() {
        createAccountPage.clickNavButton();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();

        createAccountPage.inputFname("IlabTestUser 2");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithailab@example.com");
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234567");
        createAccountPage.inputPassword("Dojitha@2002"); // invalid password
        createAccountPage.clickSubmitButton();
        //error msg
        String actualErrorMsg = $x("//*[@id=\"email_help_block\"]")
                .shouldBe(visible)
                .getText();

    }

    @Test
    public void ValidAccountCreation() {
        createAccountPage.clickNavButton();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();

        createAccountPage.inputFname("IlabTestUser 2");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithail2ab@example.com");
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234567");
        createAccountPage.inputPassword("Dojitha@2002");
        createAccountPage.clickSubmitButton();

        // Confirm successful submission
        $x("//*[@id=\"innerpages_body\"]/div[1]/div[1]/div/p[1]").shouldBe(visible);

    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}