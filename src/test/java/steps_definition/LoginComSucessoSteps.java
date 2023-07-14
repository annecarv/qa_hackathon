package steps_definition;

import org.junit.Assert;
import base_class.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page_objects.LoginComSucessoPage;

public class LoginComSucessoSteps extends BaseSteps {

	LoginComSucessoPage paginaLogin = new LoginComSucessoPage(browser);

	@Dado("que o usuario esta na pagina de login")
	public void queOUsuarioEstaNaPaginaDeLogin() {
		paginaLogin.abriPagina();
		screenshot();
	}

	@Quando("o usuario preenche o username com {string}")
	public void oUsuarioPreencheOUsernameCom(String username) {
		paginaLogin.preencherUsername(username);
		screenshot();
	}

	@E("o usuario preenche o password com {string}")
	public void oUsuarioPreencheOPasswordCom(String password) {
		paginaLogin.preencherPassword(password);
		screenshot();

	}

	@Quando("o usuario clica no botao login")
	public void oUsuarioClicaNoBotaoLogin() {
		paginaLogin.clickBtnLogin();
		screenshot();
	}

	@Entao("o sistema irá exibir a mensagem {string}")
	public void oSistemaIráExibirAMensagem(String loginComSucesso) {
		Assert.assertEquals(loginComSucesso, paginaLogin.verificarMensagemSucesso());
		screenshot();
	}

}
