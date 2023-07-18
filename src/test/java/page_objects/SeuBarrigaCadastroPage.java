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
    private String urlUsuarioCadastrado = "https://seubarriga.wcaquino.me/cadastrarUsuario";
    private By msgErroNomeNaoPreenchido = By.xpath("/html/body/div[1]");
    private By msgErroEmailNaoPreenchido =  By.xpath("/html/body/div[2]");
    private By msgErroSenhaNaoPreenchido =  By.xpath("/html/body/div[3]");
    private By msgErroEmailJaCadastrado =  By.xpath("/html/body/div[1]");

    
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
    
    public void carregarPaginaUsuarioCadastrado() {
    	driver.getCurrentUrl().compareTo(urlUsuarioCadastrado);
    }
    
    public String carregarMensagemDeErroDadosInvalidos() { 
    	return driver.findElement(msgAlerta).getText();    
    }
    
    public String carregarMensagemErroNomeNaoPreenchido() {
    	return driver.findElement(msgErroNomeNaoPreenchido).getText();    
    }
    public String carregarMensagemDeErroEmailNaoPreenchido() {
    	return driver.findElement(msgErroEmailNaoPreenchido).getText();    
    }
    public String carregarMensagemDeErroSenhaNaoPreenchido() {
    	return driver.findElement(msgErroSenhaNaoPreenchido).getText();    
    }
    
    public String carregarMensagemDeErroEmailJaUtilizado() {
    	return driver.findElement(msgErroEmailJaCadastrado).getText();    
    }
    
}
