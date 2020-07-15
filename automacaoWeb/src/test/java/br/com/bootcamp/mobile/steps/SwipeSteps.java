package br.com.bootcamp.mobile.steps;

import br.com.bootcamp.commons.AppiumRobot;
import br.com.bootcamp.funcionalidade.mobile.SwipeFuncionalidade;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class SwipeSteps {

    private SwipeFuncionalidade swipeFuncionalidade;
    private AppiumRobot appiumRobot;

    public SwipeSteps() {
        swipeFuncionalidade = new SwipeFuncionalidade();
        appiumRobot = new AppiumRobot();
    }

    @Quando("^deslizo ate a ultima tela$")
    public void deslizoAteAUltimaTela() {
        for (int i = 0; i <2; i++) {
            appiumRobot.swipe(0.9,0.1);
        }
    }

    @Entao("^valido o texto na tela$")
    public void validoOTextoNaTela() {
        Assert.assertTrue(swipeFuncionalidade.pegaMsgSwipeFinal());
    }
}
