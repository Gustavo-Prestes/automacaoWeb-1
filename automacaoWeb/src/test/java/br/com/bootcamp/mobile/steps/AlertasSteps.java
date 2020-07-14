package br.com.bootcamp.mobile.steps;

import br.com.bootcamp.funcionalidade.mobile.AlertasFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class AlertasSteps {

    private AlertasFuncionalidade alertasFuncionalidade;

    public AlertasSteps(){
        this.alertasFuncionalidade = new AlertasFuncionalidade();
    }

    @E("^seleciono o alerta simples$")
    public void selecionoOAlertaSimples() {
        alertasFuncionalidade.clicaAlerta();
    }

    @Entao("^clico em ok$")
    public void clicoEmOk() {
        alertasFuncionalidade.clicaOk();
    }
}
