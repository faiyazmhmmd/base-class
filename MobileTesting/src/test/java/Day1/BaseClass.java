package Day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public static AndroidDriver driver;
	
	public static void initial() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appium:deviceName", "mrmvqk4x7pha79cu");
		cap.setCapability("appium:automationName", "UiAutomator2");
		cap.setCapability("appium:appPackage", "com.omr_branch");
		cap.setCapability("appium:appActivity", "com.omr_branch.MainActivity");

		URL url = new URL("http://127.0.0.1:4723/");
		driver = new AndroidDriver(url, cap);
		
	}
	
	public static void swipeDown() {
		Dimension size = driver.manage().window().getSize();
		int width = size.getWidth();
		int height = size.getHeight();

		int centerX = width / 2;
		int startY = (int) (height * 0.70);
		int endY = (int) (height * 0.30);

		
		PointerInput pointer = new PointerInput(Kind.TOUCH, "Finger1");
		Sequence sequence = new Sequence(pointer, 1);
		sequence.addAction(	pointer.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, startY));

		sequence.addAction(pointer.createPointerDown(1));
		sequence.addAction(	pointer.createPointerMove(Duration.ofSeconds(3), PointerInput.Origin.viewport(), centerX, endY));
		sequence.addAction(pointer.createPointerUp(1));
		
	    ((RemoteWebDriver)driver).perform(Arrays.asList(sequence));

	}
	public static void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));

	}


}
