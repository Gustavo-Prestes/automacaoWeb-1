package br.com.bootcamp.funcionalidade.web;

import br.com.bootcamp.commons.SeleniumRobot;
import br.com.bootcamp.pages.web.CarrinhoPage;
import br.com.bootcamp.settings.BaseTest;
import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class CarrinhoFuncionalidade extends BaseTest {

    private Faker faker;
    private Random random;
    private CarrinhoPage carrinhoPage;
    private SeleniumRobot seleniumRobot;

    public CarrinhoFuncionalidade (){
        this.faker = new Faker (new Locale("pt-BR"));
        this.carrinhoPage = new CarrinhoPage(webDriver);
        this.seleniumRobot = new SeleniumRobot();
        this.random = new Random();
    }

    public void preencheDadosCarrinho (){
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBoxTermsOfService());
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBoxCheckout());
        boolean textoEndCadastrado = seleniumRobot.verificaElementoPresenteTela(carrinhoPage.getValidaMsgEndereco());
        if (!textoEndCadastrado){
            seleniumRobot.selecionaItemLista(carrinhoPage.getSelListCountry(), "Brazil");
            seleniumRobot.insireTextoNoElementoJS(carrinhoPage.getCmpCity(), faker.address().cityName());
            seleniumRobot.insireTextoNoElementoJS(carrinhoPage.getCmpAddress1(), faker.address().streetAddress());
            seleniumRobot.insireTextoNoElementoJS(carrinhoPage.getCmpPostalCode(),faker.address().zipCode());
            seleniumRobot.insireTextoNoElementoJS(carrinhoPage.getCmpPhoneNum(),faker.phoneNumber().cellPhone());
        }
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnContinueBillingAddress());
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnContinueShippingAddress());
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnNextDayAir());
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnContinueShippingMethod());
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnCreditCard());
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnContinuePaymentMethod());
        seleniumRobot.selecionaItemLista(carrinhoPage.getSelCreditCard(), "Visa");
        seleniumRobot.insireTextoNoElementoJS(carrinhoPage.getCmpCardName(),faker.name().fullName());
        seleniumRobot.insireTextoNoElementoJS(carrinhoPage.getCmpCardNumber(),faker.finance().creditCard(CreditCardType.VISA));
        seleniumRobot.selecionaItemLista(carrinhoPage.getSelListExpirationMonth(),"10");
        seleniumRobot.selecionaItemLista(carrinhoPage.getSelListExpirationYear(), "2023");
        seleniumRobot.insireTextoNoElementoJS(carrinhoPage.getCmpCardCode(),String.valueOf(random.nextInt(899)+100));
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnContinuePaymentInfo());
        seleniumRobot.clicaBotaoJS(carrinhoPage.getBtnConfirmOrder());
    }

    public String retornaMensagem(){
        return this.seleniumRobot.pegarValorTexto(this.carrinhoPage.getMsgConfirmacaoCompra());
    }
}
