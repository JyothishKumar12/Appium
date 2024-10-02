package DesktopInstall;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Installation {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dC = new DesiredCapabilities();
		dC.setCapability("platformName","Android");
		dC.setCapability("platformVersion","13.0");
		dC.setCapability("deviceName", "OPPO A74 5G");
		dC.setCapability("udid","6f2cc6c7");
//		dC.setCapability("appPackage", "");
//		dC.setCapability("appActivity", "");
		dC.setCapability("automationName", "UiAutomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),dC);
		
		String packageName ="io.selendroid.testapp";
		driver.installApp("C:\\Users\\JyothishKumar\\Desktop\\Apk\\selendroid-test-app-0.17.0");
		driver.activateApp(packageName);
		
	}

}
