package Indbazaar.SeleniumJava.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import base.Driverinitilization;

public class HomePage extends Driverinitilization {

	public HomePage() throws IOException {
		super();

	}

	String chooseCategory = "fashion";

	@Test
	public void category() throws IOException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Example of waiting for overlay to disappear

		// List<WebElement> categoryN =
		// driver.findElements(By.xpath("(//nav[@id='comp-kn7dbgztnavContainer']/ul/li/div/div[2])/p"));

		List<WebElement> category = driver.findElements(By.xpath("(//nav[@id='comp-kn7dbgztnavContainer']/ul/li/div/div)"));

		List<WebElement> categoryN = driver
				.findElements(By.xpath("(//nav[@id='comp-kn7dbgztnavContainer']/ul/li/div/div[2]/p)"));

		for (WebElement webElement1 : category) {

			Actions ac = new Actions(driver);

			ac.moveToElement(webElement1).click();

		}

	}
}
