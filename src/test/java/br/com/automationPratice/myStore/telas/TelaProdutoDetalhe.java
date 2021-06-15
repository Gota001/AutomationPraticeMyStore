package br.com.automationPratice.myStore.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.automationPratice.myStore.apoio.FrameSelenium;

public class TelaProdutoDetalhe extends FrameSelenium {
	
	
	final static Log log = LogFactory.getLog(TelaProdutoDetalhe.class);
	
	public void clicarBotaoAddToCart() throws Exception{
		try {
			String xpath = "//button[@class='exclusive']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique no botão 'Add to cart' efetuado com sucesso na tela detalhe produto");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão 'Add to cart' na tela detalhe produto";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}
	
	public void clicarBotaoProceedToCheckout() throws Exception{
		try {
			String xpath = "//a[@class='btn btn-default button button-medium']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique no botão 'Proceed to checkout' efetuado com sucesso");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão 'Proceed to checkout'";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}

	public void inserirQuantidade(String qtd) throws Exception{
		try {
			String xpath = "//input[@id='quantity_wanted']";
			this.aguardarElementoFicarVisivel(xpath);
			this.recuperarElementoByXpath(xpath).clear();
			this.digitaTexto(xpath, qtd);
			log.info("Quantidade de produto selecionada: "+ qtd);
		} catch (Exception e) {
			String erro = "Erro selecionar quantidade do produto";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}

}
