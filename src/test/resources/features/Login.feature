#language: pt
@tagLoginComSucessoTomSmith
Funcionalidade: Login

	Cenario: Login com sucesso
	    Dado que o usuario esta na pagina de login
	    Quando o usuario preenche o username com "tomsmith"
	    E o usuario preenche o password com "SuperSecretPassword!"
	    Quando o usuario clica no botao login
	    Entao o sistema irá exibir a mensagem "You logged into a secure area!"

	Cenario: Login com senha em branco
		Dado que o usuario esta na pagina de login
		Quando o usuario preenche o username com "tomsmith"
		E o usuario preenche o password com ""
		Quando o usuario clica no botao login
		Entao o sistema irá exibir a mensagem "Your password is invalid!"

	Cenario: Login com senha incorreta
		Dado que o usuario esta na pagina de login
		Quando o usuario preenche o username com "tomsmith"
		E o usuario preenche o password com "Socorro123"
		Quando o usuario clica no botao login
		Entao o sistema irá exibir a mensagem "Your password is invalid!"

	Cenario: Login com usuario em branco
		Dado que o usuario esta na pagina de login
		Quando o usuario preenche o username com ""
		E o usuario preenche o password com "SuperSecretPassword!"
		Quando o usuario clica no botao login
		Entao o sistema irá exibir a mensagem "Your username is invalid!"

	Cenario: Login com usuario e senha em branco
		Dado que o usuario esta na pagina de login
		Quando o usuario preenche o username com ""
		E o usuario preenche o password com ""
		Quando o usuario clica no botao login
		Entao o sistema irá exibir a mensagem "Your username is invalid!"