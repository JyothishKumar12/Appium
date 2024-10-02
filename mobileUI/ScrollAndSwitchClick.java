package mobileUI;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollAndSwitchClick {

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
		
//		Scroll
		
		String MobElementToScroll = "Switches";
		
		WebElement SwitchElement = driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
						".scrollIntoView(new UiSelector().text(\"" + MobElementToScroll + "\"))"));
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Switches\"]")).click();
		
	WebElement controlSwitch =	driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Monitored switch\"]"));
	
	
	if(controlSwitch.isEnabled()==true) {
		System.out.println("Switch is On");
	}else {
		System.out.println("Switch is OFF");
	}
	
	driver.close();
	}

}
