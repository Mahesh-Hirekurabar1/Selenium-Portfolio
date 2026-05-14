package com.mystore.testcases;

import com.mystore.pageObject.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageObject.AddressInfo;
import com.mystore.pageObject.HomePage;
import com.mystore.pageObject.LoginPage;

public class SuceDemoTest extends BaseClass {

    @Test
    public void verifyCompleteOrderFlow() {

        // Login Page

        LoginPage lp = new LoginPage(driver);

        lp.username("standard_user");

        lp.password("secret_sauce");

        lp.clickLogin();

        // Handle Popup

        HomePage.handleAlert(driver);

        // Home Page

        HomePage hp = new HomePage(driver);

        hp.clickAddToCart();

        hp.clickCart();

        // Verify Product Added

        String actualProduct = driver.getPageSource();

        Assert.assertTrue(
            actualProduct.contains("Sauce Labs Backpack"));

        // Checkout

        driver.findElement(
        org.openqa.selenium.By.id("checkout")).click();

        // Address Information

        AddressInfo ad = new AddressInfo(driver);

        ad.fName("Mahesh");

        ad.lName("Hirekurabar");

        ad.pin("586127");

        ad.clickContinue();

        System.out.println("Order Flow Completed Successfully");
    }
}
