package br.com.automationPratice.myStore.func;

import br.com.automationPratice.myStore.telas.TelaLogin;
import br.com.automationPratice.myStore.telas.TelaMenuInicial;

public class EfetuarLogin {
	
	TelaMenuInicial telaMenu = new TelaMenuInicial();
	TelaLogin telaLogin = new TelaLogin();
	
	public void efetuarLogin(String email, String senha) throws Exception {
		telaMenu.clicarSignIn();
		telaLogin.inserirEmail(email);
		telaLogin.inserirSenha(senha);
		telaLogin.clicarBotaoSignIn();
	}

}
