package com.example.ilabinterndojithagamage.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CreateAccountPage {

    public SelenideElement ClicknavButton = $x("//*[@id=\"HeaderLinksDesktopMenu\"]");
    public SelenideElement ClickcreateAccountBtn = $x("//*[@id='HeaderLinksLogin2']");
    public SelenideElement ClickSignEmailBtn = $x("//*[@id=\"continue_with_email_signup\"]");
    public SelenideElement InputFname = $x("//*[@id=\"fname\"]");
    public SelenideElement InputLname = $x("//*[@id=\"lanme\"]"); // Double-check: looks like a typo — should be "lname"
    public SelenideElement InputEmail = $x("//*[@id=\"email\"]");
    public SelenideElement ClickCountryFlag = $x("//*[@id=\"sign-up-form\"]/div[4]/div/div/div/div[1]");
    public ElementsCollection CountryListItems = $$x("//ul[@class='country-list']/li");
    public SelenideElement InputMobileNum = $x("//*[@id=\"mobileNum\"]");
    public SelenideElement Inputpw = $x("//*[@id=\"pw\"]");

    // Clicks navigation menu
    public void clickNavButton() {
        ClicknavButton.click();
    }

    // Clicks "Create Account"
    public void clickCreateAccountButton() {
        ClickcreateAccountBtn.click();
    }

    // Clicks "Sign up with email"
    public void clickSignEmailBtn() {
        ClickSignEmailBtn.click();
    }

    // Inputs first name
    public void inputFname(String fName) {
        InputFname.setValue(fName);
    }

    // Inputs last name
    public void inputLname(String lName) {
        InputLname.setValue(lName);
    }

    // Inputs email
    public void inputEmail(String email) {
        InputEmail.setValue(email);
    }

    // Clicks on the country flag dropdown
    public void clickCountryFlagDropdown() {
        ClickCountryFlag.shouldBe(visible).click();
    }

    // Selects a specific country (e.g., "India") from the dropdown
    public void selectCountry(String countryName) {
        clickCountryFlagDropdown();
        CountryListItems.findBy(text(countryName)).click();
    }




//    public void fillSignUpForm(String fName, String lName, String email, String countryName) {
//        inputFname(fName);
//        inputLname(lName);
//        inputEmail(email);
//        selectCountry(countryName);
//    }
}
