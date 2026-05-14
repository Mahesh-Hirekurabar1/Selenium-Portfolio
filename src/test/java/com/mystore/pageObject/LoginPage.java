package com.mystore.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    By txtUser = By.id("user-name");
    By txtPass = By.id("password");
    By button = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void username(String uname) {
        driver.findElement(txtUser).sendKeys(uname);
    }

    public void password(String pass) {
        driver.findElement(txtPass).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(button).click();
    }
}