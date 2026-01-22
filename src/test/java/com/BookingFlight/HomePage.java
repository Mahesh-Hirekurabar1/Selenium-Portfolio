package com.BookingFlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
	 this.driver =driver;
	}

//	By roundButton=By.xpath("//li[@data-cy='roundTrip']");
//	By fromCity=By.xpath("//input[@data-cy=\"fromCity\"]");
//	By fromDropDown=By.xpath("//*[@id=\"react-autowhatever-1\"]");

	// Locators
	By adClick=By.xpath("//*[@id=\"header-container\"]/div[2]/div[2]/div/section/span");
	By roundTripBtn = By.xpath("//li[@data-cy='roundTrip']");
	By fromCity = By.xpath("//input[@data-cy='fromCity']");
	By fromInput = By.xpath("//input[@placeholder='From']");
	By toCity = By.xpath("//input[@data-cy='toCity']");
	By toInput = By.xpath("//input[@placeholder='To']");
	By searchBtn = By.xpath("//a[text()='Search']");

	// Actions
//	public void cancelAd() throws InterruptedException {
//		driver.findElement(adClick).click();
//		Thread.sleep(2000);
//	}
//	
	public void closeLoginPopup() throws InterruptedException {
	    driver.findElement(By.xpath("//body")).click();
	    Thread.sleep(2000);
	}

	public void selectRoundTrip() {
		driver.findElement(roundTripBtn).click();
	}

	public void enterFromCity(String city) {
		driver.findElement(fromCity).click();
		driver.findElement(fromInput).sendKeys(city);
		driver.findElement(By.xpath("//p[contains(text(),'" + city + "')]")).click();
	}

	public void enterToCity(String city) {
		driver.findElement(toCity).click();
		driver.findElement(toInput).sendKeys(city);
		driver.findElement(By.xpath("//p[contains(text(),'" + city + "')]")).click();
	}

	public void clickSearch() {
		driver.findElement(searchBtn).click();
	}
}
