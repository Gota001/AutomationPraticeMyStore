package br.com.automationPratice.myStore.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.automationPratice.myStore.apoio.FrameSelenium;

public class TelaLogin extends FrameSelenium {
	
	final static Log log = LogFactory.getLog(TelaLogin.class);
	
	public void inserirEmail(String email) throws Exception{
		try {
			String xpath = "//input[@id='email']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, email);
			log.info("E-mail inserido na tela login: "+email);
		} catch (Exception e) {
			String erro = "Erro ao inserir e-mail na tela login";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}

	public void inserirSenha(String senha) throws Exception{
		try {
			String xpath = "//input[@id='passwd']";
			this.aguardarElementoFicarVisivel(senha);
			this.digitaTexto(xpath, senha);
			log.info("Senha inserida na tela login: "+senha);
		} catch (Exception e) {
			String erro = "Erro ao inserir senha na tela login";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}
	
	public void clicarBotaoSignIn() throws Exception{
		try {
			String xpath = "//button[@id='SubmitLogin']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique no botão 'sign in' efetuado com sucesso na tela login");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão 'sign in' na tela login";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}
	
	public void inserirEmailCadastro(String email) throws Exception{
		try {
			String xpath = "//input[@id='email_create']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, email);
			log.info("E-mail inserido para cadastro na tela login: "+email);
		} catch (Exception e) {
			String erro = "Erro ao inserir e-mail para cadastro na tela login";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}
	
	
	public void clicarBotaoCreateAnAccount() throws Exception{
		try {
			Thread.sleep(1000);
			String xpath = "//button[@id='SubmitCreate']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Clique no botão 'Create an account' efetuado com sucesso na tela login");
		} catch (Exception e) {
			String erro = "Erro ao clicar no botão 'Create an account' na tela login";
			log.error(erro);
			throw new Exception(erro);
		}
		
	}

}
