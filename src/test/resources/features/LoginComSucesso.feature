#language: pt
@tagLoginComSucessoTomSmith
Funcionalidade: Login

	Cenario: Login com sucesso
	    Dado que o usuario esta na pagina de login
	    Quando o usuario preenche o username com "tomsmith"
	    E o usuario preenche o password com "SuperSecretPassword!"
	    Quando o usuario clica no botao login
	    Entao o sistema irá exibir a mensagem "You logged into a secure area!"

