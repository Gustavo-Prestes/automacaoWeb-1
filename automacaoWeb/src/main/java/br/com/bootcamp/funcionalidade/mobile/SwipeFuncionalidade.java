package br.com.bootcamp.funcionalidade.mobile;

import br.com.bootcamp.commons.AppiumRobot;
import br.com.bootcamp.pages.mobile.SwipePage;
import br.com.bootcamp.settings.BaseTest;

public class SwipeFuncionalidade extends BaseTest {

    private SwipePage swipePage;
    private AppiumRobot appiumRobot;

    public SwipeFuncionalidade () {
        swipePage = new SwipePage(driver);
        appiumRobot = new AppiumRobot();
    }

    public boolean pegaMsgSwipeFinal() {
       return appiumRobot.verificaElementoNaTela(swipePage.getValidaMsgFinal());

    }
}
