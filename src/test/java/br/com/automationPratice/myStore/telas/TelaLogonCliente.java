package br.com.automationPratice.myStore.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.automationPratice.myStore.apoio.FrameSelenium;

public class TelaLogonCliente extends FrameSelenium {
	
	
	final static Log log = LogFactory.getLog(TelaLogonCliente.class);
	
	public void pesquisarProduto(String produto) throws Exception{
		try {
			String xpath = "//input[@id='search_query_top']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, produto);
			log.info("Produto pesquisado na  tela logon cliente: "+produto);
		} catch (Exception e) {
			String erro = "Erro ao pesquisar produto na tela logon cliente";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}
	
	public void clicarLupa() throws Exception{
		try {
			String xpath = "//button[@class='btn btn-default button-search']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique na lupa efetuado com sucesso na tela logon cliente");
		} catch (Exception e) {
			String erro = "Erro ao clicar na lupa na tela logon cliente";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}
	
	public void validarCadastroEfetivado() throws Exception {
		String xpath = "//h1[text()='My account']";
		if (this.validaExistenciaElemento(xpath)) {
			log.info("Cliente cadastrado com sucesso");
		} else {
			String erro = "Erro ao cadastrar cliente";
			log.error(erro);
			throw new Exception(erro);
		}

	}

}
