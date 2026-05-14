package com.mystore.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressInfo {
	
		WebDriver driver;
		By uFName=By.id("first-name");
		By uLName=By.xpath("//input[@id=\"last-name\"]");
		By pinCode=By.xpath("//input[@id=\"postal-code\"]");
		
		By continueBtn=By.xpath("//input[@name=\"continue\"]");
		public AddressInfo(WebDriver driver) {
			this.driver=driver;
		}
		public void fName(String FName) {
			driver.findElement(uFName).sendKeys(FName);
		}
		public void lName(String LName) {
			driver.findElement(uLName).sendKeys(LName);
		}
		public void pin(String PinC) {
			driver.findElement(pinCode).sendKeys(PinC);
		}
		
		 public void clickContinue() {

		        driver.findElement(continueBtn).click();
		    }
	


}
