#language: pt
# O nome deve ter 60 caracteres, email e senha devem ter 32 caracteres

@cadastro_seu_barriga
Funcionalidade: Cadastro Seu Barriga

  Cenario: Cadastro de usuário com SUCESSO
    Dado que o usuario esta na pagina inicial do Seu Barriga
    E o usuario clicar no link "Novo Usuario?"
    Quando o usuario preencher o campo nome "annetherezacarvalhoborgesloginseubarrigaittalentqatesteselen"
    E o usuario preencher o campo email "annetherezacarvalhobor@gmail.com"
    E o usuario preencher o campo senha "annetherezacarvalhobor#@12345678"
    E o usuario clicar no botao "Cadastrar"
    Entao o sistema redireciona o usuario para a pagina de login
    E o sistema exibe uma mensagem de sucesso "Usuário inserido com sucesso"

  Cenario: Cadastro com erro por nome fora do padrão (nome com 61 caracteres)
    Dado que o usuario esta na pagina inicial do Seu Barriga
    E o usuario clicar no link "Novo Usuario?"
   	Quando o usuario preencher o campo nome com caracteres a mais "annetherezacarvalhoborgesloginseubarrigaittalentqatesteseleni"
    E o usuario preencher o campo email "annecarvalhobittalentteste@gmail"
    E o usuario preencher o campo senha "annetherezacarvalhobor#@12345678"
    E o usuario clicar no botao "Cadastrar"
    Entao o sistema exibe uma mensagem de erro informando que os dados são inválidos "Dados Inválidos"
 #Bug pois o sistema realiza o login e mostra a mensagem "Usuário inserido com sucesso"

  Cenario: Cadastro com erro por senha fora do padrão (Senha com 30 caracteres)
    Dado que o usuario esta na pagina inicial do Seu Barriga
    E o usuario clicar no link "Novo Usuario?"
    Quando o usuario preencher o campo nome "annetherezacarvalhoborgesloginseubarrigaittalentqatesteselen"
    E o usuario preencher o campo email "annetestando123456789@gmail.com"
    E o usuario preencher o campo senha "annetherezacarvalhobor#@1234567"
    E o usuario clicar no botao "Cadastrar"
    Entao o sistema exibe uma mensagem de erro informando que os dados são inválidos "Dados Inválidos"
 #Bug pois o sistema realiza o login e mostra a mensagem "Usuário inserido com sucesso"
 
  Cenario: Cadastro com erro por email fora do padrão (email com 31 caracteres)
    Dado que o usuario esta na pagina inicial do Seu Barriga
    E o usuario clicar no link "Novo Usuario?"
    Quando o usuario preencher o campo nome "annetherezacarvalhoborgesloginseubarrigaittalentqatesteselen"
    E o usuario preencher o campo email "anneterezacarvalhobor@gmail.com"
    E o usuario preencher o campo senha "annetherezacarvalhobor#@12345678"
    E o usuario clicar no botao "Cadastrar"
    Entao o sistema exibe uma mensagem de erro informando que os dados são inválidos "Dados Inválidos"
  #Bug pois o sistema realiza o login e mostra a mensagem "Usuário inserido com sucesso"  
    
  Cenario: Cadastro com campos em branco
  	Dado que o usuario esta na pagina inicial do Seu Barriga
    E o usuario clicar no link "Novo Usuario?"
   	Quando o usuario não preencher o campo nome ""
    E o usuario não preencher o campo email ""
    E o usuario não preencher o campo senha ""
    E o usuario clicar no botao "Cadastrar"
    Entao o sistema exibe uma mensagem de erro do campo nome "Nome é um campo obrigatório"
    E o sistema exibe uma mensagem de erro do campo email "Email é um campo obrigatório"
    E o sistema exibe uma mensagem de erro do campo senha "Senha é um campo obrigatório"

  Cenario: Cadastro com email já cadastrado anteriormente
    Dado que o usuario esta na pagina inicial do Seu Barriga
    E o usuario clicar no link "Novo Usuario?"
    Quando o usuario preencher o campo nome "annetherezacarvalhoborgesloginseubarrigaittalentqatesteselen"
    E o usuario preencher o campo email "annetherezacarvalhobor@gmail.com"
    E o usuario preencher o campo senha "annetherezacarvalhobor#@12345678"
    E o usuario clicar no botao "Cadastrar"
    Entao o sistema exibe uma mensagem de erro informando que o endereço de email ja esta sendo utilizado "Endereço de email já utilizado"
 #Falha de segurança