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

	// Default

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

	//// Version Equipe 2

	// Fluxo Base
	@Quando("o usuario preencher o campo nome {string}")
	public void oUsuarioPreencherOCampoNome(String name) {
		paginaCadastro.preencherNome(name);
		screenshot();
	}

	@Quando("o usuario preencher o campo email {string}")
	public void oUsuarioPreencherOCampoEmail(String email) {
		paginaCadastro.preencherEmail(email);
		screenshot();
	}

	@Quando("o usuario preencher o campo senha {string}")
	public void oUsuarioPreencherOCampoSenha(String senha) {
		paginaCadastro.preencherSenha(senha);
		screenshot();
	}

	@E("o usuario clicar no botao \"Cadastrar\"")
	public void oUsuarioClicarNoBotao() {
		paginaCadastro.clicarBtnCadastro();
	}

	@Entao("o sistema redireciona o usuario para a pagina de login")
	public void oSistemaRedirecionaOUsuarioParaAPaginaDeLogin() {
		paginaCadastro.carregarPaginaUsuarioCadastrado();
	}

	@Entao("o sistema exibe uma mensagem de sucesso {string}")
	public void oSistemaExibeUmaMensagemDeSucesso(String msgSucesso) {
		String msgTela = paginaCadastro.getMsgAlerta();
		Assert.assertEquals(msgSucesso, msgTela);
		screenshot();
	}

	// Nome fora do Padrão

	@Quando("o usuario preencher o campo nome com caracteres a mais {string}")
	public void oUsuarioPreencherOCampoNomeComCaracteresAMais(String nome) {
		paginaCadastro.preencherNome(nome);
	}

	@Entao("o sistema exibe uma mensagem de erro informando que os dados são inválidos {string}")
	public void oSistemaExibeUmaMensagemDeErroInformandoQueOsDadosSãoInválidos(String msgErroDadosInvalidos) {
		String msgTela = paginaCadastro.carregarMensagemDeErroDadosInvalidos();
		Assert.assertEquals(msgErroDadosInvalidos, msgTela);
		screenshot();
	}

	// Cadastro com campos em Branco
	@Quando("o usuario não preencher o campo nome {string}")
	public void oUsuarioNãoPreencherOCampoNome(String nome) {
		paginaCadastro.preencherNome(nome);
	}

	@Quando("o usuario não preencher o campo email {string}")
	public void oUsuarioNãoPreencherOCampoEmail(String email) {
		paginaCadastro.preencherNome(email);
	}

	@Quando("o usuario não preencher o campo senha {string}")
	public void oUsuarioNãoPreencherOCampoSenha(String senha) {
		paginaCadastro.preencherNome(senha);
	}

	@Entao("o sistema exibe uma mensagem de erro do campo nome {string}")
	public void oSistemaExibeUmaMensagemDeErroDoCampoNome(String msgErroNomeNaoPreenchido) {
		String msgTela = paginaCadastro.carregarMensagemErroNomeNaoPreenchido();
		Assert.assertEquals(msgErroNomeNaoPreenchido, msgTela);
		screenshot();
	}

	@Entao("o sistema exibe uma mensagem de erro do campo email {string}")
	public void oSistemaExibeUmaMensagemDeErroDoCampoEmail(String msgErroEmailNaoPreenchido) {
		String msgTela = paginaCadastro.carregarMensagemDeErroEmailNaoPreenchido();
		Assert.assertEquals(msgErroEmailNaoPreenchido, msgTela);
		screenshot();
	}

	@Entao("o sistema exibe uma mensagem de erro do campo senha {string}")
	public void oSistemaExibeUmaMensagemDeErroDoCampoSenha(String msgErroSenhaNaoPreenchido) {
		String msgTela = paginaCadastro.carregarMensagemDeErroSenhaNaoPreenchido();
		Assert.assertEquals(msgErroSenhaNaoPreenchido, msgTela);
		screenshot();
	}

	// Cadastro com email já cadastrado anteriormente

	@Entao("o sistema exibe uma mensagem de erro informando que o endereço de email ja esta sendo utilizado {string}")
	public void oSistemaExibeUmaMensagemDeErroInformandoQueOEndereçoDeEmailJaEstaSendoUtilizado(
			String msgErroEmailJaUtilizado) {
		String msgTela = paginaCadastro.carregarMensagemDeErroEmailJaUtilizado();
		Assert.assertEquals(msgErroEmailJaUtilizado, msgTela);
		screenshot();
	}

}
