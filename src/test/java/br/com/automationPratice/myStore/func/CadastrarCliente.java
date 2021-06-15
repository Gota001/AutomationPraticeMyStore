package br.com.automationPratice.myStore.func;

import br.com.automationPratice.myStore.telas.TelaCadastro;
import br.com.automationPratice.myStore.telas.TelaLogin;
import br.com.automationPratice.myStore.telas.TelaMenuInicial;

public class CadastrarCliente {

	TelaMenuInicial telaMenu = new TelaMenuInicial();
	TelaCadastro telaCadastro = new TelaCadastro();
	TelaLogin telaLogin = new TelaLogin();
	
	public void acessarCadastro() throws Exception {
		telaMenu.clicarSignIn();
	}

	public void inserirDadosPessoais(String nome, String email, String senha, String data, String sexo) throws Exception {
		telaLogin.inserirEmailCadastro(email);
		telaLogin.clicarBotaoCreateAnAccount();
		telaCadastro.inserirPrimeiroNome(nome);
		telaCadastro.inserirSobrenome(nome);
		telaCadastro.inserirSenha(senha);
		telaCadastro.selecionarDiaDataNasc(data);
		telaCadastro.selecionarMesDataNasc(data);
		telaCadastro.selecionarAnoDataNasc(data);
		telaCadastro.selecionarSexo(sexo);
	}

	public void inserirDadosEndereco(String endereco, String cidade, String estado, String tel,
			String endereco_alternativo) throws Exception {
		telaCadastro.inserirEndereco(endereco);
		telaCadastro.inserirCidade(cidade);
		telaCadastro.selecionarEstado(estado);
		telaCadastro.inserirCodigoPostal("00000");
		telaCadastro.inserirCelular(tel);
		telaCadastro.inserirEnderecoAlternativo(endereco_alternativo);
	}

	public void registrar() throws Exception {
		telaCadastro.clicarBotaoRegister();
		
	}

}
