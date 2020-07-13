package br.com.bootcamp.web.steps;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.funcionalidade.web.CarrinhoFuncionalidade;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CarrinhoSteps {

    private CarrinhoFuncionalidade carrinhoFuncionalidade;
    private SeleniumRobot seleniumRobot;

    public CarrinhoSteps (){
        carrinhoFuncionalidade = new CarrinhoFuncionalidade();
        seleniumRobot = new SeleniumRobot();
    }

    @Quando("^preencho os dados de envio e pagamento$")
    public void preenchoOsDadosDeEnvioEPagamento() {
        carrinhoFuncionalidade.preencheDadosCarrinho();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoAMensagem(String mensagem){
        this.seleniumRobot.validaTexto(this.carrinhoFuncionalidade.retornaMensagem(), mensagem);
    }
}
