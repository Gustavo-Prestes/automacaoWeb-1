package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LimpaEnderecoPage {

    public LimpaEnderecoPage (WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy (xpath = "//a[@class='account' and text()='testee@teste123.com'] ")
    private WebElement acessoUsuario;

    @FindBy (xpath = "//a[@class='inactive' and text()='Addresses'] ")
    private WebElement enderecos;

    @FindBy (xpath = "//input[@class='button-2 delete-address-button'] ")
    private WebElement apagaEndereco;

    @FindBy (xpath = "//div[@class='address-list'] ")
    private WebElement textSemEndereco;


    public WebElement getAcessoUsuario() {
        return acessoUsuario;
    }

    public WebElement getEnderecos() {
        return enderecos;
    }

    public WebElement getApagaEndereco() {
        return apagaEndereco;
    }

    public WebElement getTextSemEndereco() {
        return textSemEndereco;
    }
}
