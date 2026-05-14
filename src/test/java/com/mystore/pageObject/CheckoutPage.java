package com.mystore.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckoutPage {
	
	WebDriver driver;
	
	By checkOut=By.xpath("//button[@id=\"checkout\"]");
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void checkOutItem() {
		driver.findElement(checkOut).click();
		
	}
	  public boolean verifyItemPresent() {

	        return driver.findElement(checkOut).isDisplayed();
	    }

}
