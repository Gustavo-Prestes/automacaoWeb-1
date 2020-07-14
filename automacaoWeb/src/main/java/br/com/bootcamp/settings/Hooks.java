package br.com.bootcamp.settings;

import br.com.bootcamp.enums.App;
import br.com.bootcamp.enums.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;


public class Hooks extends BaseTest{
	
	@Before(value = "@web")
	public void beforeWeb() {
		System.out.println("Iniciando Browser Web");
		initializeWebApplication(Browser.CHROME);
	}

	@Before(value = "@mobile")
	public void beforeMobile() {
		System.out.println("Iniciando Appium");
//		AppiumServerUtils.startServer();
		initializeMobileApplication(App.APK_APPIUM);
	}

	@After(value = "@mobile")
	public void afterMobile() {
		System.out.println("Encerrando testes mobile");
//		AppiumServerUtils.stopServer();
		closeMobile();
	}

	@After(value = "@web")
	public void afterWeb() {
		System.out.println("Fechando Web");
		closeWeb();
	}

}
