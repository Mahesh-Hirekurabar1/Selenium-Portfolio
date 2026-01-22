package com.MakeMyTripAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoundTripBookingInSimple {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Actions act = new Actions(driver);

		driver.get("https://www.makemytrip.com/");
		// Used wait for Remove login pop-up
		try {
			WebElement closeModal = wait
					.until(ExpectedConditions.elementToBeClickable(By.className("commonModal__close")));
			closeModal.click();
		} catch (Exception e) {
			System.out.println("Login popup not displayed");
		}

		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();

		
		// Now we clicking FROM CITY input box and adding input Explicite Syncronzation
		driver.findElement(By.id("fromCity")).click();
		WebElement fromInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']")));
		fromInput.sendKeys("Pune");
		WebElement firstFromCity = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']//li[1]")));
		firstFromCity.click();

		
		
		// Similarly for TO CITY
		driver.findElement(By.id("toCity")).click();
		WebElement toInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='To']")));
		toInput.sendKeys("Mumbai");
		WebElement firstToCity = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']//li[1]")));
		firstToCity.click();

		
		
		// Booking Dates
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Thu Jan 22 2026']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Mon Jan 26 2026']"))).click();

		
		
		// Search button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Search']"))).click();

		driver.quit();
	}
}
