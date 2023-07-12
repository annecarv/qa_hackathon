package steps_definition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.PesquisaGooglePage;
import page_objects.ResultadosPesquisaGooglePage;

public class PesquisaGoogleSteps {
    WebDriver navegador;
    PesquisaGooglePage paginaPesquisa;
    ResultadosPesquisaGooglePage paginaResultados;

    @Dado("que o usuario esta na pagina de pesquisa")
    public void queOUsuarioEstaNaPaginaDePesquisa() {
        // Criando Navegador
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();

        // Criando Paginas
        paginaPesquisa = new PesquisaGooglePage(navegador);
        paginaResultados = new ResultadosPesquisaGooglePage(navegador);

        paginaPesquisa.abrirPagina();
    }

    @Quando("o usuario preencher a pesquisa com {string}")
    public void oUsuarioPreencherAPesquisaCom(String textoPesquisa) {
        paginaPesquisa.preencherPesquisa(textoPesquisa);
    }

    @E("o usuario clicar no botao de pesquisar")
    public void oUsuarioClicarNoBotãoDePesquisar() {
        paginaPesquisa.clicarBtnPesquisar();
    }

    @Entao("o sistema apresenta os resultados buscados")
    public void oSistemaApresentaOsResultadosBuscados() {
        int resut = paginaResultados.getResultPesquisa();
        Assert.assertTrue(resut > 0);
        navegador.quit();
    }
}
