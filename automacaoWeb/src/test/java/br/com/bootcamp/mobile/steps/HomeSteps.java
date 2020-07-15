package br.com.bootcamp.mobile.steps;

import br.com.bootcamp.commons.AppiumRobot;
import br.com.bootcamp.funcionalidade.mobile.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;

public class HomeSteps {

    private HomeFuncionalidade homeFuncionalidade;
    private AppiumRobot appiumRobot;

    public HomeSteps() {
        this.homeFuncionalidade = new HomeFuncionalidade();
        this.appiumRobot = new AppiumRobot();
    }

    @Dado("^que toco na opção \"([^\"]*)\"$")
    public void queTocoNaOpção(String menu) {
        this.homeFuncionalidade.selecionaMenu(menu, menu.equalsIgnoreCase("Swipe"));
    }
}
