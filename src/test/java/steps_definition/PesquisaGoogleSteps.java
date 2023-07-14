package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import page_objects.PesquisaGooglePage;
import page_objects.ResultadosPesquisaGooglePage;

public class PesquisaGoogleSteps extends BaseSteps {

    PesquisaGooglePage paginaPesquisa = new PesquisaGooglePage(browser);
    ResultadosPesquisaGooglePage paginaResultados = new ResultadosPesquisaGooglePage(browser);

    @Dado("que o usuario esta na pagina de pesquisa")
    public void queOUsuarioEstaNaPaginaDePesquisa() {
        paginaPesquisa.abrirPagina();
        screenshot();
    }

    @Quando("o usuario preencher a pesquisa com {string}")
    public void oUsuarioPreencherAPesquisaCom(String textoPesquisa) {
        paginaPesquisa.preencherPesquisa(textoPesquisa);
        screenshot();
    }

    @E("o usuario clicar no botao de pesquisar")
    public void oUsuarioClicarNoBotãoDePesquisar() {
        paginaPesquisa.clicarBtnPesquisar();
    }

    @Entao("o sistema apresenta os resultados buscados")
    public void oSistemaApresentaOsResultadosBuscados() {
        int resut = paginaResultados.getResultPesquisa();
        Assert.assertTrue(resut > 0);
        screenshot();
    }
}
