package br.com.bootcamp.funcionalidade.mobile;

import br.com.bootcamp.commons.AppiumRobot;
import br.com.bootcamp.pages.mobile.AlertasPage;
import br.com.bootcamp.settings.BaseTest;

public class AlertasFuncionalidade extends BaseTest {

    private AlertasPage alertasPage;
    private AppiumRobot appiumRobot;

    public AlertasFuncionalidade(){
        this.alertasPage = new AlertasPage(driver);
        this.appiumRobot = new AppiumRobot();
    }

    public void clicaAlerta(){
        appiumRobot.clicarElemento(alertasPage.getBtnAlerta());
    }
    public void clicaOk(){
        appiumRobot.clicarElemento(alertasPage.getBtnOk());
    }
}
