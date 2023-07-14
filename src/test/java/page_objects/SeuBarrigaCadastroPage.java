package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeuBarrigaCadastroPage extends BasePage {
    private By inputNome = By.id("nome");
    private By inputEmail = By.id("email");
    private By inputSenha = By.id("senha");
    private By btnCadastrar = By.xpath("//form/input[@value='Cadastrar']");
    private By msgAlerta = By.xpath("//div[@role='alert']");
    public SeuBarrigaCadastroPage(WebDriver _browser) {
        super(_browser);
    }

    public void preencherNome(String nome) {
        driver.findElement(inputNome).sendKeys(nome);
    }

    public void preencherEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        driver.findElement(inputSenha).sendKeys(senha);
    }

    public void clicarBtnCadastro() {
        driver.findElement(btnCadastrar).click();
    }

    public String getMsgAlerta() {
        return driver.findElement(msgAlerta).getText();
    }
}
