package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\DemoProject\\Browsers\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
}