package br.com.bootcamp.mobile.steps;

import br.com.bootcamp.funcionalidade.mobile.FormularioFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class FormularioSteps {

    private FormularioFuncionalidade formularioFuncionalidade;

    public FormularioSteps() {
        this.formularioFuncionalidade = new FormularioFuncionalidade();
    }

    @E("^preencho os campos do formulario$")
    public void preenchoOsCamposDoFormulario() {
        formularioFuncionalidade.preenchoOsCampos();
    }

    @Quando("^clico em salvar$")
    public void clicoEmSalvar() {
        formularioFuncionalidade.clicaBotoes();
    }

    @Entao("^valido as opcoes validas na tela$")
    public void validoAsOpcoesValidasNaTela() {
        Assert.assertEquals("Nome: "+FormularioFuncionalidade.guardaNomeFaker , formularioFuncionalidade.getNomeCadastrado());
    }
}
