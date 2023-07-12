package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadosPesquisaGooglePage {
    private By txtResultadosPesquisa = By.id("result-stats");
    private WebDriver driver;

    public ResultadosPesquisaGooglePage(WebDriver navegador)  {
        this.driver = navegador;
    }

    public int getResultPesquisa() {
        String texto = driver.findElement(txtResultadosPesquisa).getText();
        String[] vetorTexto = texto.split(" ");
        texto = vetorTexto[1].replace(",", "").replace(".", "");
        int nunTratado = Integer.parseInt(texto);
        return nunTratado;
    }
}
