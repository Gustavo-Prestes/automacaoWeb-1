package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComprasPage {

    public ComprasPage (WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath = "//*[text()='Fast  [+100.00]']")
    private WebElement btnProcessor;

    @FindBy (xpath = "//*[text()='8GB  [+60.00]']")
    private WebElement btnRam;

    @FindBy (xpath = "//*[text()='400 GB  [+100.00]']")
    private WebElement btnHd;

    @FindBy (xpath = "//*[text()='Image Viewer  [+5.00]']")
    private WebElement boxImage;

    @FindBy (xpath = "//*[text()='Office Suite  [+100.00]']")
    private WebElement boxOfficeSuite;

    @FindBy (xpath = "//*[text()='Other Office Suite  [+40.00]']")
    private WebElement boxOtherOfficeSuite;

    @FindBy (xpath = "//input[@id='add-to-cart-button-74']")
    private WebElement btnAddToCart;

    @FindBy (xpath = "//span[text()='Shopping cart']")
    private WebElement btnShoppingCart;

    public WebElement getBtnProcessor() {
        return btnProcessor;
    }

    public WebElement getBtnRam() {
        return btnRam;
    }

    public WebElement getBtnHd() {
        return btnHd;
    }

    public WebElement getBoxImage() {
        return boxImage;
    }

    public WebElement getBoxOfficeSuite() {
        return boxOfficeSuite;
    }

    public WebElement getBoxOtherOfficeSuite() {
        return boxOtherOfficeSuite;
    }

    public WebElement getBtnAddToCart() {
        return btnAddToCart;
    }

    public WebElement getBtnShoppingCart() {
        return btnShoppingCart;
    }
}
