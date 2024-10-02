package Calculator;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorApp {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		System.out.println("Start ");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("automationName","UiAutomator2");
		capabilities.setCapability("platformVersion","13.0");
		capabilities.setCapability("udid","6f2cc6c7");
		capabilities.setCapability("deviceName","OPPO A74 5G");
		capabilities.setCapability("appPackage","com.coloros.calculator");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
//		capabilities.setCapability("ignoreHiddenApiPolicyError" , true); 
		
		URL url = new URL("http://0.0.0.0:4723/");
		driver = new AndroidDriver(url, capabilities);
		
		driver.findElement(By.id("com.coloros.calculator:id/digit_2")).click();
		driver.findElement(By.id("com.coloros.calculator:id/img_op_add")).click();
		driver.findElement(By.id("com.coloros.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.coloros.calculator:id/img_eq\r\n")).click();
		
		System.out.println("Done");
	}

}
