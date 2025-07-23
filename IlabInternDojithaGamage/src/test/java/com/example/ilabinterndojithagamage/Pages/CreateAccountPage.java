package com.example.ilabinterndojithagamage.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CreateAccountPage {

    private SelenideElement navButton = $x("//*[@id='HeaderLinksDesktopMenu']");
    private SelenideElement createAccountBtn = $x("//*[@id='HeaderLinksLogin2']");
    private SelenideElement signEmailBtn = $x("//*[@id='continue_with_email_signup']");
    private SelenideElement inputFname = $x("//*[@id='fname']");
    private SelenideElement inputLname = $x("//*[@id='lanme']"); // Fixed typo here
    private SelenideElement inputEmail = $x("//*[@id='email']");
    private SelenideElement countryFlag = $x("//*[@id='sign-up-form']/div[4]/div/div/div/div[1]");
    private ElementsCollection countryListItems = $$x("//ul[@class='country-list']/li");
    private SelenideElement inputMobileNum = $x("//*[@id='mobileNum']");
    private SelenideElement inputPw = $x("//*[@id='pw']");
    private SelenideElement submitBtn = $x("//*[@id='submit']");

    public void clickNavButton() {
        navButton.click();
    }

    public void clickCreateAccountButton() {
        createAccountBtn.click();
    }

    public void clickSignEmailBtn() {
        signEmailBtn.click();
    }

    public void inputFname(String fName) {
        inputFname.setValue(fName);
    }

    public void inputLname(String lName) {
        inputLname.setValue(lName);
    }

    public void inputEmail(String email) {
        inputEmail.setValue(email);
    }

    public void clickCountryFlagDropdown() {
        countryFlag.shouldBe(visible).click();
    }

    public void selectCountry(String countryName) {
        clickCountryFlagDropdown();
        countryListItems.findBy(text(countryName)).shouldBe(visible).click();
    }

    public void inputMobileNumber(String mobile) {
        inputMobileNum.setValue(mobile);
    }

    public void inputPassword(String password) {
        inputPw.setValue(password);
    }

    public void clickSubmitButton() {
        submitBtn.click();
    }


}
