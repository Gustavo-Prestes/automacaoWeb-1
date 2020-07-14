package br.com.bootcamp.funcionalidade.mobile;

import br.com.bootcamp.commons.AppiumRobot;
import br.com.bootcamp.pages.mobile.FormularioPage;
import br.com.bootcamp.settings.BaseTest;
import com.github.javafaker.Faker;

import java.util.Locale;

public class FormularioFuncionalidade extends BaseTest {

    private FormularioPage formularioPage;
    private Faker faker;
    private AppiumRobot appiumRobot;
    public static String guardaNomeFaker;

    public FormularioFuncionalidade (){
        this.formularioPage = new FormularioPage(driver);
        this.faker = new Faker(new Locale("pt-BR"));
        this.appiumRobot = new AppiumRobot();
    }

    public void preenchoOsCampos(){
        guardaNomeFaker = faker.leagueOfLegends().location();
        this.appiumRobot.escreverElemento(formularioPage.getCmpNome(), guardaNomeFaker);
    }
    public void clicaBotoes (){
        this.appiumRobot.clicarElemento(formularioPage.getBtnCheck());
        this.appiumRobot.clicarElemento(formularioPage.getBtnSalvar());
    }
    public String getNomeCadastrado (){
        return this.appiumRobot.getText(formularioPage.getNomeCadastrado());
    }

}
