package com.example.ilabinterndojithagamage.TestCases;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.ilabinterndojithagamage.Pages.CreateAccountPage;
import com.example.ilabinterndojithagamage.Pages.DashboardPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TC_CreateAccount extends BaseClass{

    CreateAccountPage createAccountPage;
    private WebDriver webDriver;




//    @Test
//    public void InValidPhnNumAccountCreation() {
//        createAccountPage = new CreateAccountPage();
//        createAccountPage.clickNavButton();
//        createAccountPage.clickCreateAccountButton();
//        createAccountPage.clickSignEmailBtn();
//
//        createAccountPage.inputFname("IlabTestUser 2");
//        createAccountPage.inputLname("Dojitha");
//        createAccountPage.inputEmail("dojithail5ab23@example.com");
//        createAccountPage.selectCountry("Sri Lanka");
//        createAccountPage.inputMobileNumber("7712345");// invalid phone number
//        createAccountPage.inputPassword("Dojitha@02202");
//        createAccountPage.clickSubmitButton();
//        //error msg
//        $x("//*[@id=\"error-msg\"]").shouldBe(visible);
//    }

    @Test
    public void ValidAccountCreation(){

        //Open the Hamburger menu
        CreateAccountPage createAccountPage=new CreateAccountPage(webDriver);

        createAccountPage.clickMenu();
        Assert.assertTrue(createAccountPage.menuVisible().isDisplayed(),
                "Menu option is not visible after clicking the hamburger menu.");

        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();
        createAccountPage.inputFname("IlabTestUser 5");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithailab57@example.com");
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234567");
        createAccountPage.inputPassword("Dojitha@2002"); // invalid password
        createAccountPage.clickSubmitButton();

        DashboardPage dashboardPage=new DashboardPage(webDriver);
       // Assert.assertEquals(dashboardPage.getDashboardTitle(),"Dashboard | CloudofGoods","Dashboard title mismatch!");
        // Wait for dashboard element to be visible

//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(dashboardPage.getDashBoardTextElement()));
//        String expectedUrl = "https://cog-stg.incubatelabs.com/user/dashboard";
//        String actualUrl = dashboardPage.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl, "User was not redirected to the dashboard!");

        String expectedUrl="https://cog-stg.incubatelabs.com/user/dashboard";
        Assert.assertTrue(webDriver.getCurrentUrl().startsWith(expectedUrl),"Does not redirect to the correct URL");

    }

//    @Test
//    public void InValidEmailAccountCreation() {
//        createAccountPage = new CreateAccountPage();
//        createAccountPage.clickNavButton();
//        createAccountPage.clickCreateAccountButton();
//        createAccountPage.clickSignEmailBtn();
//
//        createAccountPage.inputFname("IlabTestUser 2");
//        createAccountPage.inputLname("Dojitha");
//        createAccountPage.inputEmail("dojithailab123@example.com");
//        createAccountPage.selectCountry("Sri Lanka");
//        createAccountPage.inputMobileNumber("771234567");
//        createAccountPage.inputPassword("Dojitha@2002"); // invalid password
//        createAccountPage.clickSubmitButton();
//        //error msg
//        String actualErrorMsg = $x("//*[@id=\"email_help_block\"]")
//                .shouldBe(visible)
//                .getText();
//
//    }
//
//    @Test
//    public void ValidAccountCreation() {
//        createAccountPage.clickNavButton();
//        createAccountPage.clickCreateAccountButton();
//        createAccountPage.clickSignEmailBtn();
//
//        createAccountPage.inputFname("IlabTestUser 2");
//        createAccountPage.inputLname("Dojitha");
//        createAccountPage.inputEmail("dojithail2ab@example.com");
//        createAccountPage.selectCountry("Sri Lanka");
//        createAccountPage.inputMobileNumber("771234567");
//        createAccountPage.inputPassword("Dojitha@2002");
//        createAccountPage.clickSubmitButton();

//        Assert.assertEquals(webDriver.findElement(By.ById.cssSelector("[data-test ='title']")).getText(),"Products");

    }
    //Assert.assertEquals(webDriver.findElement(By.cssSelector("[data-test ='title']")).getText(),"Products");
    //// Check the order directed to order completed page
    //        String expectedUrl = "https://www.saucedemo.com/checkout-complete.html";
    //        Assert.assertEquals(webDriver.getCurrentUrl(), expectedUrl, "finished button did not proceed to order complete page");



