package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PesquisaGooglePage {
    private String url = "https://google.com";
    private By inputPesquisa = By.id("APjFqb");
    private By btnpesquisar = By.xpath("(//input[@name='btnK'])[2]");
    private WebDriver driver;

    public PesquisaGooglePage(WebDriver navegador) {
        this.driver = navegador;
    }

    public void abrirPagina() {
        driver.get(url);
    }

    public void preencherPesquisa(String texto) {
        driver.findElement(inputPesquisa).sendKeys(texto);
    }

    public void clicarBtnPesquisar() {
        driver.findElement(btnpesquisar).click();
    }
}
