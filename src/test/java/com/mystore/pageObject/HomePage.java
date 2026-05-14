package com.mystore.pageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	public static void handleAlert(WebDriver driver) {

        try {

            driver.switchTo().alert().accept();

            System.out.println("Popup handled");
            

        } catch (Exception e) {

            System.out.println("No popup present");
        }
    }
	
	By addToCart=By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
	
	By cartLink=By.className("shopping_cart_link");
	
	public HomePage(WebDriver driver) {

	        this.driver = driver;
	    }

	    public void clickAddToCart() {

	        driver.findElement(addToCart).click();
	    }

	    public void clickCart() {

	        driver.findElement(cartLink).click();
	    }
	    
	    
	 

}
