package seleniumConcepts.ajaxCallsChildWindowsIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class actionDemo extends BaseClass {

	@BeforeMethod
	public void signin() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		System.out.println("user has logged in");
	}

	@Test
	public void amazonTest() {
		// Note: We use build().perform() because we can perform composite actions.

		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(ele).build().perform();
	}

	@AfterMethod
	public void signout() throws InterruptedException {

		System.out.println("user has logged out");
		Thread.sleep(2000);
	}

}
