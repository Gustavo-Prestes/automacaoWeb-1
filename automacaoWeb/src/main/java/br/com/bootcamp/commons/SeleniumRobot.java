package br.com.bootcamp.commons;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.com.bootcamp.settings.BaseTest;

public class SeleniumRobot extends BaseTest {

	/**
	 * Clicar em um botao atrav�s de JavaScriptExecutor
	 * 
	 * @param elemento Insira o elemento que voc� deseja clicar
	 */
	public void clicaBotaoJS(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].click();", elemento);
	}

	/**
	 * Marcar um checkbox atrav�s de JavaScriptExecutor
	 * 
	 * @param id Insira o id do elemento que voc� quer marcar
	 * 
	 */
	public void selecionaCheckBox(String id) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("document.getElementById('" + id + "');");
	}

	/**
	 * Retorna o valor de texto que existe no elemento
	 * 
	 * @param elemento Insira o elemento que voc� deseja capturar
	 * @return Retorna o valor de texto do elemento
	 */
	public String pegarValorTexto(WebElement elemento) {
		return elemento.getText();
	}

	/**
	 * Valida se o texto atual � igual ao texto esperado
	 * 
	 * @param atual    Insira o valor do texto atual
	 * @param esperado Insira o valor do texto esperado
	 * @return Retorna verdadeiro ou falso
	 */
	public boolean validaTexto(String atual, String esperado) {
		return atual.equals(esperado);
	}

	/**
	 * Realiza o Scroll da p�gina at� encontrar o elemento. (Obs. Elemento precisa
	 * existir na p�gina)
	 * 
	 * @param elemento Insira o elemento
	 * @return Retorna verdadeiro ou falso
	 */
	public void scrollAteOElemento(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView();", elemento);
	}

	/**
	 * Realiza o Scroll da p�gina at� o final da p�gina
	 * 
	 * @param elemento Insira o elemento
	 */
	public void scrollAteFimDaPagina(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Realiza o Scroll da p�gina at� o inicio da p�gina
	 * 
	 * @param elemento Insira o elemento
	 */
	public void scrollAteInicioDaPagina(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");
	}

	/**
	 * Espera o elemento estar clicavel na tela
	 * 
	 * @param elemento
	 */
	public void esperaElementoSerClicavel(WebElement elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	/**
	 * Seleciona um item na lista atrav�s do Text que est� vis�vel
	 * 
	 * @param elemento Elemento pai da Lista de sele��o
	 * @param texto    Texto no qual o comando deve clicar
	 */
	public void selecionaItemLista(WebElement elemento, String texto) {
		Select lista = new Select(elemento);
		lista.selectByVisibleText(texto);
	}

	/**
	 * Seleciona um item atr�ves do Index
	 * 
	 * @param elemento Elemento pai da Lista de sele��o
	 * @param index    Posi��o do elemento na lista
	 */
	public void selecionaItemLista(WebElement elemento, int index) {
		Select lista = new Select(elemento);
		lista.selectByIndex(index);
	}

	/**
	 * Seleciona um item na lista atrav�s do Valor
	 * 
	 * @param elemento Elemento pai da Lista de sele��o (id da tag select)
	 * @param valor    atributo value da tag option
	 */
	public void selecionaItemListaPorValor(WebElement elemento, String valor) {
		Select lista = new Select(elemento);
		lista.selectByValue(valor);
	}
	
	/**
	 * Insere um texto no campo atrav�s de JavascriptExecutor
	 * @param elemento Insira um elemento onde voc� deseja preencher no campo
	 * @param valor Insira o valor que voc� deseja preencher no campo
	 */
	public void insereTextoNoElementoJS(WebElement elemento, String valor) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].value='" + valor + "';", elemento);
	}

}
