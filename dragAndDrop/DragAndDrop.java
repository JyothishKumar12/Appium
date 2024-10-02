package dragAndDrop;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;

public class DragAndDrop {

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
		
//		drag and drop
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		
//		source
		
	WebElement source =	driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	
//	destination
	
	WebElement destination = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
	

	  TouchAction tA = new TouchAction(driver);

	tA.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	
	}

	

}
