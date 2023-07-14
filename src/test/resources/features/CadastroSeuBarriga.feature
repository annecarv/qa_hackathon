#language: pt
@cadastro_seu_barrica
Funcionalidade: Cadastro Seu Barriga
  Cenario: 01 - Cadastro com SUCESSO
    Dado que o usuario esta na pagina inicial do Seu Barriga
    E o usuario clicar no link "Novo Usuario?"
    Quando o usuario preencher nome, email e senha
    E o usuario clicar no botao "Cadastrar"
    Entao o sistema redireciona o usuario para a pagina de login
    E o sistema exibe uma mensagem de sucesso: "Usuário inserido com sucesso"

#  Cenario: 02 - Validar cadastro de usuario com senha fora do padrao
#  Cenario: 03 - Validar criacao de email com 31 caracteres
#  Cenario: 04 - Cadastro com campos obrigatorios em branco
