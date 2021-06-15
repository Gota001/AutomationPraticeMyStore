package br.com.automationPratice.myStore.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.automationPratice.myStore.apoio.FrameSelenium;

public class TelaCheckout extends FrameSelenium {

	final static Log log = LogFactory.getLog(TelaCheckout.class);

	public void aceitarTermosDeServicos() throws Exception {
		try {
			String xpath = "//input[@id='cgv']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Termos de serviços aceitos com sucesso");
		} catch (Exception e) {
			String erro = "Erro ao aceitar termos de serviços";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void clicarPayByBankwire() throws Exception {
		try {
			String xpath = "//a[@class='bankwire']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique no botão 'Pay by Bankwire' efetuado com sucesso na tela checkout");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão 'Pay by Bankwire' na tela checkout";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void clicarIConfirmMyOrder() throws Exception {
		try {
			String xpath = "//button[@class='button btn btn-default button-medium']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique no botão 'I confirm my order' efetuado com sucesso na tela checkout");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão 'I confirm my order' na tela checkout";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void validarCompraEfetivada() throws Exception {
		String xpath = "//strong[text()='Your order on My Store is complete.']";
		if (this.validaExistenciaElemento(xpath)) {
			log.info("Compra efetivada com sucesso");
		} else {
			String erro = "Erro ao efetivar compra";
			log.error(erro);
			throw new Exception(erro);
		}

	}
	
	public void clicarBotaoProceedToCheckout() throws Exception{
		try {
			String xpath = "(//span[contains(text(),'Proceed to checkout')]/..)[2]";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique no botão 'Proceed to checkout' efetuado com sucesso");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão 'Proceed to checkout'";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}
		

}
