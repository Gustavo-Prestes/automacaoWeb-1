package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.HomePage;
import br.com.bootcamp.settings.BaseTest;

public class HomeFuncionalidade extends BaseTest{

	private HomePage homePage;
	private SeleniumRobot seleniumRobot;


	public HomeFuncionalidade() {
		this.homePage = new HomePage(webDriver);
		this.seleniumRobot = new SeleniumRobot();
	}
	public String pegaEmailLogado (){
		return seleniumRobot.pegarValorTexto(homePage.getBtnUsuario());
	}
	public void clicaBtnComputer (){
		seleniumRobot.scrollAteFimDaPaginaJS();
		seleniumRobot.clicaBotaoJS(homePage.getBtnComputer());
	}

}
