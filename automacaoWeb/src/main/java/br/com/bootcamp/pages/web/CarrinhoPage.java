package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPage {

    public CarrinhoPage (WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath = "//input[@id='termsofservice']")
    private WebElement boxTermsOfService;

    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement boxCheckout;

    @FindBy (xpath = "//label[text()='Select a billing address from your address book or enter a new address.']")
    private WebElement validaMsgEndereco;

    @FindBy (xpath = "//select[@id='BillingNewAddress_CountryId']")
    private WebElement selListCountry;

    @FindBy (xpath = "//input[@id='BillingNewAddress_City']")
    private WebElement cmpCity;

    @FindBy (xpath = "//input[@id='BillingNewAddress_Address1']")
    private WebElement cmpAddress1;

    @FindBy (xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    private WebElement cmpPostalCode;

    @FindBy (xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    private WebElement cmpPhoneNum;

    @FindBy (xpath = "//input[@value='Continue' and parent :: div[@id= 'billing-buttons-container']]")
    private WebElement btnContinueBillingAddress;

    @FindBy (xpath = "//input[@value='Continue' and parent :: div[@id= 'shipping-buttons-container']]")
    private WebElement btnContinueShippingAddress;

    @FindBy (xpath = "//input[@id='shippingoption_1']")
    private WebElement btnNextDayAir;

    @FindBy (xpath = "//input[@value='Continue' and parent :: div[@id= 'shipping-method-buttons-container']]")
    private WebElement btnContinueShippingMethod;

    @FindBy (xpath = "//input[@id='paymentmethod_2']")
    private WebElement btnCreditCard;

    @FindBy (xpath = "//input[@value='Continue' and parent :: div[@id= 'payment-method-buttons-container']]")
    private WebElement btnContinuePaymentMethod;

    @FindBy (xpath = "//select[@id='CreditCardType']")
    private WebElement selCreditCard;

    @FindBy (xpath = "//input[@id='CardholderName']")
    private WebElement cmpCardName;

    @FindBy (xpath = "//input[@id='CardNumber']")
    private WebElement cmpCardNumber;

    @FindBy (xpath = "//select[@id='ExpireMonth']")
    private WebElement selListExpirationMonth;

    @FindBy (xpath = "//select[@id='ExpireYear']")
    private WebElement selListExpirationYear;

    @FindBy (xpath = "//input[@id='CardCode']")
    private WebElement cmpCardCode;

    @FindBy (xpath = "//input[@value='Continue' and parent :: div[@id= 'payment-info-buttons-container']]")
    private WebElement btnContinuePaymentInfo;

    @FindBy (xpath = "//input[@value='Confirm' and parent :: div[@id= 'confirm-order-buttons-container']]")
    private WebElement btnConfirmOrder;

    @FindBy (xpath = "//div[@class='page-title'] /child :: h1")
    private WebElement msgConfirmacaoCompra;

    public WebElement getBoxTermsOfService() {
        return boxTermsOfService;
    }

    public WebElement getBoxCheckout() {
        return boxCheckout;
    }

    public WebElement getValidaMsgEndereco() {
        return validaMsgEndereco;
    }

    public WebElement getSelListCountry() {
        return selListCountry;
    }

    public WebElement getCmpCity() {
        return cmpCity;
    }

    public WebElement getCmpAddress1() {
        return cmpAddress1;
    }

    public WebElement getCmpPostalCode() {
        return cmpPostalCode;
    }

    public WebElement getCmpPhoneNum() {
        return cmpPhoneNum;
    }

    public WebElement getBtnContinueBillingAddress() {
        return btnContinueBillingAddress;
    }

    public WebElement getBtnContinueShippingAddress() {
        return btnContinueShippingAddress;
    }

    public WebElement getBtnNextDayAir() {
        return btnNextDayAir;
    }

    public WebElement getBtnContinueShippingMethod() {
        return btnContinueShippingMethod;
    }

    public WebElement getBtnCreditCard() {
        return btnCreditCard;
    }

    public WebElement getBtnContinuePaymentMethod() {
        return btnContinuePaymentMethod;
    }

    public WebElement getSelCreditCard() {
        return selCreditCard;
    }

    public WebElement getCmpCardName() {
        return cmpCardName;
    }

    public WebElement getCmpCardNumber() {
        return cmpCardNumber;
    }

    public WebElement getSelListExpirationMonth() {
        return selListExpirationMonth;
    }

    public WebElement getSelListExpirationYear() {
        return selListExpirationYear;
    }

    public WebElement getCmpCardCode() {
        return cmpCardCode;
    }

    public WebElement getBtnContinuePaymentInfo() {
        return btnContinuePaymentInfo;
    }

    public WebElement getBtnConfirmOrder() {
        return btnConfirmOrder;
    }

    public WebElement getMsgConfirmacaoCompra() {
        return msgConfirmacaoCompra;
    }
}
