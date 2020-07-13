package br.com.bootcamp.funcionalidade.web;


import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.enums.Credentials;
import br.com.bootcamp.pages.web.LoginPage;
import br.com.bootcamp.settings.BaseTest;
import org.openqa.selenium.WebElement;

public class LoginFuncionalidade extends BaseTest {
	private LoginPage loginPage;
	private SeleniumRobot seleniumRobot;

	public LoginFuncionalidade() {
		this.seleniumRobot = new SeleniumRobot();

		this.loginPage = new LoginPage(webDriver);
	}


	public void preencheCredenciais(String tipoUsuario){
		this.seleniumRobot.insireTextoNoElementoJS(loginPage.getTxtEmail(),Credentials.valueOf(tipoUsuario.toUpperCase()).usuarioCliente());
		this.seleniumRobot.insireTextoNoElementoJS(loginPage.getTxtSenha(),Credentials.valueOf(tipoUsuario.toUpperCase()).senhaCliente());
	}
	public void clicaBotaoLogin (){
		this.seleniumRobot.clicaBotaoJS(loginPage.getBtnLogin());

	}
}
