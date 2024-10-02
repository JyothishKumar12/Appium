package webBrowserAutomate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateBrowser {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName","Android");

		capabilities.setCapability("platformVersion","13.0");

		capabilities.setCapability("deviceName","OPPO A74 5G");

		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("chromedriverExecutable", "C:\\Users\\JyothishKumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		URL url = new URL(" http://0.0.0.0:4723");
        driver = new AndroidDriver(url,capabilities);

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Testing job got",Keys.ENTER);
	}

}
