package swipping;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ScrollOrSwipe {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	DesiredCapabilities cp = new DesiredCapabilities();
		
		cp.setCapability("platformName", "Android");
		cp.setCapability("platformVersion", "13.0");
		cp.setCapability("deviceName", "OPPO A74 5G");
		cp.setCapability("udid", "6f2cc6c7");
		cp.setCapability("appPackage", "io.appium.android.apis");
		cp.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cp.setCapability("automationName", "UiAutomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),cp);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
	Dimension size = driver.manage().window().getSize();

	int startX = size.getWidth()/2;
	int startY = size.getHeight()/2;
	
	int endX = startX;
	int endY =  (int) (size.getHeight() * 0.25);
	
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
	
	Sequence sequence = new Sequence(finger1,1)
			.addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), startX, startY))
			.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
			.addAction(new Pause(finger1, Duration.ofMillis(200)))
			.addAction(finger1.createPointerMove(Duration.ofMillis(100),PointerInput.Origin.viewport(), endX, endY))
			.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	
	driver.perform(Collections.singletonList(sequence));
	
	}

}
