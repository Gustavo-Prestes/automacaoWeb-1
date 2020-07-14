package br.com.bootcamp.pages.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FormularioPage {

    public FormularioPage (AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "nome")
    private MobileElement cmpNome;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='check']")
    private MobileElement btnCheck;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SALVAR']")
    private MobileElement btnSalvar;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Nome:')]")
    private MobileElement nomeCadastrado;



    public MobileElement getCmpNome() {
        return cmpNome;
    }

    public MobileElement getBtnCheck() {
        return btnCheck;
    }

    public MobileElement getBtnSalvar() {
        return btnSalvar;
    }

    public MobileElement getNomeCadastrado() {
        return nomeCadastrado;
    }
}
