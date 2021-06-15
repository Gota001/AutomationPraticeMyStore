package br.com.automationPratice.myStore.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.automationPratice.myStore.apoio.FrameSelenium;

public class TelaMenuInicial extends FrameSelenium {
	
	final static Log log = LogFactory.getLog(TelaMenuInicial.class);
	
	public void clicarSignIn() throws Exception{
		try {
			String xpath = "//a[@class='login']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique em 'sign in' efetuado com sucesso no menu inicial");
		} catch (Exception e) {
			String erro = "Erro ao clicar em 'sign in' no menu inicial";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}

}
