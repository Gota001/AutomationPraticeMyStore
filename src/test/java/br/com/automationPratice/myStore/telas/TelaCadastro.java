package br.com.automationPratice.myStore.telas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.automationPratice.myStore.apoio.DataFormater;
import br.com.automationPratice.myStore.apoio.FrameSelenium;

public class TelaCadastro extends FrameSelenium {

	final static Log log = LogFactory.getLog(TelaCadastro.class);

	public void inserirPrimeiroNome(String nome) throws Exception {
		try {
			nome = nome.substring(0,nome.indexOf(" "));
			String xpath = "//input[@id='customer_firstname']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, nome);
			log.info("Nome inserido na tela cadastro: " + nome);
		} catch (Exception e) {
			String erro = "erro ao inserir nome na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirSobrenome(String nome) throws Exception {
		try {
			nome = nome.substring(nome.indexOf(" ")+1);
			String xpath = "//input[@id='customer_lastname']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, nome);
			log.info("Sobrenome inserido na tela cadastro: " + nome);
		} catch (Exception e) {
			String erro = "erro ao inserir sobrenome na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirEmail(String email) throws Exception {
		try {
			String xpath = "//input[@id='email']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, email);
			log.info("E-mail inserido na tela cadastro: " + email);
		} catch (Exception e) {
			String erro = "erro ao inserir e-mail na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirSenha(String senha) throws Exception {
		try {
			String xpath = "//input[@id='passwd']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, senha);
			log.info("Senha inserida na tela cadastro: " + senha);
		} catch (Exception e) {
			String erro = "erro ao inserir senha na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void selecionarDiaDataNasc(String data) throws Exception {
		try {
			data = data.substring(0, 2);
			String xpath = "//select[@id='days']";
			this.aguardarElementoFicarVisivel(xpath);
			this.realizarSelectItemPorValor(xpath, data);
			log.info("Dia de nascimento selecionado: " + data);
		} catch (Exception e) {
			String erro = "erro ao selecionar dia de nascimento";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void selecionarMesDataNasc(String data1) throws Exception {
		try {
			String data = data1.substring(3, 5);
			if(data.substring(0,1).equals("0")){
				data = data.substring(1);
			}
			String xpath = "//select[@id='months']";
			this.aguardarElementoFicarVisivel(xpath);
			this.realizarSelectItemPorValor(xpath, data);
			log.info("Mês de nascimento selecionado: " + data);
		} catch (Exception e) {
			String erro = "erro ao selecionar mês de nascimento";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void selecionarAnoDataNasc(String data) throws Exception {
		try {
			data = data.substring(6);
			String xpath = "//select[@id='years']";
			this.aguardarElementoFicarVisivel(xpath);
			this.realizarSelectItemPorValor(xpath, data);
			log.info("Mês de nascimento selecionado: " + data);
		} catch (Exception e) {
			String erro = "erro ao selecionar mês de nascimento";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirEndereco(String endereco) throws Exception {
		try {
			String xpath = "//input[@id='address1']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, endereco);
			log.info("Endereço inserido na tela cadastro: " + endereco);
		} catch (Exception e) {
			String erro = "erro ao inserir endereço na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirCidade(String cidade) throws Exception {
		try {
			String xpath = "//input[@id='city']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, cidade);
			log.info("Cidade inserida na tela cadastro: " + cidade);
		} catch (Exception e) {
			String erro = "erro ao inserir cidade na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void selecionarEstado(String estado) throws Exception {
		try {
			String xpath = "//select[@id='id_state']";
			this.aguardarElementoFicarVisivel(xpath);
			this.realizarSelectItemPorTexto(xpath, estado);
			log.info("Estado selecionado: " + estado);
		} catch (Exception e) {
			String erro = "erro ao selecionar estado";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirCodigoPostal(String cep) throws Exception {
		try {
			String xpath = "//input[@id='postcode']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, cep);
			log.info("Codigo postal inserido na tela cadastro: " + cep);
		} catch (Exception e) {
			String erro = "erro ao inserir codigo postal na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirCelular(String celular) throws Exception {
		try {
			String xpath = "//input[@id='phone_mobile']";
			this.aguardarElementoFicarVisivel(xpath);
			this.digitaTexto(xpath, celular);
			log.info("Celular inserido na tela cadastro: " + celular);
		} catch (Exception e) {
			String erro = "erro ao inserir celular na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void inserirEnderecoAlternativo(String endereco) throws Exception {
		try {
			String xpath = "//input[@id='alias']";
			this.aguardarElementoFicarVisivel(xpath);
			this.recuperarElementoByXpath(xpath).clear();
			this.digitaTexto(xpath, endereco);
			log.info("Endereço alternativo inserido na tela cadastro: " + endereco);
		} catch (Exception e) {
			String erro = "erro ao inserir endereço alternativo na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void clicarBotaoRegister() throws Exception {
		try {
			String xpath = "//button[@id='submitAccount']";
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Botão 'Register' clicado com sucesso na tela de cadastro");
		} catch (Exception e) {
			String erro = "erro ao clicar no botão 'Register' na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

	public void selecionarSexo(String sexo) throws Exception {
		String xpath = "";
		switch (sexo) {
		case "M":
			xpath = "//input[@id='id_gender1']";
			break;
		case "F":
			xpath = "//input[@id='id_gender2']";
			break;
		}
		try {
			this.aguardarElementoFicarVisivel(xpath);
			this.clicarElementoJS(xpath);
			log.info("Sexo selecionado com sucesso na tela cadastro");
		} catch (Exception e) {
			String erro = "erro ao selecionar sexo na tela cadastro";
			log.error(erro);
			throw new Exception(erro);
		}

	}

}
