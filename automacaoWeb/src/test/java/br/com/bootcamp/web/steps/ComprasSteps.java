package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.ComprasFuncionalidade;
import br.com.bootcamp.pages.web.ComprasPage;
import cucumber.api.java.pt.E;

public class ComprasSteps {

    private SeleniumRobot seleniumRobot;
    private ComprasFuncionalidade comprasFuncionalidade;

    public ComprasSteps() {
        this.seleniumRobot = new SeleniumRobot();
        this.comprasFuncionalidade = new ComprasFuncionalidade();
    }

    @E("^escolho as especificacoes desejadas$")
    public void escolhoAsEspecificacoesDesejadas() {
        comprasFuncionalidade.montaPc();
    }

}
