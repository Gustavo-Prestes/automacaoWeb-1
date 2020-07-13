package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.LimpaEnderecoPage;
import br.com.bootcamp.settings.BaseTest;

public class LimpaEnderecoFuncionalidade extends BaseTest {

    private SeleniumRobot seleniumRobot;
    private LimpaEnderecoPage limpaEnderecoPage;

    public LimpaEnderecoFuncionalidade() {
        seleniumRobot = new SeleniumRobot();
        limpaEnderecoPage = new LimpaEnderecoPage(webDriver);
    }

    public void clicaEmail() {
        seleniumRobot.clicaBotaoJS(limpaEnderecoPage.getAcessoUsuario());
    }

    public void irEmEndereco() {
        seleniumRobot.clicaBotaoJS(limpaEnderecoPage.getEnderecos());
    }

    public void apagaEndereco() {
        seleniumRobot.clicaBotaoJS(limpaEnderecoPage.getApagaEndereco());
    }

    public void msgEnderecoExcluido() {
        seleniumRobot.validaTexto("No addresses", seleniumRobot.pegarValorTexto(limpaEnderecoPage.getTextSemEndereco()));
    }
}
