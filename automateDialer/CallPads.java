package automateDialer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CallPads {

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
		
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/dialpad_key_layout\"])[1]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/dialpad_key_layout\"])[9]")).click();
		driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/dialpad_key_layout\"])[9]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"dial\"]")).click();
		driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.google.android.dialer:id/select_dialog_listview\"]/android.widget.LinearLayout[1]")).click();
		
	}

}
