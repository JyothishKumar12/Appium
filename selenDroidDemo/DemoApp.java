package selenDroidDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DemoApp {

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

		Thread.sleep(3000);

		WebElement continues =	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		continues.click();
		Thread.sleep(3000);
		WebElement okButton =	driver.findElement(By.id("android:id/button1"));
		okButton.click();
		Thread.sleep(3000);
		WebElement registration =	driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration"));
		registration.click();

		Thread.sleep(3000);
		WebElement username =	driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		username.sendKeys("kark54");


		WebElement email =	driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		email.sendKeys("kar@gmail.com");

		WebElement password =	driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		password.sendKeys("cantdisclose");

		WebElement name =	driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		name.clear();
		name.sendKeys("kark");

		WebElement programLanguage = driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
		programLanguage.click();

		WebElement  java =	driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Java\"]"));
		java.click();

		WebElement adds =	driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));	
		adds.click();
		
		driver.navigate().back();
		
		WebElement  Register =	driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser"));
		Register.click();

	}

}
