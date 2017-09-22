package com.web.app;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {

	public static void main(String[] args) {

		LaunchSite("https://www.flipkart.com");
	}

	public static void LaunchSite(String URL) {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String a ="This is a string";
		driver.get(URL);
		ArrayList<String> a = new ArrayList<String>();
		System.out.println("Title of the page is ="+driver.getTitle());
		System.out.println("Page Source of the page is ="+driver.getPageSource());
	}
}
