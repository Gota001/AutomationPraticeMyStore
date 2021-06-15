#language: pt
Funcionalidade: Cadastro de clientes no e-commerce My Store 

@CadastroDeCliente
Cenário: Cadastro de cliente válido
	Dado que seja acessada a opção de cadastro na aplicação My Store
	Quando o cliente inserir seus dados pessoais com nome: '<cliente>', email: '<e-mail>', senha: '<senha>', data nasc: '<nascimento>' e sexo: '<sexo>'
	E inserir seu dados de endereço como: '<endereco>' , '<cidade>' , '<estado>', tel: '<telefone>' e alternativo: '<endereco_alternativo>'
	E a opção register for selecionada
	Então o cadastro é efetivado com sucesso
	
	Exemplos:
	| cliente      | e-mail       | senha | nascimento  | sexo | endereco   | cidade | estado  | telefone  | endereco_alternativo    |
	| Jose da Silva| ze3@mail.com | 12345 |  12/02/1990 |  M   | 126 street | Dothan | Alabama | 9453-3432 | 430 Landmark Dr, Dothan |