package br.com.bootcamp.pages.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Formulário']")
    private MobileElement menuFormulario;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='About...']")
    private MobileElement menuAbout;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alertas']")
    private MobileElement menuAlertas;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Swipe']")
    private MobileElement menuSwipes;

    public MobileElement getMenuFormulario() {
        return menuFormulario;
    }

    public MobileElement getMenuAbout() {
        return menuAbout;
    }

    public MobileElement getMenuAlertas() {
        return menuAlertas;
    }

    public MobileElement getMenuSwipes() {
        return menuSwipes;
    }
}
