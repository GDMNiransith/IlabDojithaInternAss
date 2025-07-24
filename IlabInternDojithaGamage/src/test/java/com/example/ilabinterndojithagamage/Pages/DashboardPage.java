package com.example.ilabinterndojithagamage.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    @FindBy(id = "HeaderLinksDesktopMenu")
    private WebElement dashBoardText;

    public DashboardPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
    }
//    public String getDashboardTitle() {
//        return driver.getTitle();
//    }
public String getCurrentUrl() {
    return driver.getCurrentUrl();
}
}

