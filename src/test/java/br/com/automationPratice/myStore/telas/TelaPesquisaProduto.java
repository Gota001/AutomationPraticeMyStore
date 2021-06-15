package br.com.automationPratice.myStore.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.automationPratice.myStore.apoio.FrameSelenium;

public class TelaPesquisaProduto extends FrameSelenium {
	
	final static Log log = LogFactory.getLog(TelaPesquisaProduto.class);
	
	public void clicarPrimeiroProdutoLista() throws Exception{
		try {
			String xpath = "(//div[@class='product-image-container']//a)[1]";
			this.aguardarElementoFicarVisivel(xpath);
			String produto = this.recuperarValorPropriedade(xpath, "title");
			this.clicarElementoJS(xpath);
			log.info("Produto selecionado na tela de pesquisa: "+produto);
		} catch (Exception e) {
			String erro = "Erro ao selecionar produto na tela de pesquisa";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}


}
