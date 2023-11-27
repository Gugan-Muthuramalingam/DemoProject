package org.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MethodOverrding {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\DemoProject\\Browsers\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

	}
}
