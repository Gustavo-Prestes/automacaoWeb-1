package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.ComprasPage;
import br.com.bootcamp.settings.BaseTest;

public class ComprasFuncionalidade extends BaseTest {

    private ComprasPage comprasPage;
    private SeleniumRobot seleniumRobot;

    public ComprasFuncionalidade (){
        this.comprasPage = new ComprasPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
    }

    public void montaPc (){
    seleniumRobot.clicaBotaoJS(comprasPage.getBtnProcessor());
    seleniumRobot.clicaBotaoJS(comprasPage.getBtnRam());
    seleniumRobot.clicaBotaoJS(comprasPage.getBtnHd());
    seleniumRobot.clicaBotaoJS(comprasPage.getBoxImage());
    seleniumRobot.clicaBotaoJS(comprasPage.getBoxOfficeSuite());
    seleniumRobot.clicaBotaoJS(comprasPage.getBoxOtherOfficeSuite());
    seleniumRobot.clicaBotaoJS(comprasPage.getBtnAddToCart());
    seleniumRobot.clicaBotaoJS(comprasPage.getBtnShoppingCart());
    seleniumRobot.clicaBotaoJS(comprasPage.getBtnShoppingCart());
    }
}
