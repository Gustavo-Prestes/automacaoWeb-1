package br.com.bootcamp.funcionalidade.mobile;

import br.com.bootcamp.commons.AppiumRobot;
import br.com.bootcamp.enums.MenuHomeImp;
import br.com.bootcamp.interfaces.MenuHome;
import br.com.bootcamp.pages.mobile.HomePage;
import br.com.bootcamp.settings.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;
    private AppiumRobot appiumRobot;

    public HomeFuncionalidade() {
        this.homePage = new HomePage(driver);
        this.appiumRobot = new AppiumRobot();
    }

    public void selecionaMenu(String menu, boolean scroll) {
        MenuHome opcao = MenuHomeImp.valueOf(menu.replace(" ", "_").toUpperCase());
        if (scroll) {
            appiumRobot.scroll(0.9, 0.1);
        }
        wait.until(ExpectedConditions.visibilityOf(opcao.getElement(this.homePage)));
        opcao.getElement(this.homePage).click();
    }
}

