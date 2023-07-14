package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadosPesquisaGooglePage extends BasePage {
    private By txtResultadosPesquisa = By.id("result-stats");

    public ResultadosPesquisaGooglePage(WebDriver navegador)  {
        super(navegador);
    }

    public int getResultPesquisa() {
        String texto = driver.findElement(txtResultadosPesquisa).getText();
        String[] vetorTexto = texto.split(" ");
        texto = vetorTexto[1].replace(",", "").replace(".", "");
        int nunTratado = Integer.parseInt(texto);
        return nunTratado;
    }
}
