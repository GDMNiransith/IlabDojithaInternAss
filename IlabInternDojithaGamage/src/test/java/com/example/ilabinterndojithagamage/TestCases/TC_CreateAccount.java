package com.example.ilabinterndojithagamage.TestCases;


import com.example.ilabinterndojithagamage.Pages.CreateAccountPage;

import org.testng.Assert;
import org.testng.annotations.*;


public class TC_CreateAccount extends BaseClass{

    CreateAccountPage createAccountPage;


    @Test
    public void ValidAccountCreation(){

        //Open the Hamburger menu
        CreateAccountPage createAccountPage=new CreateAccountPage(webDriver);

        createAccountPage.clickMenu();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();
        createAccountPage.inputFname("IlabTestUser 6");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithailab45@example.com");
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234567");
        createAccountPage.inputPassword("Dojitha@2002"); // invalid password
        createAccountPage.clickSubmitButton();

//        DashboardPage dashboardPage=new DashboardPage(webDriver);
        String expectedUrl="https://cog-stg.incubatelabs.com/user/dashboard";
        Assert.assertTrue(webDriver.getCurrentUrl().startsWith(expectedUrl),"Does not redirect to the correct URL");

    }
    @Test
    public void InValidPhoneNumberAccountCreation(){

        //Open the Hamburger menu
        CreateAccountPage createAccountPage=new CreateAccountPage(webDriver);

        createAccountPage.clickMenu();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();
        createAccountPage.inputFname("IlabTestUser 6");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithailab45@example.com");
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234");
        createAccountPage.inputPassword("Dojitha@2002"); // invalid password
        createAccountPage.clickSubmitButton();

        Assert.assertEquals(createAccountPage.getMobileErrorMessage(),"Invalid mobile number.","Mobile number is incorrect.");

//
    }

    @Test
    public void InValidEmailAccountCreation(){

        //Open the Hamburger menu
        CreateAccountPage createAccountPage=new CreateAccountPage(webDriver);

        createAccountPage.clickMenu();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();
        createAccountPage.inputFname("IlabTestUser 6");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithailab45@example.com");// invalid Email
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234567");
        createAccountPage.inputPassword("Dojitha@2002");
        createAccountPage.clickSubmitButton();

        Assert.assertEquals(createAccountPage.getEmailErrorMessage(),"The email has already been taken.","Email has already been taken.");

//
    }

    @Test
    public void InValidPasswordAccountCreation(){

        //Open the Hamburger menu
        CreateAccountPage createAccountPage=new CreateAccountPage(webDriver);

        createAccountPage.clickMenu();
        createAccountPage.clickCreateAccountButton();
        createAccountPage.clickSignEmailBtn();
        createAccountPage.inputFname("IlabTestUser 6");
        createAccountPage.inputLname("Dojitha");
        createAccountPage.inputEmail("dojithailawwe@example.com");// invalid Email
        createAccountPage.selectCountry("Sri Lanka");
        createAccountPage.inputMobileNumber("771234567");
        createAccountPage.inputPassword("assdad");
        createAccountPage.clickSubmitButton();

        Assert.assertEquals(createAccountPage.getPassErrorMessage(),"The password must be at least 12 characters.","Password must be at least 12 characters.");

//
    }



    }


