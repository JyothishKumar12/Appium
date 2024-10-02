package selenDroidDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ToastMessages {

	public static AndroidDriver driver; 

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "Android");

		dc.setCapability("platformVersion", "13.0");

		dc.setCapability("udid", "6f2cc6c7");

		dc.setCapability("deviceName","OPPO A74 5G");

		dc.setCapability("appPackage", "io.selendroid.testapp");

		dc.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");

		dc.setCapability("automationName","UiAutomator2");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),dc);


		WebElement continues =	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));

		continues.click();

		Thread.sleep(3000);

		WebElement okButton =	driver.findElement(By.id("android:id/button1"));

		okButton.click();

		Thread.sleep(3000);

		WebElement toastBtn =   driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
		
		toastBtn.click();
		
		Thread.sleep(3000);
		
		WebElement msg =driver.findElement(By.xpath("//android.widget.Toast[@text=\"Hello selendroid toast!\"]"));
		
		System.out.println(msg.getText());
	}

}
