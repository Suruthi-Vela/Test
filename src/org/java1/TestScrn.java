package org.java1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScrn {
	public static void main(String[] args) throws IOException {
		WebDriver f= new FirefoxDriver();//upcasting webdirver parent  ---> firefox child
		f.get("https://www.facebook.com/");
		f.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)f;//downcasting takescreenshot child ------> webdriver parent
		File scsh = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Suruthi\\eclipse-workspace\\Selenium\\screenshots\\fb1.png");
		FileUtils.copyFile(scsh, des);
	}
}
