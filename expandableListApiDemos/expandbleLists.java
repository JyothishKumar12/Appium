package expandableListApiDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class expandbleLists {

	
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dC = new DesiredCapabilities();
		dC.setCapability("platformName", "Android");
		
		dC.setCapability("platformVersion", "13.0");
		
		dC.setCapability("udid", "6f2cc6c7");
		
		dC.setCapability("deviceName", "OPPO A74 5G");
		
		dC.setCapability("appPackage", "io.appium.android.apis");
		
		dC.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		dC.setCapability("automationName", "UiAutomator2");
		
		driver = new AndroidDriver(new URL("http://192.168.91.138:4723/"),dC);
		
		WebElement cAdaptor = driver.findElement(By.xpath(null));

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
	}

}
