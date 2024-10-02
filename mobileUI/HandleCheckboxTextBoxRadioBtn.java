package mobileUI;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HandleCheckboxTextBoxRadioBtn {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub


		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "13.0");
		
		capabilities.setCapability("deviceName", "OPPO A74 5G");
		capabilities.setCapability("udid", "6f2cc6c7");
		
		capabilities.setCapability("appPackage","io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		capabilities.setCapability("automationName", "UiAutomator2");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),capabilities);
		
//		click view
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
//		click controls
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		
//		click light theme
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		
//		TextBox
		
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Appium ");
		
		
//		click CheckBox
		
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
		
		
//	RadioButton
		
		driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
		
//		Star
		
		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
		
//		off button
		
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		
		//Action
		
		
		driver.close();
	}

}
