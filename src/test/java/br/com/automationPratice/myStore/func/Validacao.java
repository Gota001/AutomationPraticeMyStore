package br.com.automationPratice.myStore.func;

import br.com.automationPratice.myStore.telas.TelaCheckout;
import br.com.automationPratice.myStore.telas.TelaLogonCliente;

public class Validacao {

	TelaLogonCliente telaCliente = new TelaLogonCliente();
	TelaCheckout telaCheckout = new TelaCheckout();
	

	public void validarCadastro() throws Exception {
		telaCliente.validarCadastroEfetivado();
	}

	public void validarCompraEfetivada() throws Exception {
		telaCheckout.validarCompraEfetivada();
		
	}

}
