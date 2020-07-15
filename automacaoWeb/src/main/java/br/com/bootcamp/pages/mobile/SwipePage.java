package br.com.bootcamp.pages.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class SwipePage {

    public SwipePage (AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chegar até o fim!']")
    private MobileElement validaMsgFinal;

    public MobileElement getValidaMsgFinal() {
        return validaMsgFinal;
    }
}
