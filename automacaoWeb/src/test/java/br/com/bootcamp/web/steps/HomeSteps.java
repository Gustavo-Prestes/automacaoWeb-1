package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.enums.Credentials;
import br.com.bootcamp.funcionalidade.web.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class HomeSteps {

    private SeleniumRobot seleniumRobot;
    private HomeFuncionalidade homeFuncionalidade;
    private LoginSteps loginSteps;

    public HomeSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.homeFuncionalidade = new HomeFuncionalidade();
        this.loginSteps = new LoginSteps();
    }

    @Dado("^que clico no botao \"([^\"]*)\"$")
    public void queClicoNoBotao(String textoBotao) {
        this.seleniumRobot.clicaBotaoPorTexto(textoBotao);
    }

    @Entao("^visualizo a tela inicial com meu usuario logado$")
    public void visualizoATelaInicialComMeuUsuarioLogado() {
        Assert.assertEquals(Credentials.CADASTRADO.usuarioCliente(), homeFuncionalidade.pegaEmailLogado());
    }

    @Dado("^que acesso a pagina inicial do site com usuario logado$")
    public void queAcessoAPaginaInicialDoSiteComUsuarioLogado() {
        seleniumRobot.clicaBotaoPorTexto("Log in");
        loginSteps.preenchoOsDadosDeLoginComUsuário("cadastrado");
        loginSteps.clicoNoBotaoLogIn();
        visualizoATelaInicialComMeuUsuarioLogado();
    }

    @E("^seleciono o produto$")
    public void selecionoOProduto() {
        homeFuncionalidade.clicaBtnComputer();
    }
}
