package br.com.bootcamp.settings;

import br.com.bootcamp.interfaces.MobileApplicationImp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.bootcamp.interfaces.BrowserImp;

import java.util.concurrent.TimeUnit;

public class BaseTest {

	protected static AndroidDriver<MobileElement> driver;
	protected static WebDriver webDriver;
	protected static WebDriverWait wait;

	protected void initializeWebApplication(BrowserImp webApplication) {
//		if (webDriver != null)
//			webDriver.close();

		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		webDriver.get("http://demowebshop.tricentis.com/");
		wait = new WebDriverWait(webDriver, 60);

	}

	protected void initializeMobileApplication(MobileApplicationImp mobileApplicationImp){
		driver = mobileApplicationImp.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);

	}

	public static WebDriver getWebDriver(){
		return webDriver;
	}


	protected static void closeWeb() {
		webDriver.quit();
	}

	protected static void closeMobile() {
		driver.quit();
	}
}
