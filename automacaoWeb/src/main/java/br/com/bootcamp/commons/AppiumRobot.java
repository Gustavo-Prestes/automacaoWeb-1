package br.com.bootcamp.commons;

import br.com.bootcamp.settings.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.time.Duration;
import java.util.HashMap;

public class AppiumRobot extends BaseTest {

    public void clicarElemento(MobileElement mobileElement) {
        mobileElement.click();
    }

    public void clicarElemento(MobileElement mobileElement, int vezes) {
        for (int i = 0; i < vezes; i++) {
            mobileElement.click();
        }
    }
    public void escreverElemento(MobileElement mobileElement, String valor){
        mobileElement.sendKeys(valor);
    }
    public void swipe(double startX, double startY, double endX, double endY, double duration) {
        JavascriptExecutor js = driver;
        sleep(1);
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("touchCount", 1.0);
        swipeObject.put("startX", startX);
        swipeObject.put("startY", startY);
        swipeObject.put("endX", endX);
        swipeObject.put("endY", endY);
        swipeObject.put("duration", duration);
        js.executeScript("mobile: swipe", swipeObject);
    }

    public String getText(MobileElement mobileElement){
        return mobileElement.getText();
    }
    public void sleep (long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
