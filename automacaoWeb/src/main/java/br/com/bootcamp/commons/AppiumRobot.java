package br.com.bootcamp.commons;

import br.com.bootcamp.settings.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class AppiumRobot extends BaseTest {

    public boolean verificaElementoNaTela (MobileElement mobileElement){
        return mobileElement.isDisplayed();
    }

    public void clicarElemento(MobileElement mobileElement) {
        aguardarElementoFicarVisivel(mobileElement);
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

    public String getText(MobileElement mobileElement){
        return mobileElement.getText();
    }

    private void sleep (long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void aguardarElementoFicarVisivel (MobileElement mobileElement){
        wait.until(ExpectedConditions.visibilityOf(mobileElement));
    }

    public void swipeVertical (){
        Dimension size = driver.manage().window().getSize();
        int width=(int)(size.getWidth()/2);
        int startPoint=(int)(size.getHeight()*0.6);
        int endPoint=(int)(size.getHeight()*0.1);
        new TouchAction(driver).press(PointOption.point(width, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(width, endPoint)).release().perform();
    }

    public void swipeHorizontal(){
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * 2);
        int startPoint = (int) (size.width * 0.6);
        int endPoint = (int) (size.width * 0.1);
        new TouchAction(driver).press(PointOption.point(startPoint, anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endPoint, anchor)).release().perform();
    }
    public void scroll (double inicio, double fim){
        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;

        int startY = (int) (size.height * inicio);
        int endY = (int) (size.height * fim);

        new TouchAction<>(driver).press(PointOption.point(x,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, endY)).release().perform();
    }
    public void swipe (double inicio, double fim){
        Dimension size = driver.manage().window().getSize();

        int y = size.height / 2;

        int startX = (int) (size.width * inicio);
        int endX = (int) (size.width * fim);

        new TouchAction<>(driver).press(PointOption.point(startX,y ))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, y)).release().perform();
    }

}
