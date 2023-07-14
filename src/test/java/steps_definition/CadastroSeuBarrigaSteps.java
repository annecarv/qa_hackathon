package steps_definition;

import base_class.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import page_objects.SeuBarrigaHomePage;
import page_objects.SeuBarrigaCadastroPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroSeuBarrigaSteps extends BaseSteps {
    SeuBarrigaHomePage paginaInicial = new SeuBarrigaHomePage(browser);
    SeuBarrigaCadastroPage paginaCadastro = new SeuBarrigaCadastroPage(browser);
    String aleatorio = (new SimpleDateFormat("dd-MMM-yyyy-HH-mm-ss")).format(new Date());

    @Dado("que o usuario esta na pagina inicial do Seu Barriga")
    public void queOUsuarioEstaNaPaginaInicialDoSeuBarriga() {
        paginaInicial.abrir();
        screenshot();
    }

    @E("o usuario clicar no link \"Novo Usuario?\"")
    public void oUsuarioClicarNoLink() {
        paginaInicial.clicarLinkCadastro();
        screenshot();
    }

    @Quando("o usuario preencher nome, email e senha")
    public void oUsuarioPreencherNomeEmailESenha() {
        paginaCadastro.preencherNome("Mick Hill " + aleatorio);
        paginaCadastro.preencherEmail("mickhill@test-" + aleatorio);
        paginaCadastro.preencherSenha("1234");
        screenshot();
    }

    @E("o usuario clicar no botao \"Cadastrar\"")
    public void oUsuarioClicarNoBotao() {
        paginaCadastro.clicarBtnCadastro();
    }

    @Entao("o sistema redireciona o usuario para a pagina de login")
    public void oSistemaRedirecionaOUsuarioParaAPaginaDeLogin() {
    }

    @E("o sistema exibe uma mensagem de sucesso: {string}")
    public void oSistemaExibeUmaMensagemDeSucesso(String msgEsperada) {
        String msgTela = paginaCadastro.getMsgAlerta();
        Assert.assertEquals(msgEsperada, msgTela);
        screenshot();
    }
}
