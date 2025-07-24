package com.example.ilabinterndojithagamage.Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreateAccountPage {

    private WebDriver webDriver;

    @FindBy(id = "HeaderLinksDesktopMenu")
    private WebElement hamburgerMenu;

    @FindBy(id = "HeaderLinksLogin2")
    private WebElement createAccountBtn;

    @FindBy(id = "continue_with_email_signup")
    private WebElement signEmailBtn;

    @FindBy(id = "fname")
    private WebElement inputFname;

    @FindBy(id = "lanme")
    private WebElement inputLname;

    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[@id='sign-up-form']/div[4]/div/div/div/div[1]")
    private WebElement countryFlag;

    @FindBy(xpath = "//ul[@class='country-list']/li")
    private List<WebElement> countryListItems;

    @FindBy(id = "mobileNum")
    private WebElement inputMobileNum;

    @FindBy(id = "pw")
    private WebElement inputPw;

    @FindBy(id = "submit")
    private WebElement submitBtn;

    @FindBy(id="mobErr")
    private WebElement mobErr;

    @FindBy(id="email_help_block")
    private WebElement emailErr;

    @FindBy(xpath = "//*[@id=\"sign-up-form\"]/div[5]/p")
    private WebElement passErr;


    public CreateAccountPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
    }

    public void clickMenu() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(hamburgerMenu));
        hamburgerMenu.click();
    }

    public WebElement menuVisible(){
        return hamburgerMenu;
    }
//
//    public void clickNavButton() {
//        $(navButton).click();
//    }

    public void clickCreateAccountButton() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn));
        createAccountBtn.click();
    }

    public void clickSignEmailBtn() {
        $(signEmailBtn).click();
    }

    public void inputFname(String fName) {
        $(inputFname).setValue(fName);
    }

    public void inputLname(String lName) {
        $(inputLname).setValue(lName);
    }

    public void inputEmail(String email) {
        $(inputEmail).setValue(email);
    }

    public void clickCountryFlagDropdown() {
        $(countryFlag).shouldBe(Condition.visible).click();
    }

    public void selectCountry(String countryName) {
        clickCountryFlagDropdown();
        $$(countryListItems).findBy(Condition.text(countryName)).shouldBe(Condition.visible).click();
    }

    public void inputMobileNumber(String mobile) {
        $(inputMobileNum).setValue(mobile);
    }

    public void inputPassword(String password) {
        $(inputPw).setValue(password);
    }

    public void clickSubmitButton() {
        $(submitBtn).click();
    }

    public void confirmSuccessfulSignUp() {
        // Add confirmation logic later
    }

    public String getMobileErrorMessage() {
        return mobErr.getText();
    }
    public String getEmailErrorMessage() {
        return emailErr.getText();
    }
    public String getPassErrorMessage() {
        return passErr.getText();
    }
}
