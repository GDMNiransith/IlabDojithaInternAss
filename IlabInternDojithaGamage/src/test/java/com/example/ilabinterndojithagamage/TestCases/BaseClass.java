package com.example.ilabinterndojithagamage.TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    WebDriver webDriver;

    @BeforeMethod
    public void beforeMethod(){
        webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://cog-stg.incubatelabs.com");
    }


    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();
    }


}
