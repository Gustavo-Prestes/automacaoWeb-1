package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.LimpaEnderecoFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LimpaEnderecoSteps {

    private LimpaEnderecoFuncionalidade limpaEnderecoFuncionalidade;
    private SeleniumRobot seleniumRobot;


    public LimpaEnderecoSteps (){
        limpaEnderecoFuncionalidade = new LimpaEnderecoFuncionalidade();
        seleniumRobot = new SeleniumRobot();
    }

    @E("^clico em meu email$")
    public void clicoEmMeuEmail() {
        limpaEnderecoFuncionalidade.clicaEmail();

    }

    @E("^vou em Addresses$")
    public void vouEmAddresses() {
        limpaEnderecoFuncionalidade.irEmEndereco();
    }

    @Quando("^clico em Delete$")
    public void clicoEmDelete() {
        limpaEnderecoFuncionalidade.apagaEndereco();
    }

    @Entao("^o endereco e excluido$")
    public void oEnderecoEExcluido() {
        limpaEnderecoFuncionalidade.msgEnderecoExcluido();
    }
}
