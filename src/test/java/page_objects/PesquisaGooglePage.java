package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PesquisaGooglePage extends BasePage {
    private String url = "https://google.com";
    private By inputPesquisa = By.id("APjFqb");
    private By optionsPesrquisa = By.cssSelector("ul[role='listbox'] > li:nth-child(1)");
    private By btnpesquisar = By.xpath("(//input[@name='btnK'])[2]");

    public PesquisaGooglePage(WebDriver navegador) {
        super(navegador);
    }

    public void abrirPagina() {
        driver.get(url);
    }

    public void preencherPesquisa(String texto) {
        waitElementVisible(inputPesquisa, 5);
        driver.findElement(inputPesquisa).sendKeys(texto);
        waitElementVisible(optionsPesrquisa, 5);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public void clicarBtnPesquisar() {
        waitElementVisible(btnpesquisar, 5);
        driver.findElement(btnpesquisar).click();
    }
}
