package br.com.bootcamp.pages.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	@FindBy(xpath = "//a[text()='testee@teste123.com']")
	private WebElement btnUsuario;

	@FindBy(xpath = "//*[text()='Build your own expensive computer']")
	private WebElement btnComputer;

	public WebElement getBtnUsuario() {
		return btnUsuario;
	}

	public WebElement getBtnComputer() {
		return btnComputer;
	}
}
