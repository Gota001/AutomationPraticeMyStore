#language: pt
Funcionalidade: Efetivação de compra no e-commerce My Store 

@EfetivacaoDeCompra
Cenário: Compra de produto com sucesso
	Dado que seja efetuado login do cliente '<cliente>' com email: '<email>' e senha: '<senha>' na loja My Store
	Quando o produto '<produto>' for selecionado
	E adicionado ao carrinho na quantidade '<quantidade>'
	Então a compra será finalizada com sucesso
	
	Exemplos:
	| cliente       | email             | senha  | produto    | quantidade |
	| Jose da Silva | ze1@mail.com      | 12345  |  dress     |   1        |
