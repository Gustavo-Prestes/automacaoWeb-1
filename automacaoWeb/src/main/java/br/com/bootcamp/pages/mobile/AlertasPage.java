package br.com.bootcamp.pages.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AlertasPage {

    public AlertasPage (AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ALERTA SIMPLES']")
    private MobileElement btnAlerta;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement btnOk;

    public MobileElement getBtnAlerta() {
        return btnAlerta;
    }

    public MobileElement getBtnOk() {
        return btnOk;
    }
}
