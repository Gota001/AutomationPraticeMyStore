package br.com.automationPratice.myStore.func;

import br.com.automationPratice.myStore.telas.TelaCheckout;
import br.com.automationPratice.myStore.telas.TelaLogonCliente;
import br.com.automationPratice.myStore.telas.TelaPesquisaProduto;
import br.com.automationPratice.myStore.telas.TelaProdutoDetalhe;

public class EfetuarCompra {

	TelaLogonCliente telaLogonCliente = new TelaLogonCliente();
	TelaPesquisaProduto telaPesquisaProduto = new TelaPesquisaProduto();
	TelaProdutoDetalhe telaProdutoDetalhe = new TelaProdutoDetalhe();
	TelaCheckout telaCheckout = new TelaCheckout();
	
	public void selecionarProduto(String produto) throws Exception {
		telaLogonCliente.pesquisarProduto(produto);
		telaLogonCliente.clicarLupa();
		telaPesquisaProduto.clicarPrimeiroProdutoLista();
	}

	public void secionarQuantidade(String quantidade) throws Exception {
		telaProdutoDetalhe.inserirQuantidade(quantidade);
	}

	public void finalizarCompra() throws Exception {
		telaProdutoDetalhe.clicarBotaoAddToCart();
		telaProdutoDetalhe.clicarBotaoProceedToCheckout();
		telaCheckout.clicarBotaoProceedToCheckout();
		telaCheckout.clicarBotaoProceedToCheckout();
		telaCheckout.aceitarTermosDeServicos();
		telaCheckout.clicarBotaoProceedToCheckout();
		telaCheckout.clicarPayByBankwire();
		telaCheckout.clicarIConfirmMyOrder();
	}

}
