package br.com.automationPratice.myStore.steps;

import br.com.automationPratice.myStore.func.CadastrarCliente;
import br.com.automationPratice.myStore.func.EfetuarCompra;
import br.com.automationPratice.myStore.func.EfetuarLogin;
import br.com.automationPratice.myStore.func.Validacao;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class Steps {
	
	CadastrarCliente cadastro = new CadastrarCliente();
	Validacao validacao = new Validacao();
	EfetuarCompra compra = new EfetuarCompra();
	EfetuarLogin login = new EfetuarLogin();
	
	@Dado("que seja acessada a opção de cadastro na aplicação My Store")
	public void que_seja_acessada_a_opção_de_cadastro_na_aplicação_my_store() throws Exception {
		cadastro.acessarCadastro();
	}

	@Quando("o cliente inserir seus dados pessoais com nome: {string}, email: {string}, senha: {string}, data nasc: {string} e sexo: {string}")
	public void o_cliente_inserir_seus_dados_pessoais_com_nome_email_senha_data_nasc_e_sexo(String nome, String email, String senha, String dataNasc, String sexo) throws Exception {
		cadastro.inserirDadosPessoais(nome, email, senha, dataNasc, sexo);
	}

	@Quando("inserir seu dados de endereço como: {string} , {string} , {string}, tel: {string} e alternativo: {string}")
	public void inserir_seu_dados_de_endereço_como_tel_e_alternativo(String endereco, String cidade, String estado, String tel, String endereco_alternativo) throws Exception {
		cadastro.inserirDadosEndereco(endereco, cidade, estado, tel, endereco_alternativo);
	}

	@Quando("a opção register for selecionada")
	public void a_opção_register_for_selecionada() throws Exception {
		cadastro.registrar();
	}

	@Então("o cadastro é efetivado com sucesso")
	public void o_cadastro_é_efetivado_com_sucesso() throws Exception {
		validacao.validarCadastro();
	}
	
	@Dado("que seja efetuado login do cliente {string} com email: {string} e senha: {string} na loja My Store")
	public void que_seja_efetuado_login_do_cliente_com_email_e_senha_na_loja_my_store(String cliente, String email, String senha) throws Exception {
		login.efetuarLogin(email,senha);
	}

	@Quando("o produto {string} for selecionado")
	public void o_produto_for_selecionado(String produto) throws Exception {
		compra.selecionarProduto(produto);
	}

	@Quando("adicionado ao carrinho na quantidade {string}")
	public void adicionado_ao_carrinho_na_quantidade(String quantidade) throws Exception {
		compra.secionarQuantidade(quantidade);
		compra.finalizarCompra();
	}
	
	@Então("a compra será finalizada com sucesso")
	public void a_compra_será_finalizada_com_sucesso() throws Exception {
		validacao.validarCompraEfetivada();
	}


}
