package com.BookingFlightTestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BookingFlight.HomePage;

public class TestCases {

    WebDriver driver;
    HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        homePage = new HomePage(driver);
    }

    @Test
    public void bookRoundTripFlight() throws InterruptedException {

        Thread.sleep(3000); // handle initial popup
        homePage.selectRoundTrip();
        homePage.selectRoundTrip();
        homePage.enterFromCity("Delhi");
        homePage.enterToCity("Mumbai");
        // Date selection can be added later
        homePage.clickSearch();
    }

    @AfterClass
    
    public void tearDown() {
        driver.quit();
    }
}
