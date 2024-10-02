package longPress;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;

import javax.swing.SizeSequence;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LngPRS {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {


		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName","Android");

		capabilities.setCapability("platformVersion","13.0");

		capabilities.setCapability("deviceName","OPPO A74 5G");

		capabilities.setCapability("udid","6f2cc6c7");

		capabilities.setCapability("appPackage","com.google.android.dialer");

		capabilities.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");

		capabilities.setCapability("automationName", "UiAutomator2");

		URL url = new URL(" http://0.0.0.0:4723");

		driver = new AndroidDriver(url,capabilities);

		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/dialpad_key_layout\"])[1]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/dialpad_key_layout\"])[9]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/dialpad_key_layout\"])[9]")).click();
		//		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"dial\"]")).click();
		WebElement x = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"backspace\"]"));

		longPress(x);
	}

	public static void longPress(WebElement x) {
		Point location = x.getLocation();
		PointerInput finger = new PointerInput(Kind.TOUCH,"finger");

		Sequence longpressing = new Sequence(finger, 1);
		longpressing.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),location.x,location.y));
		longpressing.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		longpressing.addAction(finger.createPointerMove(Duration.ofMillis(1000),PointerInput.Origin.viewport(),location.x,location.y));
		longpressing.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Collections.singletonList(longpressing));
	}
}
