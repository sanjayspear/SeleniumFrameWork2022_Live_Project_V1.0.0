package seleniumConcepts.miscellaneousTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class Calendar2 extends BaseClass {
	@Test
	public void clanedarDatePicker() throws InterruptedException {
		// start application
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(1000);

		// click on date picker so that we can get the calendar in view
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);

		// this will find all matching nodes in calendar
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		// now we will iterate all values and will capture the text. We will select when
		// date is 28
		for (WebElement ele : allDates) {

			String date = ele.getText();
			// once date is 28 then click and break
			if (date.equalsIgnoreCase("28")) {
				ele.click();
				break;
			}

		}
	}
}
